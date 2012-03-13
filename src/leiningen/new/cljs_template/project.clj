(defproject {{name}} "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.3.0"]
                           [noir-cljs "0.2.3"]
                           [jayq "0.1.0-alpha1"]
                           [fetch "0.1.0-alpha2"]
                           [crate "0.1.0-alpha1"]
                           [noir "1.3.0-alpha10"]]
            :main ^{:skip-aot true} {{name}}.server)
