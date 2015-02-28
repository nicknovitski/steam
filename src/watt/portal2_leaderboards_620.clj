(ns
 watt.portal2-leaderboards-620
 (:require [watt.core :refer [method->fn]]))

(def
 bucketized-data-v1
 (method->fn
  "IPortal2Leaderboards_620"
  {:name "GetBucketizedData",
   :version 1,
   :httpmethod "GET",
   :parameters
   [{:name "leaderboardName",
     :type "string",
     :optional false,
     :description "The leaderboard name to fetch data for."}]}))

(def bucketized-data bucketized-data-v1)
