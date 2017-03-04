(ns pusher.views
    (:require [re-frame.core :as re-frame]))

(defn main-panel []
  (let [name (re-frame/subscribe [:name])
        films (re-frame/subscribe [:films])
        selected-film (re-frame/subscribe [:selected-film])
        metered-speed (re-frame/subscribe [:metered-speed])
        bulb-in (re-frame/subscribe [:bulb-in])
        shadow-side (re-frame/subscribe [:shadow-side])
        down-45-degrees (re-frame/subscribe [:down-45-degrees])
        speeds (re-frame/subscribe [:speeds])]
    (fn []
      [:div
       [:div.columns
        [:div.column
         [:nav.panel
          [:p.panel-heading "Film"]
          [:div.panel-block
           [:p.control
            [:span.select.is-fullwidth
             [:select {:on-change #(re-frame/dispatch [:set-selected-film (.. % -target -value)])}
              (for [film @films]
                [:option {:key (:name film)} (:name film)])]]]]
          [:p.panel-block (str "Speed: " (:speed @selected-film))]
          [:p.panel-block (str "Optimal Speed: " (:optimal-speed @selected-film))]]]
        [:div.column
         [:nav.panel
          [:p.panel-heading "Meter Settings"]
          [:p.panel-block
           [:span.select.is-fullwidth
            [:select {:value @metered-speed :on-change #(re-frame/dispatch [:set-metered-speed (.. % -target -value)])}
             (for [speed @speeds]
               [:option {:key speed
                         :value speed}
                (str speed " ISO")])]]]
          [:p.panel-block
           [:input {:type "checkbox"
                    :on-change #(re-frame/dispatch [:toggle-bulb-in])}]
           "Bulb In"]
          [:p.panel-block
           [:input {:type "checkbox"
                    :on-change #(re-frame/dispatch [:toggle-down-45-degrees])}]
           "Down 45 degrees"]
          [:p.panel-block
           [:input {:type "checkbox"
                    :on-change #(re-frame/dispatch [:toggle-shadow-side])}]
           "Shadow Side"]]]
        [:div.column
         [:nav.panel
          [:p.panel-heading "Camera Settings"]]]]
       [:ul
        (if @bulb-in [:li "Bulb In: + 0 to 1 stop"])]])))
