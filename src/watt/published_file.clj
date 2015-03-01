(ns watt.published-file (:require [watt.core :refer [method->fn]]))

(def
 query-files-v1
 (method->fn
  "IPublishedFileService"
  {:name "QueryFiles",
   :version 1,
   :httpmethod "GET",
   :description "Performs a search query for published files",
   :parameters
   [{:name "key",
     :type "string",
     :optional false,
     :description "Access key"}
    {:name "query_type",
     :type "uint32",
     :optional false,
     :description
     "enumeration EPublishedFileQueryType in clientenums.h"}
    {:name "page",
     :type "uint32",
     :optional false,
     :description "Current page"}
    {:name "numperpage",
     :type "uint32",
     :optional true,
     :description
     "(Optional) The number of results, per page to return."}
    {:name "creator_appid",
     :type "uint32",
     :optional false,
     :description "App that created the files"}
    {:name "appid",
     :type "uint32",
     :optional false,
     :description "App that consumes the files"}
    {:name "requiredtags",
     :type "string",
     :optional false,
     :description
     "Tags to match on. See match_all_tags parameter below"}
    {:name "excludedtags",
     :type "string",
     :optional false,
     :description
     "(Optional) Tags that must NOT be present on a published file to satisfy the query."}
    {:name "match_all_tags",
     :type "bool",
     :optional true,
     :description
     "If true, then items must have all the tags specified, otherwise they must have at least one of the tags."}
    {:name "required_flags",
     :type "string",
     :optional false,
     :description
     "Required flags that must be set on any returned items"}
    {:name "omitted_flags",
     :type "string",
     :optional false,
     :description "Flags that must not be set on any returned items"}
    {:name "search_text",
     :type "string",
     :optional false,
     :description "Text to match in the item's title or description"}
    {:name "filetype",
     :type "uint32",
     :optional false,
     :description "EPublishedFileInfoMatchingFileType"}
    {:name "child_publishedfileid",
     :type "uint64",
     :optional false,
     :description "Find all items that reference the given item."}
    {:name "days",
     :type "uint32",
     :optional false,
     :description
     "If query_type is k_PublishedFileQueryType_RankedByTrend, then this is the number of days to get votes for [1,7]."}
    {:name "include_recent_votes_only",
     :type "bool",
     :optional false,
     :description
     "If query_type is k_PublishedFileQueryType_RankedByTrend, then limit result set just to items that have votes within the day range given"}
    {:name "cache_max_age_seconds",
     :type "uint32",
     :optional true,
     :description
     "Allow stale data to be returned for the specified number of seconds."}
    {:name "totalonly",
     :type "bool",
     :optional false,
     :description
     "(Optional) If true, only return the total number of files that satisfy this query."}
    {:name "return_vote_data",
     :type "bool",
     :optional false,
     :description "Return vote data"}
    {:name "return_tags",
     :type "bool",
     :optional false,
     :description "Return tags in the file details"}
    {:name "return_kv_tags",
     :type "bool",
     :optional false,
     :description "Return key-value tags in the file details"}
    {:name "return_previews",
     :type "bool",
     :optional false,
     :description
     "Return preview image and video details in the file details"}
    {:name "return_children",
     :type "bool",
     :optional false,
     :description "Return child item ids in the file details"}
    {:name "return_short_description",
     :type "bool",
     :optional false,
     :description
     "Populate the short_description field instead of file_description"}
    {:name "return_for_sale_data",
     :type "bool",
     :optional false,
     :description "Return pricing information, if applicable"}]}))

(def query-files query-files-v1)
