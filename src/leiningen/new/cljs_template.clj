(ns leiningen.new.cljs-template
    (:require [clojure.java.io :as io])
    (:use leiningen.new.templates))

(def render (renderer "cljs_template"))

(defn cljs-template
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (sanitize name)}]
    (->files data
             [".gitignore" (render "gitignore" data)]
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             ["resources/public/css/reset.css" (render "reset.css" data)]
             ["resources/public/css/default.css" (render "default.css" data)]
             ["src/{{sanitized}}/client/main.cljs" (render "main.cljs" data)]
             ["src/{{sanitized}}/models/user.clj" (render "user.clj" data)]
             ["src/{{sanitized}}/views/common.clj" (render "common.clj" data)]
             ["src/{{sanitized}}/views/main.clj" (render "main.clj" data)]
             ["src/{{sanitized}}/server.clj" (render "server.clj" data)]
             )))
