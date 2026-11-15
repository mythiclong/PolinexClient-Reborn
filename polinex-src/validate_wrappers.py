# -*- coding: utf-8 -*-
"""Validate pxClinit wrapper pairing: each break pxClinit must be inside a pxClinit block;
report where each pxClinit block opens and closes, and each static block close."""
import sys, io
sys.stdout = io.TextIOWrapper(sys.stdout.buffer, encoding='utf-8', errors='replace')

def scan(path):
    src = open(path, encoding='utf-8').read()
    lines = src.split('\n')
    # token stream of significant events: (lineno, kind, text)
    events = []
    i, n = 0, len(src)
    lineno = 1
    cur_line_tokens = []  # (kind, text) for current line, reset on newline
    line_has_code = False
    while i < n:
        ch = src[i]
        if ch == '\n':
            lineno += 1
            i += 1
        elif ch == '"':
            start = i
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
        elif ch == '{':
            # look back at current line text so far to classify
            line_txt = lines[lineno-1] if lineno-1 < len(lines) else ''
            prefix = line_txt[:line_txt.index('{', max(0, line_txt.rfind('}')+1)) if '{' in line_txt else 0] if False else line_txt
            if 'pxClinit' in line_txt.split('{')[0]:
                kind = 'PX'
            elif 'static' in line_txt.split('{')[0] and line_txt.strip().startswith('static'):
                kind = 'STATIC'
            else:
                kind = 'BLOCK'
            events.append((lineno, 'OPEN', kind))
            i += 1
        elif ch == '}':
            events.append((lineno, 'CLOSE', None))
            i += 1
        elif ch == ';':
            line_txt = lines[lineno-1] if lineno-1 < len(lines) else ''
            if 'break pxClinit' in line_txt and 'BREAKPX' not in [e[2] for e in events if e[0] == lineno and e[1] == 'BREAKPX']:
                events.append((lineno, 'BREAKPX', None))
            i += 1
        else:
            i += 1
    # replay
    stack = []  # (kind, open_line)
    problems = []
    px_blocks = []  # (open_line, close_line)
    static_blocks = []
    for lineno, ev, kind in events:
        if ev == 'OPEN':
            stack.append((kind, lineno))
            if kind == 'STATIC':
                static_blocks.append([lineno, None])
        elif ev == 'CLOSE':
            if not stack:
                problems.append('CLOSE with empty stack at line %d' % lineno)
                continue
            k, ol = stack.pop()
            if k == 'PX':
                px_blocks.append((ol, lineno))
            if k == 'STATIC':
                for sb in reversed(static_blocks):
                    if sb[1] is None:
                        sb[1] = lineno
                        break
        elif ev == 'BREAKPX':
            if not any(k == 'PX' for k, _ in stack):
                problems.append('break pxClinit OUTSIDE wrapper at line %d (stack top: %s)' % (lineno, stack[-1] if stack else None))
    for k, ol in stack:
        problems.append('UNCLOSED %s opened at line %d' % (k, ol))
    return problems, px_blocks, static_blocks

if __name__ == '__main__':
    for path in sys.argv[1:]:
        print('=== %s ===' % path.split('/')[-1][:60])
        problems, px_blocks, static_blocks = scan(path)
        for p in problems:
            print('  PROBLEM: ' + p)
        if not problems:
            print('  OK: all breaks inside wrappers, stack balanced')
        print('  pxClinit blocks: %d, static blocks: %d' % (len(px_blocks), len(static_blocks)))
