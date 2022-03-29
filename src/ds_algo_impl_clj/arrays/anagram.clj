(ns ds-algo-impl-clj.arrays.anagram)
;;"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"

;;For example: restful and fluster are anagrams.
(defn is-anagram? [org-str compare-str]
  (if (= (count org-str) (count compare-str))
    (= (sort org-str) (sort compare-str))
    false))
