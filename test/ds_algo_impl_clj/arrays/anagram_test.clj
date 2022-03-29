(ns ds-algo-impl-clj.arrays.anagram_test
  (:require [clojure.test :refer :all]
            [ds-algo-impl-clj.arrays.anagram :as anagram]))

(deftest test-positive-anagram
  (testing "test anagram code with positive test case")
  (let [str1 "restful"
        str2 "fluster"]
    (is (anagram/is-anagram? str1 str2))))

(deftest test-negative-anagram-with-same-length
  (testing "test anagram code with negative test case with same word length")
  (let [str1 "restful"
        str2 "flustea"]
    (not (anagram/is-anagram? str1 str2))))

(deftest test-negative-anagram-with-different-length
  (testing "test anagram code with negative test case with different word length")
  (let [str1 "restful"
        str2 "fluste"]
    (not (anagram/is-anagram? str1 str2))))
