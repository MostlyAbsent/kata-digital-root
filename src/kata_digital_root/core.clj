(ns kata-digital-root.core)

(defn digital-root [n]
  (if (< n 10)
    n
    (->> (map #(Character/digit % 10) (-> n str seq))
         (reduce +)
         digital-root)))
