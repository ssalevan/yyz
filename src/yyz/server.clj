(ns yyz.server
  (:use aleph.http
        noir.core
        lamina.core)
  (:require [noir.server :as nr-server]
            [noir.fetch.remotes :as remotes]))

(nr-server/load-views "src/yyz/views/")
(nr-server/add-middleware remotes/wrap-remotes)

(defn -main [& m]
  (let [mode (keyword (or (first m) :dev))
        port (Integer. (get (System/getenv) "PORT" "3000"))
        noir-handler (nr-server/gen-handler {:mode mode})]
    (start-http-server
      (wrap-ring-handler noir-handler)
      {:port port :websocket true})))
