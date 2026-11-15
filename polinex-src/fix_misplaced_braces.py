# -*- coding: utf-8 -*-
"""Rebuild the 4 broken files from pristine + replayed edits, placing the 10
misplaced pxClinit wrapper closes at their correct positions (right before the
owner static block's closing brace).

Approach:
1. Diff pristine vs current -> opcodes (every edit is known).
2. In pristine: compute static-block spans with a clean depth scan.
3. For each bad close: its pristine insertion point Pi -> owner static =
   innermost static span containing Pi. Correct position = before that static's close.
4. Replay opcodes over pristine: copy equals, apply replaces/deletes/inserts,
   SKIP bad closes, and emit wrapper closes before owner static closes.
5. Validate: braces balanced, every break pxClinit inside a wrapper, and the
   only diffs vs the backup are the moved braces.
"""
import sys, io, difflib, re
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8', errors='replace')

BASE = 'D:/Work/OpenPoli/polinex-src/'
FILES = [
    ('pristine/me__octo__client__IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.java',
     'src/main/java/me/octo/client/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.java',
     'backup-pre-bracefix/IllllllllllIIIIlIlllllllllllIllllIlIIIllIIlIIlIIIlIIlIIIlllIlIllIIIIlIIlllIllIlIllIlI.java',
     [6168]),
    ('pristine/me__octo__client__lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.java',
     'src/main/java/me/octo/client/lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.java',
     'backup-pre-bracefix/lIlllIllIllllllIIlIIlllIllllIIlIIlllIlllIlIIIllllIlIIIIlIlIIIIllllIIIIIIlIIlIllIIIIlI.java',
     [3710, 8173, 11870, 14563, 18247]),
    ('pristine/me__octo__client__lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.java',
     'src/main/java/me/octo/client/lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.java',
     'backup-pre-bracefix/lllIlIlIIlIIIIIlllllIlIlIIlIIIIllIlIlllIIllIIlIIlIIllIIllllIIIIIlIIlIlllllllIIlIIlllI.java',
     [2198]),
    ('pristine/me__octo__client__utils__player__lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.java',
     'src/main/java/me/octo/client/utils/player/lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.java',
     'backup-pre-bracefix/lIIllllIIlIIIIllIlIIIIIllIllllllIIIlIlIlIlIllIIlIlIllIlIIIIIIllIIIIlIlllIlIlllIlllIll.java',
     [17432]),
]

def scan_events(lines):
    """(lineno, '{'|'}') with string/char/comment awareness. 1-based lines."""
    src = '\n'.join(lines)
    i, n, lineno = 0, len(src), 1
    while i < n:
        ch = src[i]
        if ch == '\n':
            lineno += 1; i += 1
        elif ch == '"':
            i += 1
            while i < n and src[i] != '"':
                i += 2 if src[i] == '\\' else 1
            i += 1
        elif ch == "'":
            i += 1
            while i < n and src[i] != "'":
                i += 2 if src[i] == '\\' else 1
            i += 1
        elif ch == '/' and i + 1 < n and src[i+1] == '/':
            while i < n and src[i] != '\n':
                i += 1
        elif ch == '/' and i + 1 < n and src[i+1] == '*':
            i += 2
            while i + 1 < n and not (src[i] == '*' and src[i+1] == '/'):
                if src[i] == '\n':
                    lineno += 1
                i += 1
            i += 2
        elif ch in '{}':
            yield lineno, ch
            i += 1
        else:
            i += 1

def static_spans(lines):
    """[(open_line, close_line)] for every 'static {' block, clean depth scan."""
    opens = []
    for k, l in enumerate(lines, 1):
        if re.match(r'\s*static \{\s*$', l):
            opens.append(k)
    spans = []
    for o in opens:
        depth = 0
        for lineno, ch in scan_events(lines):
            if lineno < o:
                continue
            if ch == '{':
                depth += 1
            else:
                depth -= 1
                if depth == 0:
                    spans.append((o, lineno))
                    break
        else:
            raise AssertionError('static at %d never closes' % o)
    return spans

def brace_ok(lines):
    depth = 0
    for _, ch in scan_events(lines):
        depth += 1 if ch == '{' else -1
        if depth < 0:
            return False
    return depth == 0

