(ns pusher.views
  (:require [re-frame.core :as re-frame]
            [cljs.reader :as reader]))

(defn main-panel []
  (let [apertures (re-frame/subscribe [:apertures])
        film-speeds (re-frame/subscribe [:film-speeds])
        film-settings (re-frame/subscribe [:film-settings])
        meter-settings (re-frame/subscribe [:meter-settings])
        camera-settings (re-frame/subscribe [:camera-settings])
        exposure-modes (re-frame/subscribe [:exposure-modes])]
    (fn []
      [:div
       [:div.columns
        [:div.column
         [:nav.panel
          [:p.panel-heading "Film"]
          [:div.panel-block
           [:div.control
            [:span.select.is-fullwidth
             [:select {:defaultValue (:speed @film-settings)
                       :on-change #(re-frame/dispatch [:set-film-speed
                                                       (int (.. % -target -value))])}
              (doall (map-indexed (fn [idx item]
                                    [:option {:key (:speed item) :value idx}
                                     (str (:speed item) " ISO")])
                                  @film-speeds))]]]]]]
        [:div.column
         [:nav.panel
          [:p.panel-heading "Meter Settings"]
          [:div.panel-block
           [:div.control.is-grouped
            [:div.control
             [:a.button {:class (if (:bulb-in @meter-settings) "is-active is-light" "")
                         :on-click #(re-frame/dispatch [:toggle-bulb-in])} "Bulb In"]]
            [:div.control
             [:a.button {:class (if (:down-45-degrees @meter-settings) "is-active is-light" "")
                         :on-click #(re-frame/dispatch [:toggle-down-45-degrees])} "Down 45 Degrees"]]
            [:div.control
             [:a.button {:class (if (:shadow-side @meter-settings) "is-active is-light" "")
                         :on-click #(re-frame/dispatch [:toggle-shadow-side])} "Shadow Side"]]]]
          [:p.panel-block
           [:span.select.is-fullwidth
            [:select {:defaultValue (:speed @meter-settings)
                      :on-change #(re-frame/dispatch [:set-metered-speed
                                                      (int (.. % -target -value))])}
              (doall (map-indexed (fn [idx item]
                                    [:option {:key (:speed item) :value idx}
                                     (str (:speed item) " ISO")])
                                  @film-speeds))]]]
          [:p.panel-block
           [:span.select.is-fullwidth
            [:select {:defaultValue (:aperture @meter-settings)
                      :on-change #(re-frame/dispatch [:set-metered-aperture
                                                      (int (.. % -target -value))])}
              (doall (map-indexed (fn [idx item]
                                    [:option {:key (:f item) :value idx}
                                     (str "f/" (:f item))])
                                  @apertures))]]]]]
        [:div.column
         [:nav.panel
          [:p.panel-heading "Camera Settings"]
          [:div.panel-block
           [:div.control.is-grouped
            (doall (map-indexed (fn [idx item]
                                  [:span.control {:key idx}
                                   [:a.button {:class (if (= idx (:exposure-mode @camera-settings)) "is-light is-active" "")
                                               :on-click #(re-frame/dispatch [:set-camera-exposure-mode idx])}
                                              item]])
                                @exposure-modes))]]
          [:p.panel-block
           [:span.select.is-fullwidth
            [:select {:defaultValue (:speed @camera-settings)
                      :on-change #(re-frame/dispatch [:set-camera-speed
                                                      (int (.. % -target -value))])}
              (doall (map-indexed (fn [idx item]
                                    [:option {:key (:speed item) :value idx}
                                     (str (:speed item) " ISO")])
                                  @film-speeds))]]]
          [:p.panel-block
           [:span.select.is-fullwidth
            [:select {:defaultValue (:aperture @camera-settings)
                      :on-change #(re-frame/dispatch [:set-camera-aperture
                                                      (int (.. % -target -value))])}
              (doall (map-indexed (fn [idx item]
                                    [:option {:key (:f item) :value idx}
                                     (str "f/" (:f item))])
                                  @apertures))]]]]]]])))
