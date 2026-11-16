"""Reproducible source metrics for the OpenPolinex reconstruction.

Usage: python .analysis/stats.py
Prints one `key=value` per line so numbers quoted in README / CURRENT-STATUS.md
can be regenerated from a clean tree instead of being copied forward.
"""
import os
import re

ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)), '..')
SRC = os.path.join(ROOT, 'polinex-src', 'src', 'main', 'java')


def java_files():
    for dirpath, _dirnames, filenames in os.walk(SRC):
        for fn in filenames:
            if fn.endswith('.java'):
                yield os.path.join(dirpath, fn)


def main():
    files = list(java_files())
    total_lines = 0
    pxdyn_lines = pxdyn_occ = 0
    pxfix = 0
    native_decls = 0
    native_decl_like = 0
    native_files = set()
    stub_throw = 0
    artifact_throw = 0
    for path in files:
        long_path = '\\\\?\\' + os.path.abspath(path)
        try:
            with open(long_path, encoding='utf-8', errors='replace') as fh:
                text = fh.read()
        except FileNotFoundError:
            with open(path, encoding='utf-8', errors='replace') as fh:
                text = fh.read()
        total_lines += text.count('\n')
        n = len(re.findall(r'PXDyn', text))
        if n:
            pxdyn_occ += n
            pxdyn_lines += sum(1 for line in text.splitlines() if 'PXDyn' in line)
        pxfix += text.count('PX-FIX')
        decls = len(re.findall(r'(?<![A-Za-z0-9_])native(?![A-Za-z0-9_])', text))
        if decls:
            native_decls += decls
            native_files.add(path)
        native_decl_like += len(
            re.findall(r'(?<![A-Za-z0-9_])native(?![A-Za-z0-9_])[^;{}\n]*\(', text))
        stub_throw += len(re.findall(r'new\s+\w*Exception\("PX-FIX stub"\)', text))
        artifact_throw += text.count('"decompiler artifact"')
    print('java_files=%d' % len(files))
    print('java_lines=%d' % total_lines)
    print('pxdyn_lines=%d' % pxdyn_lines)
    print('pxdyn_occurrences=%d' % pxdyn_occ)
    print('pxfix_markers=%d' % pxfix)
    print('pxfix_stub_throws=%d' % stub_throw)
    print('decompiler_artifact_throws=%d' % artifact_throw)
    print('native_declarations=%d' % native_decls)
    print('native_files=%d' % len(native_files))
    print('native_decl_like=%d' % native_decl_like)


if __name__ == '__main__':
    main()
