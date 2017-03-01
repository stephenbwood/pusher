(ns pusher.views
    (:require [re-frame.core :as re-frame]))

(defn main-panel []
  (let [name (re-frame/subscribe [:name])
        films (re-frame/subscribe [:films])
        selected-film (re-frame/subscribe [:selected-film])
        metered-speed (re-frame/subscribe [:metered-speed])
        bulb-in (re-frame/subscribe [:bulb-in])
        shadow-side (re-frame/subscribe [:shadow-side])
        down-45-degrees (re-frame/subscribe [:down-45-degrees])]
    (fn []
      [:div
       [:select {:on-change #(re-frame/dispatch [:set-selected-film (.. % -target -value)])}
        (for [film @films]
          [:option {:key (:name film)} (:name film)])]
       [:h1 (:name @selected-film)]
       [:ul
        [:li (str "Speed: " (:speed @selected-film))]
        [:li (str "Optimal Speed: " (:optimal-speed @selected-film))]]
       [:p "I metered my film at:"
        [:input {:type "number"
                 :min "1"
                 :max "12800"
                 :value @metered-speed
                 :on-change #(re-frame/dispatch [:set-metered-speed (.. % -target -value)])}]]
       [:p "Bulb In?"
        [:input {:type "checkbox"
                 :on-change #(re-frame/dispatch [:toggle-bulb-in])}]]
       [:p "Bulb 45 degrees down?"
        [:input {:type "checkbox"
                 :on-change #(re-frame/dispatch [:toggle-down-45-degrees])}]]
       [:p "Shadow side metering?"
        [:input {:type "checkbox"
                 :on-change #(re-frame/dispatch [:toggle-shadow-side])}]]
       [:ul
        (if @bulb-in [:li "Bulb In: + 0 to 1 stop"])]])))
