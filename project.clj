(defproject lt.tokenmill/docx-utils "1.0.8"
  :description "Library to transform .docx documents."
  :url "https://github.com/tokenmill/docx-utils"
  :license {:name "MIT License"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/tools.logging "1.1.0"]
                 [org.apache.xmlbeans/xmlbeans "3.1.0"]

                 [org.apache.poi/poi "4.1.2"]
                 [org.apache.poi/poi-ooxml "4.1.2"]
                 [org.apache.poi/ooxml-schemas "1.4"]
                 [org.apache.poi/poi-ooxml-schemas "4.1.2"]]
  :aot [docx-utils.schema]
  :plugins [[lein-codox "0.10.3"]]
  :resource-paths ["resources"]
  :profiles {:dev {:resource-paths ["test/resources"]}
             :repl {:resource-paths ["test/resources"]}})
