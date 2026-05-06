# ember-plat-rollout-mesh

`ember-plat-rollout-mesh` keeps a focused Java implementation around platform engineering. The project goal is to package a Java local lab for rollout analysis with deny and allow fixtures, explainable decision traces, and documented operating limits.

## Project Rationale

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how rollout width and route drift should influence a review result.

## Ember Plat Rollout Mesh Review Notes

The first comparison I would make is `quota pressure` against `route drift` because it shows where the rule is most opinionated.

## Feature Set

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/ember-plat-rollout-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `quota pressure` and `route drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Test Command

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Next Improvements

The fixture set is small enough to audit by hand. The next useful expansion is malformed input coverage, not extra surface area.
