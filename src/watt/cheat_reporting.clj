(ns watt.cheat-reporting (:require [watt.core :refer [method->fn]]))

(def
 report-cheat-data-v1
 (method->fn
  "ICheatReportingService"
  {:name "ReportCheatData",
   :version 1,
   :httpmethod "POST",
   :description
   "Reports cheat data. Only use on test account that is running the game but not in a multiplayer session.",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "steamid",
     :type "uint64",
     :optional false,
     :description
     "steamid of the user running and reporting the cheat."}
    {:name "appid",
     :type "uint32",
     :optional false,
     :description "The appid."}
    {:name "pathandfilename",
     :type "string",
     :optional false,
     :description "path and file name of the cheat executable."}
    {:name "webcheaturl",
     :type "string",
     :optional false,
     :description "web url where the cheat was found and downloaded."}
    {:name "time_now",
     :type "uint64",
     :optional false,
     :description "local system time now."}
    {:name "time_started",
     :type "uint64",
     :optional false,
     :description
     "local system time when cheat process started. ( 0 if not yet run )"}
    {:name "time_stopped",
     :type "uint64",
     :optional false,
     :description
     "local system time when cheat process stopped. ( 0 if still running )"}
    {:name "cheatname",
     :type "string",
     :optional false,
     :description "descriptive name for the cheat."}
    {:name "game_process_id",
     :type "uint32",
     :optional false,
     :description "process ID of the running game."}
    {:name "cheat_process_id",
     :type "uint32",
     :optional false,
     :description "process ID of the cheat process that ran"}]}))

(def report-cheat-data report-cheat-data-v1)
