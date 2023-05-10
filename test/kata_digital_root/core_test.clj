(ns kata-digital-root.core-test
  (:require [clojure.test :refer :all]
            [kata-digital-root.core :refer :all]))

(deftest digital-root-example-test
  (is (= (digital-root 16) 7))
  (is (= (digital-root 456) 6)))
