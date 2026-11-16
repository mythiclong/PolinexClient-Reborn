#!/usr/bin/env python3
from __future__ import annotations
import argparse,hashlib,json,re,subprocess,sys
from datetime import datetime,timezone
from pathlib import Path
ROOT=Path(__file__).resolve().parents[2]
R=ROOT/'.analysis/reports'
OUT=R/'R1906-negative-state-source-map.json'
def sha(p): return hashlib.sha256(p.read_bytes()).hexdigest().upper()
def readj(n): return json.loads((R/n).read_text(encoding='utf-8'))
def main():
 ap=argparse.ArgumentParser(); ap.add_argument('--objdump-input',type=Path,default=R/'R1872-polininex-client-initialized.objdump.txt'); ap.add_argument('--keystream',required=True,type=Path); ns=ap.parse_args()
 if OUT.exists(): raise FileExistsError(OUT)
 started=datetime.now(timezone.utc).isoformat()
 text=ns.objdump_input.read_text(encoding='utf-8',errors='replace')
 ins={}
 for line in text.splitlines():
  m=re.match(r'\s*([0-9a-fA-F]+):\s+(?:(?:[0-9a-fA-F]{2})\s+)+(.+)$',line)
  if m: ins[int(m.group(1),16)]=' '.join(m.group(2).lower().split())
 def need(instructions,a,s):
  got=instructions.get(a,'')
  if s.lower() not in got: raise AssertionError(f'0x{a:x}: wanted {s}, got {got}')
 calls={x['call_site']:x['jni_function'] for x in readj('R1881-client-initialized-all-jni-calls.json')['calls']}
 trans=readj('R1883-client-initialized-dispatch-map.json')['transitions']
 corr={x['transition_site']:x for x in readj('R1885-client-initialized-dispatch-path-correction.json')['transitions']}
 expected=[
  ('0x180043f5e',-9,'state21-helper-pending-runtimeexception','0x180043f13','0x180043f34','0x180043f44'),
  ('0x180044a58',-10,'state7-f-array-helper-runtimeexception','0x180044a0d','0x180044a2e','0x180044a3e'),
  ('0x180044ad7',-10,'state-minus11-newintarray-runtimeexception','0x180044a8b','0x180044aad','0x180044abd'),
  ('0x180044b56',-9,'state5-runtimeexception-allocation-error','0x180044b16','0x180044b28','0x180044b3c'),
  ('0x180044c93',-10,'state-minus11-setter-runtimeexception','0x180044c48','0x180044c69','0x180044c79'),
  ('0x180044cb8',-10,'state-minus11-guard-equality','', '', ''),
  ('0x180044d75',-9,'state5-newstring-runtimeexception','0x180044d35','0x180044d47','0x180044d5b'),
  ('0x180044daf',-9,'state17-repeated-runtimeexception-check','0x180043e4e','0x180044d80','0x180044d95'),
  ('0x180044e47',-9,'state21-throw-result-runtimeexception','0x180044dfc','0x180044e1d','0x180044e2d'),
  ('0x180044eca',-9,'state5-constructor-runtimeexception','0x180044e89','0x180044e9c','0x180044eb0'),
  ('0x180044f1c',-9,'state5-explicit-throw-runtimeexception','0x180044edc','0x180044eee','0x180044f02'),
 ]
 expected_sites={x[0] for x in expected}
 observed={x['transition_site']:x['decoded_state_signed'] for x in trans if x['decoded_state_signed'] in (-9,-10)}
 assert observed=={x[0]:x[1] for x in expected},(observed,expected)
 rows=[]
 for site,state,origin,occurred,instance,clear in expected:
  assert corr[site]['effective_route']['target']=='0x1800460a2'
  if clear:
   assert calls[occurred]=='ExceptionOccurred' and calls[instance]=='IsInstanceOf' and calls[clear]=='ExceptionClear'
   need(ins,int(clear,16),'callq *0x88(')
  else:
   # Equal guard goes through -10 without an observed Java exception; mismatch goes to state 4.
   need(ins,0x180044ca9,'jne 0x180044cbd')
   assert calls['0x180044a68']=='NewIntArray'
  rows.append({'transition_site':site,'state':state,'origin':origin,'exception_occurred':occurred or None,'runtimeexception_test':instance or None,'exception_clear':clear or None,'dispatcher_target':'0x1800460a2','source_outcome':'clear RuntimeException then enter common relay' if clear else 'guard equality enters relay with R12 still holding the int[]; static keystream predicts the opposite branch, live global value unobserved'})
 # Validate the major short-circuit semantics around each producer.
 for site,func in [('0x180044a77','ExceptionCheck'),('0x180044c38','ExceptionCheck'),('0x180044b02','ExceptionCheck'),('0x180044d21','ExceptionCheck'),('0x180044e79','ExceptionCheck')]: assert calls[site]==func
 need(ins,0x180044a01,'je 0x180044b95'); need(ins,0x180044a82,'je 0x180044c05')
 need(ins,0x180044c40,'je 0x180044c98'); need(ins,0x180044b0d,'je 0x180044ccf')
 need(ins,0x180044d2c,'je 0x180044e4c'); need(ins,0x180044e87,'je 0x180044ecf')
 # Repeated IsInstanceOf on the state-17 fallback is observed, not simplified away.
 need(ins,0x180043e7c,'je 0x180044d7a'); need(ins,0x180044d80,'callq *0x100(%r9)')
 # The native state-8 guard's derived value is an expectation only, not a live-buffer measurement.
 ks=ns.keystream.read_bytes(); guard=int.from_bytes(ks[0x8fb1:0x8fb5],'little')
 assert guard==0x90584005
 r1905=readj('R1905-state7-exception-edges.json')
 assert len(r1905['negative_state_relay']['transitions'])==len(expected)
 source=ROOT/'polinex-src/src/main/java/me/octo/client/Polinex.java'
 report={'slice_id':'R1906-negative-state-source-map','source_baseline_commit':subprocess.check_output(['git','rev-parse','HEAD'],cwd=ROOT,text=True).strip(),'worktree':str(ROOT).replace('\\','/'),'branch':subprocess.check_output(['git','branch','--show-current'],cwd=ROOT,text=True).strip(),'source_files_sha256':{'polinex-src/src/main/java/me/octo/client/Polinex.java':sha(source)},'probe_status':'static-only; no client, game, keyboard, mouse, or server interaction','started_utc':started,'commands':{'verifier_argv':[sys.executable,'-B',*sys.argv],'exit_code':0,'prior_tool_attempts':[{'exit_code':1,'error':'TypeError: need() takes 2 positional arguments but 3 were given; verifier helper signature corrected.'},{'exit_code':1,'error':'KeyError for 0x180044e8d; corrected exception call site to 0x180044e89 based on R1872/R1881.'}]},'inputs_sha256':{n:sha(R/n) for n in ['R1872-polininex-client-initialized.objdump.txt','R1881-client-initialized-all-jni-calls.json','R1883-client-initialized-dispatch-map.json','R1885-client-initialized-dispatch-path-correction.json','R1905-state7-exception-edges.json']}|{'derived_keystream':sha(ns.keystream)},'negative_state_edges':rows,'assertions':{'all_11_state_minus9_minus10_transitions_classified':True,'all_exceptional_edges_clear_only_runtimeexception_before_dispatch':True,'all_11_edges_share_0x1800460a2':True,'state17_duplicate_type_check_preserved':True,'minus11_equal_guard_kept_open':True},'acceptance':{'static_reconstruction':'passed for all negative-state transition sources in the captured dispatcher map','build_regression':'not run; no source changed','direct_runtime_probe':'not run','normal_user_path':'not run; event entry remains native','vanilla_comparison':'not run','real_server':'not run'},'limits':'The -10 guard-equality path carries an int[] in R12 and remains unexplained; the static keystream value is not a runtime observation. Other positive-state startup behavior and side effects remain open.','ended_utc':datetime.now(timezone.utc).isoformat(),'exit_code':0}
 OUT.write_text(json.dumps(report,ensure_ascii=False,indent=2)+'\n',encoding='utf-8')
 print(json.dumps({'output':str(OUT),'negative_transitions':len(rows),'classified_exception_paths':sum(bool(x['exception_clear']) for x in rows),'guard_path_open':True,'exit_code':0},ensure_ascii=False))
 return 0
if __name__=='__main__': raise SystemExit(main())
