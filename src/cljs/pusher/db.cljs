(ns pusher.db)

(def default-db
  {:name "pusher"
   :film-speeds [{:speed 1     :ev 1}
                 {:speed 1.2   :ev 1.3}
                 {:speed 1.6   :ev 1.7}
                 {:speed 2     :ev 2}
                 {:speed 2.5   :ev 2.3}
                 {:speed 3     :ev 2.7}
                 {:speed 4     :ev 3}
                 {:speed 5     :ev 3.3}
                 {:speed 6     :ev 3.7}
                 {:speed 8     :ev 4}
                 {:speed 10    :ev 4.3}
                 {:speed 12    :ev 4.7}
                 {:speed 16    :ev 5}
                 {:speed 20    :ev 5.3}
                 {:speed 25    :ev 5.7}
                 {:speed 32    :ev 6}
                 {:speed 40    :ev 6.3}
                 {:speed 50    :ev 6.7}
                 {:speed 64    :ev 7}
                 {:speed 80    :ev 7.3}
                 {:speed 100   :ev 7.7}
                 {:speed 125   :ev 8}
                 {:speed 160   :ev 8.3}
                 {:speed 200   :ev 8.7}
                 {:speed 250   :ev 9}
                 {:speed 320   :ev 9.3}
                 {:speed 400   :ev 9.7}
                 {:speed 500   :ev 10}
                 {:speed 640   :ev 10.3}
                 {:speed 800   :ev 10.7}
                 {:speed 1000  :ev 11}
                 {:speed 1250  :ev 11.3}
                 {:speed 1600  :ev 11.7}
                 {:speed 2000  :ev 12}
                 {:speed 2500  :ev 12.3}
                 {:speed 3200  :ev 12.7}
                 {:speed 4000  :ev 13}
                 {:speed 5000  :ev 13.3}
                 {:speed 6400  :ev 13.7}
                 {:speed 8000  :ev 14}
                 {:speed 10000 :ev 14.3}
                 {:speed 12500 :ev 14.7}
                 {:speed 16000 :ev 15}
                 {:speed 20000 :ev 15.3}
                 {:speed 25000 :ev 15.7}]
   :apertures [{:f 0.5 :av -2}
               {:f 0.7 :av -1}
               {:f 0.8 :av -0.7}
               {:f 0.9 :av -0.3}
               {:f 1   :av 0}
               {:f 1.1 :av 0.3}
               {:f 1.2 :av 0.7}
               {:f 1.4 :av 1}
               {:f 1.6 :av 1.3}
               {:f 1.7 :av 1.5}
               {:f 1.8 :av 1.7}
               {:f 2   :av 2}
               {:f 2.2 :av 2.3}
               {:f 2.4 :av 2.5}
               {:f 2.5 :av 2.7}
               {:f 2.8 :av 3}
               {:f 3.2 :av 3.3}
               {:f 3.3 :av 3.5}
               {:f 3.5 :av 3.7}
               {:f 4   :av 4}
               {:f 4.5 :av 4.3}
               {:f 4.8 :av 4.5}
               {:f 5.0 :av 4.7}
               {:f 5.6 :av 5}
               {:f 6.3 :av 5.3}
               {:f 6.7 :av 5.5}
               {:f 7.1 :av 5.7}
               {:f 8   :av 6}
               {:f 9   :av 6.3}
               {:f 9.5 :av 6.5}
               {:f 10  :av 6.7}
               {:f 11  :av 7}
               {:f 13  :av 7.3}
               {:f 14  :av 7.7}
               {:f 16  :av 8}
               {:f 18  :av 8.3}
               {:f 19  :av 8.5}
               {:f 20  :av 8.7}
               {:f 22  :av 9}
               {:f 25  :av 9.3}
               {:f 27  :av 9.5}
               {:f 29  :av 9.7}
               {:f 32  :av 10}]
   :exposure-modes ["Manual" "Aperture" "Shutter" "Program"]
   :film-settings {:speed 26}
   :meter-settings {:speed 26
                    :aperture 11
                    :shutter (/ 1 60)
                    :bulb-in false
                    :shadow-side false
                    :down-45-degrees false}
   :camera-settings {:speed 26
                     :aperture 11
                     :shutter (/ 1 60)
                     :exposure-mode 0}})
