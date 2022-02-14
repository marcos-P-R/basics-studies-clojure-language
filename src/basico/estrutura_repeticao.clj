(ns basico.estrutura-repeticao)

(def num-ingresso 10)
(def x (atom 1))
(def list-example(list 1 2 3 4))

(while (< @x num-ingresso)
  (do
    (swap! x inc)
    (prn @x)))

(prn "--------------------------")
;percorre toda lista e adiciona um valor
(doseq [num-list list-example]
  (prn (inc num-list)))

(dotimes [num-referencia 10]
  (prn (str num-referencia " => " (rem num-referencia 2))))

(prn "--------------------------")

(loop [contagem-regressiva 10]
  (when (>= contagem-regressiva 1)
    (prn contagem-regressiva)
    (recur (- contagem-regressiva 1))))