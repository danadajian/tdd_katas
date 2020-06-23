(ns tdd.complimentary_dna-test
  (:require [clojure.test :refer :all]
            [tdd.complimentary_dna :refer :all]))

(deftest dna-test
  (testing
    (is (= (dna-strand "ATCG") "TAGC"))
    (is (= (dna-strand "GTAT") "CATA"))))