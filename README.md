# multi-module-monolith-fixture

Auto-generated multi-module Gradle project used as a **reproduction fixture**
for performance investigations of the [GitHub Copilot plugin for JetBrains
IDEs](https://github.com/microsoft/copilot-intellij) on large workspaces.

## Shape

- **150** Gradle subprojects: `module-001` ... `module-150`
- **30** trivial Java classes per module (~60 LOC each) — total ~234K Java LOC
- **3** trivial TypeScript files per module
- A few `AGENTS.md` / `CLAUDE.md` files (root + a handful of nested) so the
  custom-instructions discovery code paths are exercised
- Top-level `build.gradle.kts`, `settings.gradle.kts`, `gradle.properties`,
  `tsconfig.json`, `package.json`

There is **no real logic** in any of the generated files. Do not read them
expecting to learn anything.

## Repro instructions

1. Clone this repository.
2. Open the cloned directory as a **Gradle project** in IntelliJ IDEA
   (any modern version, e.g. 2025.2+ / 2026.1).
3. Wait for Gradle import + indexing to fully complete.
4. Install the GitHub Copilot plugin version under test
   (e.g. `1.7.1-242` for baseline, `1.8.x` for comparison).
5. Open Copilot Chat and exercise it (agent mode, a few rounds of
   tool calls — e.g. ask it to summarise modules, read files, etc.).
6. Observe the `copilot-language-server` process:
   - Linux: `htop` / `pidstat -p $(pgrep -f copilot-language-server) 1`
   - Windows: Process Explorer / System Informer
   - macOS: Activity Monitor / `top -pid <pid>`

## How this was generated

This repository was produced by a PowerShell script in the
[`jbws`](https://github.com/jiec-msft/jbws) workspace:

```powershell
.\scripts\new-repro-monolith.ps1 -Modules 150 -ClassesPerModule 30 -WithNestedAgentsMd
```

To regenerate or vary the shape (more modules, larger classes, deeper
nesting, etc.), see the script's parameters.

## License

Public domain. The contents are mechanically generated and not copyrightable
in any meaningful sense.