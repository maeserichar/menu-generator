(ns menu-generator.csv.csv-reader
  (:require [clojure.string :as str])
  (:gen-class))

(defn parse-line
  "Parse a comma separated line and returns its elements"
  [line]
  (if (str/blank? line) () (str/split line #",")))