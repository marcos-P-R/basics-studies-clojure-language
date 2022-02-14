(ns basico.condicionais)
(def year 1998)
(def age (- 2022 year))

(if (= age 23) (prn "Sua idade é 23") (prn "Sua idade não é igual"))


(if (= age 24)
  (do (prn "Sua idade é 24")
      (prn "true"))
  (do (prn "Sua idade não é igual")
      (prn "false")))

(if (and (= age 24) (> year age)) (prn "True") (prn "False"))

(case age
  23 (prn "Tenho 23 anos")
  24 (prn "Tenho 24 anos")
  (prn "Dados não informado"))

(cond
  (< age (- 2000 1996)) (prn "Age é maior")
  (= age (- 2010 1999)) (prn "not")
  :else (prn "Não definido"))