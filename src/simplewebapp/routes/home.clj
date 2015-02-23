(ns simplewebapp.routes.home
  (:require [compojure.core :refer :all]
            [simplewebapp.views.layout :as layout]
            [clojure.data.json :as json]))

(defn home []
  (layout/common [:h1 "Hello World!"]))

(defn get-json []
  (json/read-str (slurp "/Users/ajay/Desktop/nanoobj.json")))

(defn json []
  (layout/common
    (let [nano-json (get-json)]
      [:div (str (get-in nano-json ["NANOOBJECT" "ITEM" "NAMES" "NAME"]))])))

(defroutes home-routes
  (GET "/" [] (home))
  (GET "/json" [] (json)))
