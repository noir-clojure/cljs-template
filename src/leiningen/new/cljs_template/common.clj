(ns {{name}}.views.common
  (:require [noir.cljs.core :as cljs])
  (:use [noir.core :only [defpartial]]
        [hiccup.page :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "{{name}}"]
               (include-css "/css/reset.css")
               (include-css "/css/default.css")]
              [:body
               [:div#wrapper
                content]
               (cljs/include-scripts :with-jquery)]))
