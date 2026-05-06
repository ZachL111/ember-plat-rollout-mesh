# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 230, lane `ship`
- `stress`: `quota pressure`, score 241, lane `ship`
- `edge`: `route drift`, score 142, lane `ship`
- `recovery`: `secret scope`, score 198, lane `ship`
- `stale`: `rollout width`, score 177, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
