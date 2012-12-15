(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://exampl.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [noir-cljs "0.3.7"]
                 [jayq "1.0.0"]
                 [fetch "0.1.0-alpha2" :exclusions [org.clojure/clojure]]
                 [crate "0.2.3"]
                 [noir "1.3.0"]]
  :cljsbuild {:builds [{}]}
  :main ^{:skip-aot true} {{name}}.server)