def main():
    for ppath, cpath, bpath, bad_lines in FILES:
        name = cpath.split('/')[-1][:45]
        p_lines = open(BASE + ppath, encoding='utf-8').read().splitlines()
        c_lines = open(BASE + bpath, encoding='utf-8').read().splitlines()  # broken current (backup)
        bad = set(bad_lines)
        for b in sorted(bad):
            assert c_lines[b-1].strip() == '}', '%s: bad line %d not lone brace: %r' % (name, b, c_lines[b-1])
        sm = difflib.SequenceMatcher(None, p_lines, c_lines)
        opcodes = sm.get_opcodes()
        # map each bad current line -> pristine insertion point (i1 of its insert hunk)
        bad_pi = {}
        for tag, i1, i2, j1, j2 in opcodes:
            if tag == 'insert':
                for j in range(j1, j2):
                    if (j + 1) in bad:
                        bad_pi[j + 1] = i1 + 1  # inserted before pristine line i1+1
        assert len(bad_pi) == len(bad), '%s: bad lines not found in inserts: %s' % (name, bad_pi)
        # owner static for each bad close
        spans = static_spans(p_lines)
        owner_close_lines = {}  # pristine static close line -> count
        for b, pi in sorted(bad_pi.items()):
            candidates = [(o, c) for o, c in spans if o < pi <= c]
            assert candidates, '%s: no static span contains pristine line %d (bad C%d)' % (name, pi, b)
            o, c = min(candidates, key=lambda s: s[1] - s[0])  # innermost
            owner_close_lines[c] = owner_close_lines.get(c, 0) + 1
            print('%s: bad C%d -> pristine insert before P%d -> owner static P%d..P%d' % (name, b, pi, o, c))
        # replay
        out = []
        skipped = 0
        for tag, i1, i2, j1, j2 in opcodes:
            if tag in ('equal', 'insert', 'replace', 'delete'):
                # emit pristine lines that are copied (equal) or replaced (replace deletes them)
                if tag == 'equal':
                    for k in range(i1, i2):
                        if (k + 1) in owner_close_lines:
                            for _ in range(owner_close_lines[k + 1]):
                                indent = re.match(r'\s*', p_lines[k]).group(0)
                                out.append(indent + '}')
                        out.append(p_lines[k])
                elif tag == 'replace':
                    # pristine lines i1..i2 removed; current lines j1..j2 take their place
                    # check none of the removed pristine lines is an owner close
                    for k in range(i1, i2):
                        assert (k + 1) not in owner_close_lines, '%s: owner close P%d inside replace hunk' % (name, k + 1)
                    out.extend(c_lines[j1:j2])
                elif tag == 'delete':
                    for k in range(i1, i2):
                        assert (k + 1) not in owner_close_lines, '%s: owner close P%d inside delete hunk' % (name, k + 1)
                elif tag == 'insert':
                    for j in range(j1, j2):
                        if (j + 1) in bad:
                            skipped += 1
                            continue
                        out.append(c_lines[j])
        assert skipped == len(bad), '%s: skipped %d != bad %d' % (name, skipped, len(bad))
        # validation
        assert brace_ok(out), '%s: braces unbalanced after rebuild' % name
        # every break pxClinit inside a wrapper
        px_lines = set()
        for k, l in enumerate(out, 1):
            if 'pxClinit: {' in l:
                px_lines.add(k)
        warn = 0
        events = list(scan_events(out))
        for k, l in enumerate(out, 1):
            if 'break pxClinit;' in l:
                st = []
                for lineno, ch in events:
                    if lineno > k:
                        break
                    if ch == '{':
                        st.append('PX' if lineno in px_lines else 'B')
                    else:
                        if st:
                            st.pop()
                if 'PX' not in st:
                    print('  WARN: break pxClinit at output line %d outside wrapper' % k)
                    warn += 1
        # diff rebuilt vs broken backup: should show only moved braces
        d = list(difflib.unified_diff(c_lines, out, lineterm='', n=0))
        adds = [l for l in d if l.startswith('+') and not l.startswith('+++')]
        dels = [l for l in d if l.startswith('-') and not l.startswith('---')]
        nonbrace_adds = [l for l in adds if l[1:].strip() != '}']
        nonbrace_dels = [l for l in dels if l[1:].strip() != '}']
        print('%s: rebuilt. bad skipped=%d, wrapper closes inserted=%d, break warns=%d' % (name, skipped, sum(owner_close_lines.values()), warn))
        print('  vs broken: +%d/-%d lines, non-brace adds=%d non-brace dels=%d, total_lines=%d' % (len(adds), len(dels), len(nonbrace_adds), len(nonbrace_dels), len(out)))
        assert not nonbrace_adds and not nonbrace_dels, '%s: unexpected content changes!' % name
        open(BASE + cpath, 'w', encoding='utf-8', newline='\n').write('\n'.join(out) + '\n')
        print('  WRITTEN: %s' % cpath)

if __name__ == '__main__':
    main()
