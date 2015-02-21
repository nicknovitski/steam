(ns steam.user (:require [steam.request :as r]))

(def
 friend-list-v1
 "Parameters:
:key (string) - access key
:steamid (uint64) - SteamID of user
:relationship (string) - relationship type (ex: friend) (optional)"
 (partial r/get "ISteamUser" "GetFriendList" 1))

(def friend-list friend-list-v1)

(def
 player-bans-v1
 "Parameters:
:key (string) - access key
:steamids (string) - Comma-delimited list of SteamIDs"
 (partial r/get "ISteamUser" "GetPlayerBans" 1))

(def player-bans player-bans-v1)

(def
 player-summaries-v1
 "Parameters:
:key (string) - access key
:steamids (string) - Comma-delimited list of SteamIDs"
 (partial r/get "ISteamUser" "GetPlayerSummaries" 1))

(def
 player-summaries-v2
 "Parameters:
:key (string) - access key
:steamids (string) - Comma-delimited list of SteamIDs (max: 100)"
 (partial r/get "ISteamUser" "GetPlayerSummaries" 2))

(def player-summaries player-summaries-v2)

(def
 user-group-list-v1
 "Parameters:
:key (string) - access key
:steamid (uint64) - SteamID of user"
 (partial r/get "ISteamUser" "GetUserGroupList" 1))

(def user-group-list user-group-list-v1)

(def
 resolve-vanity-url-v1
 "Parameters:
:key (string) - access key
:vanityurl (string) - The vanity URL to get a SteamID for
:url_type (int32) - The type of vanity URL. 1 (default): Individual profile, 2: Group, 3: Official game group (optional)"
 (partial r/get "ISteamUser" "ResolveVanityURL" 1))

(def resolve-vanity-url resolve-vanity-url-v1)
