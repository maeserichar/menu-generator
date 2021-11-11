(ns menu-generator.csv.csv-reader-test
  (:require [clojure.test :refer :all]
            [menu-generator.csv.csv-reader :refer :all]))

(deftest line-parsing
  (testing "Parsing a line returns the expected number of fields"
    (is (= (count (parse-line "patata, 3, hola")) 3))
    (is (= (count (parse-line "")) 0))
    (is (= (count (parse-line "  ")) 0))))
