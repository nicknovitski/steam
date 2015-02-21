(ns steam.econ-items-620 (:require [steam.request :as r]))

(def
 player-items-v1
 "Parameters:
:steamid (uint64) - The Steam ID to fetch items for"
 (partial r/get "IEconItems_620" "GetPlayerItems" 1))

(def player-items player-items-v1)

(def
 schema-v1
 "Parameters:
:language (string) - The language to return the names in. Defaults to returning string keys. (optional)"
 (partial r/get "IEconItems_620" "GetSchema" 1))

(def schema schema-v1)
