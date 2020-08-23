(ns project.core)
(use '[clojure.set :only [intersection, difference]])


(defn hello-mr
  ([] (println "Hello, Mr. Anonymous"))
  ([name] (println "Hello, Mr." name)))

(def anon #(println "Hello, " %1))


(defn -main
  [& _args]
  (def user "Isaak")
  (println (reduce #(str %1 "," %2) [1 2 3 4])
           (filter #(> %1 3) [1 2 3 4 5 6 7])
           (map #(* 10 %1) [1 2 3 5]))
  (hello-mr user)
  (def keymap (hash-map :a 1 :b 2 :c 3))
  (println (assoc keymap :d 4))
  (println (intersection #{1 2 3} #{2 3 4}))
  (println (difference #{1 2 3} #{2 3 4}))
  (anon user))