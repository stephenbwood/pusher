(ns pusher.db)

(def default-db
  {:name "re-frame"
   :films [{:name "Fuji 400H" :speed 400 :optimal-speed 200}
           {:name "Kodak Portra 160" :speed 160 :optimal-speed 160}
           {:name "Kodak Portra 400" :speed 400 :optimal-speed 320}
           {:name "Kodak Portra 800" :speed 800 :optimal-speed 640}]
   :selected-film "Fuji 400H"  
   :metered-speed 400
   :bulb-in false
   :shadow-side false
   :down-45-degrees false
   :meter-settings {:speed 200
                    :aperture 2.8
                    :shutter (/ 1 60)}
   :camera-settings {:speed 200
                     :aperture 2.8
                     :shutter (/ 1 60)}})
