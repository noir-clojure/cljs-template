(ns {{name}}.views.main
  (:require [{{name}}.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
         (common/layout
           [:div#content]))
