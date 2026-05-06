# Field Notes

The useful part of this repository is the small rule set around rollout width and route drift.

The domain cases cover `rollout width`, `quota pressure`, `route drift`, and `secret scope`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

The widest spread is between `quota pressure` and `route drift`, so those are the first two cases I would preserve during a refactor.

The local verifier covers this data so the notes stay tied to code.
