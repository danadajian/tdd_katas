(ns tdd.roman_numerals)

(def roman-map {\I 1 \V 5 \X 10 \L 50 \C 100 \D 500 \M 1000})
(def roman-char-map {\V \I, \X \I, \L \X, \C \X, \D \C, \M \C})

(defn prev-letter [current-index roman]
  (nth roman (- current-index 1) \\)
  )

(defn reduced-value [letter]
  (- (get roman-map letter)
     (* (get roman-map (get roman-char-map letter)) 2))
  )

(defn deal-with-letter [current-index roman letter]
  (if (= (prev-letter current-index roman) (get roman-char-map letter))
    (reduced-value letter)
    (get roman-map letter)
    )
  )

(defn translate-roman-numerals [roman]
  (reduce +
          (for [i (range (count roman))]
            (deal-with-letter i roman (nth roman i))))
  )

