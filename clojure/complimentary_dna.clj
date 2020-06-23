(ns tdd.complimentary_dna
  (:require [clojure.string :as string]))

(defn dna-strand [n]
  (string/join (replace {"A" "T", "T" "A", "C" "G", "G", "C"}
                        (string/split n #""))))
