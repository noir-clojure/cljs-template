(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://exampl.com/FIXME"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [noir-cljs "0.3.0"]
                 [jayq "0.1.0-alpha1"]
                 [fetch "0.1.0-alpha2"]
                 [crate "0.1.0-alpha3"]
                 [noir "1.3.0-beta2"]]
  :cljsbuild {:builds [{}]}
  :main ^{:skip-aot true} {{name}}.server)
