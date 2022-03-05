(ns roly-poly.user.interface
  (:require [roly_poly.user.core :as core]))


(def user-args
  [:name :password :id :created-at])

(defn hello [name]
  (core/hello name))
