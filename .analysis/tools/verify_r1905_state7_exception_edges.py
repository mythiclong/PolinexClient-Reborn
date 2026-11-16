#!/usr/bin/env python3
from __future__ import annotations
import argparse, hashlib, json, re, subprocess, sys
from datetime import datetime, timezone
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
REPORTS = ROOT / '.analysis' / 'reports'
OUTPUT = REPORTS / 'R1905-state7-exception-edges.json'
DUMP_OUTPUT = REPORTS / 'R1905-exception-helpers.objdump.txt'
BASE = 0x180000000
IMAGE_DELTA = 0x1600

def sha(path: Path) -> str:
    return hashlib.sha256(path.read_bytes()).hexdigest().upper()

def load_json(name: str) -> dict:
    return json.loads((REPORTS / name).read_text(encoding='utf-8'))

def parse_instructions(text: str) -> dict[int, str]:
    out = {}
    for line in text.splitlines():
        m = re.match(r'\s*([0-9a-fA-F]+):\s+(?:(?:[0-9a-fA-F]{2})\s+)+(.+)$', line)
        if m:
            out[int(m.group(1), 16)] = ' '.join(m.group(2).lower().split())
    return out

def need(ins: dict[int, str], address: int, fragment: str) -> str:
    got = ins.get(address, '')
    if fragment.lower() not in got:
        raise AssertionError(f'0x{address:x}: expected {fragment!r}, got {got!r}')
    return got

def decode(pe: bytes, stream: bytes, va: int, key_offset: int, length: int) -> bytes:
    offset = va - BASE - IMAGE_DELTA
    raw = pe[offset:offset + length]
    key = stream[key_offset:key_offset + length]
    if len(raw) != length or len(key) != length:
        raise AssertionError('truncated PE/keystream input')
    return bytes(a ^ b for a, b in zip(raw, key))

