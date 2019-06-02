(ns vector-works.core)

(defn vector-pair
  "Pairs vector elements together"
  [v1 v2]
  (map vector v1 v2))

(defn vector-shift
  "Shifts a vector to the left"
  [v]
  (take (count v) (rest (cycle v))))

(defn rand-vec-pair
  "Shuffles a vector, and pairs with a shifted copy of the vector guaranteeing a non-matching pair"
  [v]
  (let [randv (shuffle v)]
    (vec (vector-pair randv (vector-shift randv))))
  )