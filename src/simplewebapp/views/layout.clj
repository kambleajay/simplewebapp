(ns simplewebapp.views.layout
  (:require [hiccup.page :refer [html5 include-css]]))

(defn common [& body]
  (html5
    [:head
     [:title "Welcome to simplewebapp"]
     (include-css "/css/screen.css")]
    [:body body]))
