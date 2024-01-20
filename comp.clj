(defn add-3 [x]
  (+ x 3))

(defn multi-3 [x]
  (* x 3))

(def transforms-3 (comp multi-3 add-3))

(println (transforms-3 4)) ; Output: 21