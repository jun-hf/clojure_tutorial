;;
;; complement takes in an predicate and an predicate
;; the predicate it returns is the ooposite value
(defn is_not_empty [a] 
  ((complement empty?) a))

;; I tried to pass in '' and it had syntax error, for now we will use "" for string. 
;; Will need to investigate why we cannot put in ''
(is_not_empty "a") 

;;
;; Apply it will take in an function and a collection
;; then Apply will pass all the element into the passed in function individually
(apply str [1, 2, 3]) ;; "123"
(str [1, 2, 3]) ;; [1, 2, 3]

;;
;; Map
;; take in a specific function and collection and pass in each element into the specific function
(map inc [1, 2, 4]) ;; (2, 3, 5)

;; Beware
;; if you map a map it will return a list
(map 
 (fn [[k, v]] (inc v))
 {:a 1,:b 2,:c 4}) ;; (2, 3, 5)

;; you need to return the correct structure
;; this will return an list of vector
(map 
 (fn [[k, v]] [k (inc v)])
 {:a 1,:b 2,:c 4}) ;; ([:a 2] [:b 3] [:c 5])

;; now you use the into function to transform it into a map
(into {}
      (map 
       (fn [[k, v]] [k (inc v)])
       {:a 1,:b 2,:c 4}))


;;;
;; reduce
(reduce + 5 [1, 2, 4])
;; explicit reduce function
;; [[:a :b] [:c :d]]
(reduce 
 (fn [acc, element]
   (assoc acc (first element) (last element)))
 {}
 [[:a :b] [:c :d]])

;;;
;; filter
;; used to filter in element that passed the predicate (true) 
(filter even? (range 10)) ;; (0, 2, 4, 6, 8)

;; return a vector instead
(filterv even? (range 10))

;;;
;; Comp
;; Takes a list of function and return a function that execute the
((comp clojure.string/upper-case (partial apply str) reverse) "Hello")

;;;
;; Partial Application

;;;
;; Recursive Application

;;;
;; Composability

;;;
;; Summary