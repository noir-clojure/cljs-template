(ns {{name}}.client.main
  (:require [noir.cljs.client.watcher :as watcher]
            [clojure.browser.repl :as repl]
            [crate.core :as crate])
  (:use [jayq.core :only [$ append]])
  (:use-macros [crate.def-macros :only [defpartial]]))

;;************************************************
;; Dev stuff
;;************************************************

(watcher/init)
;;(repl/connect "http://localhost:9000/repl")

;;************************************************
;; Code
;;************************************************

(def $content ($ :#content))

(defpartial up-and-running []
  [:p.alert "CLJS is compiled and active... Time to build something!"])

(append $content (up-and-running))

