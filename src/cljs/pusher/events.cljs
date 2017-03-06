(ns pusher.events
    (:require [re-frame.core :as re-frame :refer [debug]]
              [pusher.db :as db]))

(defn get-speed-by-index
  [db idx]
  ((:film-speeds db) idx))

(defn get-aperture-by-index
  [db idx]
  ((:apertures db) idx))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
 :set-film-speed
 [debug]
 (fn [db [_ index]]
   (assoc-in db [:film-settings :speed] index)))

(re-frame/reg-event-db
 :set-metered-speed
 [debug]
 (fn [db [_ index]]
   (assoc-in db [:meter-settings :speed] index)))

(re-frame/reg-event-db
 :set-camera-speed
 [debug]
 (fn [db [_ index]]
   (assoc-in db [:camera-settings :speed] index)))

(re-frame/reg-event-db
 :set-metered-aperture
 [debug]
 (fn [db [_ index]]
   (assoc-in db [:meter-settings :aperture] index)))

(re-frame/reg-event-db
 :set-camera-aperture
 [debug]
 (fn [db [_ index]]
   (assoc-in db [:camera-settings :aperture] index)))

(re-frame/reg-event-db
 :set-camera-exposure-mode
 [debug]
 (fn [db [_ index]]
   (assoc-in db [:camera-settings :exposure-mode] index)))

(re-frame/reg-event-db
 :toggle-bulb-in
 (fn [db _]
   (assoc-in db [:meter-settings :bulb-in] (not (get-in db [:meter-settings :bulb-in])))))

(re-frame/reg-event-db
 :toggle-shadow-side
 (fn [db _]
   (assoc-in db [:meter-settings :shadow-side] (not (get-in db [:meter-settings :shadow-side])))))

(re-frame/reg-event-db
 :toggle-down-45-degrees
 (fn [db _]
   (assoc-in db [:meter-settings :down-45-degrees] (not (get-in db [:meter-settings :down-45-degrees])))))
