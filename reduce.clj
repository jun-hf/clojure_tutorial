;; reduce example
(def person_list [{:name "Alice" :age 38} {:name "James" :age 28} {:name "Jamie" :age 54}])
(defn get-total-age [total-age person] (+ total-age (:age person)))
(reduce get-total-age 0 person_list)
