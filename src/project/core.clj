(ns project.core)
(use '[clojure.set :only [intersection, difference]])
(use '[project.helper, :only [greet]])

(defn hello-mr
  ([] (println "Hello, Mr. Anonymous"))
  ([name] (println "Hello, Mr." name))
  ([name surname] (println "Hello, Mr." name surname)))

(def -anon #(println "Hello, " %1))

(defn -main
  [& _args]

  (let [name "Isaak" surname "Uchakaev"]
    (hello-mr name)
    (hello-mr name surname))

  (println (reduce #(str %1 "," %2) [1 2 3 4])
           (filter #(> %1 3) [1 2 3 4 5 6 7])
           (map #(* 10 %1) [1 2 3 5]))

  (def keymap (hash-map :a 1 :b 2 :c 3))
  (println (assoc keymap :d 4))
  (println (intersection #{1 2 3} #{2 3 4}))
  (println (difference #{1 2 3} #{2 3 4}))
  (println (reverse (vector "a" "b" "c"))))