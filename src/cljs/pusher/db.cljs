(ns pusher.db)

(def default-db
  {:name "re-frame"
   :films [{:name "Fuji 400H" :speed 400 :optimal-speed 200}
           {:name "Kodak Portra 160" :speed 160 :optimal-speed 160}
           {:name "Kodak Portra 400" :speed 400 :optimal-speed 320}
           {:name "Kodak Portra 800" :speed 800 :optimal-speed 640}]
   :speeds [1 1.2 1.6 2 2.5 3 4 5 6 8 10 12 16 20 25 32
            40 50 64 80 100 125 160 200 250 320 400 500
            640 800 1000 1250 1600 2000 2500 3200 4000
            5000 6400 8000 10000 12500 16000 20000 25000]
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
