(defproject clojure-webscraper "0.0.1"
  :description "An attempt at http://masnun.com/2016/03/20/web-scraping-with-clojure.html"
  :url "http://github.com/ashellwig/clojure-webscraper"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [enlive "1.1.6"]
                 [http-kit "2.1.18"]]
  :main ^:skip-aot clojure-webscraper.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
