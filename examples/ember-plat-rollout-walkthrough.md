# Ember Plat Rollout Mesh Walkthrough

I use this file as a small checklist before changing the Java implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 230 | ship |
| stress | quota pressure | 241 | ship |
| edge | route drift | 142 | ship |
| recovery | secret scope | 198 | ship |
| stale | rollout width | 177 | ship |

Start with `stress` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `quota pressure` against `route drift`, not the raw score alone.
