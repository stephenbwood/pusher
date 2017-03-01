(ns pusher.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [pusher.core-test]))

(doo-tests 'pusher.core-test)
