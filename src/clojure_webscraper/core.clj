(ns clojure-webscraper.core
  (
    (:gen-class)
    (:require
    [net.cgrand.enlive-html :as html]
    [org.httpkit.client :as http])))


; Fetch HTML Response
(defn get-dom
  []
  (html/html-snippet
    (:body @(http/get "http://kat.cr/tv/" {:insecure? true}))))


; Main Function
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
