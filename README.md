# cljs-template

A Leiningen template for Noir + ClojureScript projects.

**NOTE** cljs-template >= 0.1.5 uses the latest hiccup. For old hiccup, use 0.1.4.

## Installation

### Leiningen 1.x

You'll need both [lein-newnew](https://github.com/Raynes/lein-newnew) and cljs-template.

```bash
lein plugin install lein-newnew 0.2.6
lein plugin install cljs-template 0.1.5
```
### Leiningen 2.x

There's nothing to install: As of preview3, templates are automatically fetched
when first used.

## Usage

```bash
lein new cljs-template my-awesome-project
```
You now have a complete ClojureScript app, nothing more needed :)

## License

Copyright © 2012 Chris Granger

Distributed under the Eclipse Public License, the same as Clojure.
