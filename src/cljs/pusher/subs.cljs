(ns pusher.subs
    (:require-macros [reagent.ratom :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 :name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 :films
 (fn [db]
   (:films db)))

(re-frame/reg-sub
 :selected-film
 (fn [db]
   (first (filterv #(= (:name %) (:selected-film db)) (:films db)))))

(re-frame/reg-sub
 :metered-speed
 (fn [db]
   (:metered-speed db)))

(re-frame/reg-sub
 :bulb-in
 (fn [db]
   (:bulb-in db)))

(re-frame/reg-sub
 :shadow-side
 (fn [db]
   (:shadow-side db)))

(re-frame/reg-sub
 :down-45-degrees
 (fn [db]
   (:down-45-degrees db)))

(re-frame/reg-sub
 :meter-settings
 (fn [db]
   (:meter-settings db)))

(re-frame/reg-sub
 :camera-settings
 (fn [db]
   (:camera-settings db)))

(re-frame/reg-sub
 :speeds
 (fn [db]
   (:speeds db)))
