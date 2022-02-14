(ns basico.operacoes)

(def value-one 12)
(def value-two 2)

(prn "----------------Operadores-----------------")
;; Operações
(prn (+ value-one value-two))                               ;soma
(prn (- value-one value-two))                               ;subtração
(prn (* value-one value-two))                               ;Multiplicação
(prn (/ value-one value-two))                               ;Divisão
(prn (inc value-one))                                       ;incrementar + 1
(prn (dec value-one))                                       ;decrementar -1
(prn (max value-one value-two))                             ;Retorna o valor maior
(prn (min value-one value-two))                             ;retorna o valor menor
(prn (rem value-one value-two))                             ;Ressto da divisão

(prn "-----------------Operadores Relacionais--------------------")
;; Operadores Relacionais
(prn (= value-one value-two))                               ;valor igual
(prn (not= value-one value-two))                            ;diferente
(prn (< value-one value-two))                               ;menor que
(prn (<= value-one value-two))                              ;menor ou igual que
(prn (> value-one value-two))                               ;maior que
(prn (>= value-one value-two))                              ;maior ou igual que

(prn "-----------------Operadores Logicos--------------------")
;; Operadores Logico
(prn (and (< value-one value-two) (> value-one value-two)))
(prn (or (= value-one value-two) (> value-one value-two)))
(prn (not (> value-one value-two)))