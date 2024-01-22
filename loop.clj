(loop [i 10]
  (if (= i 1)
    (prn "finished")
    (recur (do (prn i) (dec i)))))
    

(loop [i 0]
  (if (< i 10)
    (recur (do (prn "inside 10") 
        (inc i)))
    (prn "finished")))

(loop [i 0]
  (if (< i 20)
    (recur 
     (do (if (even? i)
           (prn (str i " is an empty number")))
         (inc i)))
    (prn "end of line")))


(loop [i 10]
  (if (<= i 0)
    (prn "Finish line")
    (recur
     (do
       (if (even? i)
         (prn (str i " is an even number")))
       (dec i)))))