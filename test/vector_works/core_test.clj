(ns vector-works.core-test
  (:require [clojure.test :refer :all]
            [vector-works.core :refer :all]))

(deftest it-generates-a-pair
  (testing "vector-pair generates a pair"
    (is (= (vector-pair [1 2 3 4] [4 3 2 1]) [[1 4] [2 3] [3 2] [4 1]]))))

(deftest it-shifts-a-vector
  (testing "vector-shift shifts a vector"
    (is (= (vector-shift [1 2 3 4]) [2 3 4 1]))))

(deftest it-generates-random-pairs
  (testing "rand-vec-pair generates random vector pairs"
    (is (= (every? #(not= (% 0) (% 1)) (rand-vec-pair [1 2 3 4])) true))))