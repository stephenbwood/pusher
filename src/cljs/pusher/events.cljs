(ns pusher.events
    (:require [re-frame.core :as re-frame]
              [pusher.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
 :set-selected-film
 (fn [db [_ name]]
   (assoc db :selected-film name)))

(re-frame/reg-event-db
 :set-metered-speed
 (fn [db [_ speed]]
   (assoc db :metered-speed (int speed))))

(re-frame/reg-event-db
 :toggle-bulb-in
 (fn [db _]
   (assoc db :bulb-in (not (:bulb-in db)))))

(re-frame/reg-event-db
 :toggle-shadow-side
 (fn [db _]
   (assoc db :shadow-side (not (:shadow-side db)))))

(re-frame/reg-event-db
 :toggle-down-45-degrees
 (fn [db _]
   (assoc db :down-45-degrees (not (:down-45-degrees db)))))
