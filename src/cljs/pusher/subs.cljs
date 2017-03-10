(ns pusher.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 :name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 :meter-settings
 (fn [db]
   (:meter-settings db)))

(re-frame/reg-sub
 :camera-settings
 (fn [db]
   (:camera-settings db)))

(re-frame/reg-sub
 :film-settings
 (fn [db]
   (:film-settings db)))

(re-frame/reg-sub
 :film-speeds
 (fn [db]
   (:film-speeds db)))

(re-frame/reg-sub
 :apertures
 (fn [db]
   (:apertures db)))

(re-frame/reg-sub
 :exposure-modes
 (fn [db]
   (:exposure-modes db)))

(re-frame/reg-sub
 :shutter-speeds
 (fn [db]
   (:shutter-speeds db)))
