(ns tdd.tribonacci)

(defn get-tribonacci-sum [vector]
  (reduce + (take-last 3 vector)))

(defn get-conjoined-vector [vector]
  (conj vector (get-tribonacci-sum vector)))

(defn tribonacci [[a b c] n]
  (cond
    (> n 3) (get-conjoined-vector (tribonacci [a b c] (- n 1)))
    (> n 0) (subvec [a b c] 0 n)
    :else []))
