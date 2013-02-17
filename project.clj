(defproject yyz "0.1.0-SNAPSHOT"
  :description "A server providing a low-latency musical collaboration webapp."
  :url "http://yyz.astradynesound.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[aleph "0.3.0-alpha2"]
                 [org.clojure/clojure "1.3.0"]
                 [overtone "0.8.0-SNAPSHOT"]
                 [jayq "0.1.0-SNAPSHOT"]
                 [crate "0.1.0-SNAPSHOT"]
                 [fetch "0.1.0-SNAPSHOT"]
                 [noir "1.3.0-alpha10"]
                 [noir-async "1.1.0-beta7"]]
  :cljsbuild {:source-path "src"
              :compiler {:output-dir "resources/public/cljs/"
                         :output-to "resources/public/cljs/bootstrap.js"
                         :optimizations :simple
                         :pretty-print true}}
  :main ^ {:skip-aot true}  yyz.server)