def main() -> int:
    ap = argparse.ArgumentParser()
    ap.add_argument('--pe', required=True, type=Path)
    ap.add_argument('--keystream', required=True, type=Path)
    ap.add_argument('--objdump', required=True, type=Path)
    args = ap.parse_args()
    started = datetime.now(timezone.utc).isoformat()
    if OUTPUT.exists() or DUMP_OUTPUT.exists():
        raise FileExistsError('refusing to overwrite existing R1905 evidence')
    for name in ['R1881-client-initialized-all-jni-calls.json','R1883-client-initialized-dispatch-map.json','R1885-client-initialized-dispatch-path-correction.json','R1895-state7-constructor-bytecode.json','R1874-polinex-exception-identity-helper.json','R1904a-verifier-rerun.json']:
        if not (REPORTS / name).is_file(): raise FileNotFoundError(REPORTS / name)

    dump_path = REPORTS / 'R1872-polininex-client-initialized.objdump.txt'
    dump_text = dump_path.read_text(encoding='utf-8', errors='replace')
    ins = parse_instructions(dump_text)
    jni = load_json('R1881-client-initialized-all-jni-calls.json')
    calls = {x['call_site']: x for x in jni['calls']}
    state7 = load_json('R1895-state7-constructor-bytecode.json')
    mappings = state7['mappings']
    assert len(mappings) == 15
    constructor_edges = []
    for i, item in enumerate(mappings):
        alloc = int(item['allocation_call'], 16)
        ctor = int(item['constructor_call'], 16)
        next_alloc = int(mappings[i + 1]['allocation_call'], 16) if i + 1 < len(mappings) else 0x1800449ee
        assert calls[f"0x{alloc:x}"]['jni_function'] == 'AllocObject'
        assert calls[f"0x{ctor:x}"]['jni_function'] == 'CallNonvirtualVoidMethod'
        alloc_checks = [int(k,16) for k,v in calls.items() if v['jni_function']=='ExceptionCheck' and alloc < int(k,16) < ctor]
        ctor_checks = [int(k,16) for k,v in calls.items() if v['jni_function']=='ExceptionCheck' and ctor < int(k,16) < next_alloc]
        assert len(alloc_checks)==1 and len(ctor_checks)==1, (item['class'], alloc_checks, ctor_checks)
        edge = {'class': item['class'], 'descriptor': item['descriptor'], 'alloc_object': f'0x{alloc:x}', 'alloc_exception_check': f'0x{alloc_checks[0]:x}', 'constructor_call': f'0x{ctor:x}', 'constructor_exception_check': f'0x{ctor_checks[0]:x}', 'exception_route': 'pending exception branches directly to epilogue 0x18004610e; no ExceptionOccurred/ExceptionClear on this edge'}
        for check in alloc_checks + ctor_checks:
            assert calls[f'0x{check:x}']['jni_function']=='ExceptionCheck'
            need(ins, check+6, 'test %al,%al')
            need(ins, check+8, 'jne 0x18004610e')
        constructor_edges.append(edge)

    prechecks = []
    for call, next_check, kind in [(0x180044316,0x180044321,'GetStaticObjectField'),(0x18004434f,0x180044357,'CallObjectMethod')]:
        assert calls[f'0x{call:x}']['jni_function']==kind
        assert calls[f'0x{next_check:x}']['jni_function']=='ExceptionCheck'
        need(ins,next_check+6,'test %al,%al'); need(ins,next_check+8,'jne 0x18004610e')
        prechecks.append({'call':f'0x{call:x}','jni_function':kind,'exception_check':f'0x{next_check:x}','exception_route':'pending exception returns from event entry'})

    assert calls['0x1800449ee']['jni_function']=='CallStaticObjectMethod'
    assert calls['0x1800449f9']['jni_function']=='ExceptionCheck'
    need(ins,0x1800449ff,'test %al,%al'); need(ins,0x180044a01,'je 0x180044b95')
    assert calls['0x180044a0d']['jni_function']=='ExceptionOccurred'
    assert calls['0x180044a2e']['jni_function']=='IsInstanceOf'
    need(ins,0x180044a10,'mov %rax,%r12'); need(ins,0x180044a32,'je 0x18004610e')
    assert calls['0x180044a3e']['jni_function']=='ExceptionClear'
    trans = load_json('R1883-client-initialized-dispatch-map.json')['transitions']
    trans_corr = {x['transition_site']:x for x in load_json('R1885-client-initialized-dispatch-path-correction.json')['transitions']}
    state10 = next(x for x in trans if x['transition_site']=='0x180044a58')
    assert state10['decoded_state_signed']==-10 and trans_corr['0x180044a58']['effective_route']['target']=='0x1800460a2'

    # Null f()[I output creates a one-element array and stores it through nested b([I)V.
    assert calls['0x180044a68']['jni_function']=='NewIntArray'
    assert calls['0x180044a77']['jni_function']=='ExceptionCheck'
    need(ins,0x180044a6e,'mov %rax,%r12'); need(ins,0x180044a82,'je 0x180044c05')
    assert calls['0x180044a8b']['jni_function']=='ExceptionOccurred'
    assert calls['0x180044aad']['jni_function']=='IsInstanceOf'
    need(ins,0x180044ab1,'je 0x18004610e')
    assert calls['0x180044abd']['jni_function']=='ExceptionClear'
    assert next(x for x in trans if x['transition_site']=='0x180044ad7')['decoded_state_signed']==-10
    assert calls['0x180044c30']['jni_function']=='CallStaticVoidMethod'
    assert calls['0x180044c38']['jni_function']=='ExceptionCheck'
    need(ins,0x180044c2d,'mov %r12,%r9')
    need(ins,0x180044c40,'je 0x180044c98')
    assert calls['0x180044c48']['jni_function']=='ExceptionOccurred'
    assert calls['0x180044c69']['jni_function']=='IsInstanceOf'
    need(ins,0x180044c6d,'je 0x18004610e')
    assert calls['0x180044c79']['jni_function']=='ExceptionClear'
    assert next(x for x in trans if x['transition_site']=='0x180044c93')['decoded_state_signed']==-10
    assert next(x for x in trans if x['transition_site']=='0x180044cb8')['decoded_state_signed']==-10
    assert next(x for x in trans if x['transition_site']=='0x180044cca')['decoded_state_signed']==4
    need(ins,0x180044b9f,'je 0x180044db4'); need(ins,0x180044dc1,'xor %r12d,%r12d')
    assert next(x for x in trans if x['transition_site']=='0x180044dc4')['decoded_state_signed']==-11

    # Freshly dump the owner/class/method/throw helpers used by the common -9/-10 relay.
    ranges=[(0x18004180d,0x1800418b0),(0x180046281,0x180046323),(0x180046323,0x1800463c2),(0x18001f4f2,0x18001f594)]
    subcommands=[]; pieces=[]
    for lo,hi in ranges:
        cmd=[str(args.objdump),'-d',f'--start-address=0x{lo:x}',f'--stop-address=0x{hi:x}',str(args.pe)]
        p=subprocess.run(cmd,text=True,capture_output=True)
        if p.returncode: raise RuntimeError(f'objdump exit {p.returncode}: {p.stderr}')
        pieces.append(p.stdout); subcommands.append({'argv':cmd,'exit_code':p.returncode,'stdout_sha256':hashlib.sha256(p.stdout.encode()).hexdigest().upper()})
    helper_dump='\n'.join(pieces)
    helper_ins=parse_instructions(helper_dump)
    need(helper_ins,0x180041879,'callq *%rax'); need(helper_ins,0x180041884,'callq *0xa8(%r8)')
    need(helper_ins,0x1800462ea,'callq *%rax'); need(helper_ins,0x1800462f5,'callq *0xa8(%r8)')
    need(helper_ins,0x1800463b4,'callq *%rdi')
    pe=args.pe.read_bytes(); stream=args.keystream.read_bytes()
    owner=decode(pe,stream,0x18015dd99,0x3a1b7,22).decode('ascii')
    exception_class=decode(pe,stream,0x18015ea48,0x3a7f6,26).decode('ascii')
    method=bytes([stream[0x3a38c]^0x98]).decode('ascii')
    descriptor=decode(pe,stream,0x18015ea63,0x3a38d,44).decode('ascii')
    assert owner=='me/octo/client/Polinex'
    assert exception_class=='java/lang/RuntimeException'
    assert method=='a' and descriptor=='(Ljava/lang/Exception;)Ljava/lang/Exception;'
    assert calls['0x1800460cb']['jni_function']=='CallStaticObjectMethod'
    need(ins,0x1800460a5,'mov 0x390(%rax),%rbx')
    need(ins,0x1800460af,'callq 0x18004180d')
    need(ins,0x1800460ba,'callq 0x180046323')
    need(ins,0x1800460c2,'mov %rdi,%rdx'); need(ins,0x1800460c5,'mov %rax,%r8'); need(ins,0x1800460c8,'mov %r12,%r9')
    assert calls['0x1800460d6']['jni_function']=='ExceptionCheck'
    need(ins,0x1800460de,'jne 0x18004610e')
    need(ins,0x1800460e3,'test %rdi,%rdi'); need(ins,0x1800460e6,'je 0x1800460f3')
    assert calls['0x1800460ee']['jni_function']=='Throw'
    assert calls['0x18004610c']['jni_function']=='ThrowNew'
    need(ins,0x1800460fa,'callq 0x18001f4f2'); need(ins,0x18004610c,'callq *%rdi')

    negative=[]
    for t in trans:
        if t['decoded_state_signed'] in (-9,-10):
            c=trans_corr[t['transition_site']]
            assert c['effective_route']['target']=='0x1800460a2'
            negative.append({'transition_site':t['transition_site'],'state':t['decoded_state_signed'],'relay_target':c['effective_route']['target']})
    assert negative
    r1874=load_json('R1874-polinex-exception-identity-helper.json')
    assert r1874['method']['owner']=='me.octo.client.Polinex' and r1874['method']['name']=='a'
    assert r1874['method']['descriptor']==descriptor
    assert 'returns the same Exception reference' in r1874['static_reconstruction']['semantics']
    r1904a=load_json('R1904a-correction.json')
    assert r1904a['rerun_assertions']['state21_null_return_uses_ThrowNew_not_state8']

    DUMP_OUTPUT.write_text(helper_dump,encoding='utf-8')
    source=ROOT/'polinex-src/src/main/java/me/octo/client/Polinex.java'
    input_names=['R1872-polininex-client-initialized.objdump.txt','R1874-polinex-exception-identity-helper.json','R1881-client-initialized-all-jni-calls.json','R1883-client-initialized-dispatch-map.json','R1885-client-initialized-dispatch-path-correction.json','R1895-state7-constructor-bytecode.json','R1904a-correction.json']
    report={
      'slice_id':'R1905-state7-exception-edges-and-negative-relay',
      'source_baseline_commit':subprocess.check_output(['git','rev-parse','HEAD'],cwd=ROOT,text=True).strip(),
      'worktree':str(ROOT).replace('\\','/'),'branch':subprocess.check_output(['git','branch','--show-current'],cwd=ROOT,text=True).strip(),
      'source_files_sha256':{'polinex-src/src/main/java/me/octo/client/Polinex.java':sha(source)},
      'probe_status':'static-only; no client, game, keyboard, mouse, or server interaction',
      'started_utc':started,
      'commands':{'verifier_argv':[sys.executable,'-B',*sys.argv], 'objdump':subcommands,'exit_code':0},
      'inputs_sha256':{name:sha(REPORTS/name) for name in input_names}|{'native_pe':sha(args.pe),'derived_keystream':sha(args.keystream),'source_jar':sha(Path(r'D:\Work\OpenPoli\.analysis\cracked.jar')),'verifier':sha(Path(__file__))},
      'state7':{'preconstructor_checks':prechecks,'constructor_count':len(mappings),'constructor_exception_edges':constructor_edges,'all_30_alloc_and_constructor_exception_checks_return_pending_exception':True,'f_array_exception':'ExceptionOccurred -> IsInstanceOf(java/lang/RuntimeException); nonmatch returns pending; match ExceptionClear then state -10; no-exception path tests result and null routes through state -11'},
      'state_minus11':{'null_f_array_path':'sets R12=0 and dispatches state -11','new_int_array':'NewIntArray(1); result stored in R12','setter':'nested b([I)V receives array as first Java argument; lazy GetStaticMethodID path republishes cache before retry','allocation_and_setter_runtimeexception':'ExceptionOccurred -> IsInstanceOf(java/lang/RuntimeException); nonmatch returns pending; match clears and routes -10','successful_guard':'derived +0x8fb1 value 0x90584005 differs from 0xf7ee810a, so static expected route is state 4; live global value not observed','guard_equal_caveat':'equality branch routes -10 while R12 still contains the int[]; keep this uncommon/invalid-looking path open until runtime global-state semantics are known'},
      'negative_state_relay':{'transition_count':len(negative),'transitions':negative,'jni_call':'CallStaticObjectMethod(env, Polinex class, methodID a(Ljava/lang/Exception;)Ljava/lang/Exception;, R12)','decoded_owner':owner,'decoded_runtimeexception_class':exception_class,'identity_native_behavior':'returns the same Exception reference, including null; no other side effect','pending_from_helper':'return from event entry with pending exception','nonnull_result':'JNI Throw(result), then return','null_result':'ThrowNew(java/lang/NullPointerException, message_pointer=0x18013a82d), then return','runtime_message':'not directly observed; static PE bytes start with NUL','helper_dump_file':str(DUMP_OUTPUT.relative_to(ROOT)).replace('\\','/'),'helper_dump_sha256':hashlib.sha256(helper_dump.encode()).hexdigest().upper()},
      'assertions':{'15_constructor_pairs_matched_R1895_and_R1881':True,'30_constructor_checks_branch_to_epilogue':True,'all_negative_dispatch_states_route_to_common_relay':True,'relay_class_method_and_argument_registers_decoded':True,'state7_and_state_minus11_exception_edges_match_raw_disassembly':True},
      'acceptance':{'static_reconstruction':'passed for all state-7 allocation/constructor exception edges, final array-helper exception dispatch, state -11 allocation/setter edges, and common -9/-10 JNI relay','build_regression':'not run; no source changed','direct_runtime_probe':'not run','normal_user_path':'not run; E_CLIENT_INITIALIZED remains native','vanilla_comparison':'not run','real_server':'not run'},
      'limits':'Static global/keystream-derived guard values are not live native-buffer observations. The state -11 equal-guard path remains open; other native initializer transitions and startup side effects are not fully restored.',
      'ended_utc':datetime.now(timezone.utc).isoformat(),'exit_code':0}
    report['outputs_sha256']={'R1905-exception-helpers.objdump.txt':sha(DUMP_OUTPUT)}
    OUTPUT.write_text(json.dumps(report,ensure_ascii=False,indent=2)+'\n',encoding='utf-8')
    print(json.dumps({'output':str(OUTPUT),'constructor_count':len(mappings),'constructor_exception_checks':len(constructor_edges)*2,'negative_states':len(negative),'owner':owner,'exception_class':exception_class,'identity_method':method+descriptor,'exit_code':0},ensure_ascii=False))
    return 0

if __name__=='__main__':
    raise SystemExit(main())
