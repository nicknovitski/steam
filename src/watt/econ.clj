(ns watt.econ (:require [watt.core :refer [method->fn]]))

(def
 trade-offers-v1
 (method->fn
  "IEconService"
  {:name "GetTradeOffers",
   :version 1,
   :httpmethod "GET",
   :description "Get a list of sent or received trade offers",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "get_sent_offers",
     :type "bool",
     :optional false,
     :description "Request the list of sent offers."}
    {:name "get_received_offers",
     :type "bool",
     :optional false,
     :description "Request the list of received offers."}
    {:name "get_descriptions",
     :type "bool",
     :optional false,
     :description
     "If set, the item display data for the items included in the returned trade offers will also be returned."}
    {:name "language",
     :type "string",
     :optional false,
     :description
     "The language to use when loading item display data."}
    {:name "active_only",
     :type "bool",
     :optional false,
     :description
     "Indicates we should only return offers which are still active, or offers that have changed in state since the time_historical_cutoff"}
    {:name "historical_only",
     :type "bool",
     :optional false,
     :description
     "Indicates we should only return offers which are not active."}
    {:name "time_historical_cutoff",
     :type "uint32",
     :optional false,
     :description
     "When active_only is set, offers updated since this time will also be returned"}]}))

(def trade-offers trade-offers-v1)

(def
 trade-offer-v1
 (method->fn
  "IEconService"
  {:name "GetTradeOffer",
   :version 1,
   :httpmethod "GET",
   :description "Gets a specific trade offer",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "tradeofferid", :type "uint64", :optional false}
    {:name "language", :type "string", :optional false}]}))

(def trade-offer trade-offer-v1)

(def
 trade-offers-summary-v1
 (method->fn
  "IEconService"
  {:name "GetTradeOffersSummary",
   :version 1,
   :httpmethod "GET",
   :description "Get counts of pending and new trade offers",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "time_last_visit",
     :type "uint32",
     :optional false,
     :description
     "The time the user last visited.  If not passed, will use the time the user last visited the trade offer page."}]}))

(def trade-offers-summary trade-offers-summary-v1)

(def
 decline-trade-offer-v1
 (method->fn
  "IEconService"
  {:name "DeclineTradeOffer",
   :version 1,
   :httpmethod "POST",
   :description "Decline a trade offer someone sent to us",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "tradeofferid", :type "uint64", :optional false}]}))

(def decline-trade-offer decline-trade-offer-v1)

(def
 cancel-trade-offer-v1
 (method->fn
  "IEconService"
  {:name "CancelTradeOffer",
   :version 1,
   :httpmethod "POST",
   :description "Cancel a trade offer we sent",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "tradeofferid", :type "uint64", :optional false}]}))

(def cancel-trade-offer cancel-trade-offer-v1)
