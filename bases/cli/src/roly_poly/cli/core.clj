(ns roly_poly.cli.core
  (:require [roly_poly.user.interface :as user])
  (:gen-class))

(defn -main [& args]
  (println (user/hello (first args)))
  (System/exit 0))
