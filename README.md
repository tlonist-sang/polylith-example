<img src="logo.png" width="30%" alt="Polylith" id="logo">

The Polylith documentation can be found here:

- The [high-level documentation](https://polylith.gitbook.io/polylith)
- The [Polylith Tool documentation](https://github.com/polyfy/polylith)
- The [RealWorld example app documentation](https://github.com/furkan3ayraktar/clojure-polylith-realworld-example-app)

You can also get in touch with the Polylith Team via our [forum](https://polylith.freeflarum.com) or on [Slack](https://clojurians.slack.com/archives/C013B7MQHJQ).

<h1>roly-poly</h1>

<p>Add your workspace documentation here...</p>

## commands
[init project](https://polylith.gitbook.io/poly/workflow/clojure-cli-tool#:~:text=clojure%20%2DTpoly%20create%20entity%20%27%22workspace,Copied!)
```bash
#In .zshrc, add alias cljp "clojure -Tpoly"
clojure -Tpoly create entity '"workspace"' name next-gen top-ns com.my-company
```

### Shell
```bash
clojure -Tpoly shell
```

### Info
```bash
clojure -Tpoly info
```

### Component
```bash
clojure -Tpoly create entity '"component"' name user
#Remember to add paths and/or local/root dependency to dev and project 'deps.edn' files.
```

### Base
```bash
clojure -Tpoly create entity '"base"' name cli
#Remember to add paths and/or local/root dependency to dev and project 'deps.edn' files.
```
A base does NOT have any interface.

### Project
```bash
clojure -Tpoly create entity '"project"' name command-line
#It's recommended to add an alias to :projects in ./workspace.edn for the command-line project.
```

