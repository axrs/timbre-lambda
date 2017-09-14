(defproject timbre-lambda "0.0.1"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0"]
                 [com.taoensso/timbre "4.10.0"]]
  :source-paths ["src/main/clj"]
  :test-paths ["src/test/clj"]
  :profiles {:uberjar {:aot :all}})
