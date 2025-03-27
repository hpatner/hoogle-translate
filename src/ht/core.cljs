(ns ht.core
  (:require
   [reagent.dom :as rdom]
   [reagent.core :as r]
   [clojure.string :as str]
   [stylefy.core :as stylefy]
   [ht.styles :as styles]
   [ht.data :as data]
   ["react-social-icons" :refer [SocialIcon]]))

(defonce state (r/atom {:top-padding "250px"
                        :results-table [:tr]}))

(defonce debug (r/atom {:info ""}))



(def logo-map
  {"APL"        "apl_logo.png"
   "BASH"       "bash_logo.png"
   "BQN"        "bqn_logo.svg"
   "C++"        "cpp_logo.png"
   "C#"         "csharp_logo.png"
   "Clojure"    "clojure_logo.png"
   "Crystal"    "crystal_logo.svg"
   "CUDA"       "thrust_logo.jfif"
   "D"          "d_logo.png"
   "Elixir"     "elixir_logo.png"
   "Elm"        "elm_logo.png"
   "Erlang"     "erlang_logo.png"
   "F#"         "fsharp_logo.png"
   "Fortran"    "fortran_logo.png"
   "Go"         "go_logo.png"
   "Groovy"     "groovy_logo.jpeg"
   "Haskell"    "haskell_logo.svg"
   "J"          "j_logo.png"
   "Java"       "java_logo.png"
   "JavaScript" "javascript_logo.png"
   "Julia"      "julia_logo.svg"
   "Kotlin"     "kotlin_logo.png"
   "LISP"       "LISP_logo.png"
   "Lua"        "lua_logo.png"
   "Nim"        "nim_logo.png"
   "OCaml"      "ocaml_logo.jpg"
   "q"          "kx-logo.png"
   "pandas"     "pandas-logo3.png"
   "Pharo"      "pharo_logo.png"
   "Python"     "python_logo.png"
   "R"          "r_logo.png"
   "Racket"     "racket_logo.png"
   "RAPIDS (C++)"  "rapids_logo.png"
   "RAPIDS (Python)"  "rapids_logo.png" ;; TODO longterm fix
   "Ruby"       "ruby_logo.png"
   "Rust"       "rust_logo.png"
   "Scala"      "scala_logo2.png"
   "Swift"      "swift_logo.png"
   "TypeScript" "ts.png"
   "Zig"        "zig_logo.svg"})

; (defn extract-lang [s]
;   (first (str/split s #"@")))

(defn normalize-algo [algo]
  (->> algo
       (re-seq #"[a-zA-Z0-9]")
       (str/join)
       (str/lower-case)))

(defn extract-algo [s] ;; TODO this is confusingly named (returns a list)
  [(-> s
       (str/split #"@")
       (last)
       (normalize-algo)) s])

(defn first-equals [s [a _]]
  (= a s))

(defn filter-by-algo [algo m]
  (map last (filter (partial first-equals (normalize-algo algo)) (map extract-algo (keys m)))))

(defn get-id   [m] (get m :id))
(defn get-algo [m] (get m :algo))
(defn get-lang [m] (get m :lang))
(defn get-sig  [m] (get m :sig))

(defn filter-by-algo-id [id m]
  (map last (filter (partial first-equals id)
                    (map vector (map get-id (vals m)) (keys m)))))

(defn filter-by-algo-id2 [id m]
  (keep (fn [[k {elem-id :id}]] (when (= id elem-id) k)) m))

(defn filter-by-algo-id3 [id m]
  (->> m 
       (map (fn [[k {elem-id :id}]] (when (= id elem-id) k)))
       (remove nil?)))

(defn filter-by-algo-id4 [id m]
  (->> m 
       (filter (fn [[_ {elem-id :id}]] (= id elem-id)))
       (map first)))


;; (keep (fn [[k {elem-id :id}]] (when (= id elemid) k)) m)

(defn filter-by-lang [lang m]
  (map last (filter (partial first-equals lang)
                    (map vector (map get-lang (vals m)) (keys m)))))

(defn filter-by-sig [sig m]
  (map last (filter (partial first-equals sig)
                    (map vector (map get-sig (vals m)) (keys m)))))

(def tr-hover-style {::stylefy/mode {:hover {:background-color "purple"}}})

(declare generate-table)

(def excel-colors ["#CC99FF" "#99CCFF" "#CCFFCC" ;"#CCFFFF"
                   "#FFFF99" "#FFCC99" "#FF99CC" "white"]) 

(defn generate-row [info-map color-index]
  [:tr 
  ;  (use-style tr-hover-style)
  ;  {:style (use-style tr-hover-style)}
    ; {:style [:&:hover {:background-color "#f1f1f1"}]}
  ;  []^{:pseudo {:hover {:background-color "purple"}}}
  ;  {:style {:tr:hover {:background-color "purple"}}}
  ;  {:.item:hover {:background-color "#f5f5f5"}}
  {:on-click
   (fn [_] ((reset! state {:top-padding "20px"
                           :results-table (generate-table (get info-map :id) :by-algo-id)})))

   ::stylefy/mode {:on-hover {:background-color "purple"}} ;; TODO make work
   }
   [:td [:img {:src (str/join ["/media/logos/" (get logo-map (get info-map :lang))]) :width "40px" :height "40px"}]]
   [:td {:style {:padding "12px 30px"}} (get info-map :lang)]
   [:td {:style {:padding "12px 30px"
                 :font-weight "bold"
                 :background-color (nth excel-colors color-index)
                ;  :border "2px solid black"
                 }}  (get info-map :algo)]
   [:td {:style {:padding "12px 30px"}} (get info-map :lib)]
   [:td {:style {:padding "12px 30px"}} [:a {:href (get info-map :doc)} "Doc"]]])

(defn choose-filter [how-to-generate-table]
  (case how-to-generate-table
    :by-algo    (partial filter-by-algo)
    :by-algo-id (partial filter-by-algo-id)
    :by-lang    (partial filter-by-lang)
    :by-sig     (partial filter-by-sig)))

(defn choose-colors [how-to-generate-table rows-info]
  (case how-to-generate-table
    
    :by-algo-id (map vector rows-info
                     (map (partial
                           get (->> (map get-algo rows-info)
                                    (map normalize-algo)
                                    (frequencies)
                                    (into (vector))
                                    (sort-by last >)
                                    (map-indexed (fn [i [algo _]] [algo (min i 6)]))
                                    (into (hash-map))))
                          (->> (map get-algo rows-info)
                               (map normalize-algo))))
    
    :by-algo    (map vector rows-info
                     (map (partial
                           get (->> (map get-id rows-info)
                                    (frequencies)
                                    (into (vector))
                                    (sort-by last >)
                                    (map-indexed (fn [i [id _]] [id (min i 6)]))
                                    (into (hash-map)))) (map get-id rows-info)))
    
    :by-lang    (map vector rows-info
                     (repeat (count rows-info) 0))
    
    :by-sig    (map vector rows-info
                    (repeat (count rows-info) 0))))

(defn in?
  [coll elm]
  (some #(= elm %) coll))

(defn decide-how [input]
  (cond 
    (in? (->> logo-map
              (keys)
              (map str/lower-case))
         (str/lower-case input)) :by-lang ;; TODO figure out why this lower-case isn't working
    (str/includes? input "->") :by-sig
    (str/includes? input " ")  :by-algo-id
    :else :by-algo))

(defn generate-table [selection how-to-generate-table]
  [:table {:style {:font-family "'JetBrains Mono', monospace"
                   :padding "12px 12px"
                   :font-size "20" ; this is for the rows
                   :margin-left "auto"
                   :margin-right "auto"
                   :text-align "center"}}

   (->> data/by-key-map
        ((choose-filter how-to-generate-table) selection)
        (select-keys data/by-key-map)
        (vals)
        (choose-colors how-to-generate-table)
        (sort-by last)
        (map (partial apply generate-row)))

  ])

(defn social-icon [props]
  [:> SocialIcon (merge {:style (styles/social-icon-style)}
                       {:onMouseOver (fn [e] 
                                      (-> e .-currentTarget .-style .-transform (set! "scale(1.25)")))
                        :onMouseOut (fn [e] 
                                     (-> e .-currentTarget .-style .-transform (set! "scale(1)")))}
                       props)])

(defn social-links []
  [:div (styles/social-links-container)
   [social-icon {:url "https://bsky.app/profile/codereport.bsky.social"}]
   [social-icon {:url "https://mastodon.social/@code_report" :network "mastodon"}]
   [social-icon {:url "https://www.twitter.com/code_report"}]
   [social-icon {:url "https://www.youtube.com/c/codereport"}]
   [social-icon {:url "https://www.github.com/codereport"}]])

(defn app-view []
  [:div {:style {:search-text ""
                 :text-align "center"
                 :padding (@state :top-padding)}}
   [:a {:href "https://www.youtube.com/c/codereport"
        :style (styles/logo-link)}
    [:img {:src "/media/code_report_circle.png"
           :style (styles/logo-image)
           :on-mouse-over (fn [e] 
                           (-> e .-target .-style .-transform (set! "scale(1.25)")))
           :on-mouse-out (fn [e] 
                          (-> e .-target .-style .-transform (set! "scale(1)")))}]]
   
   [:label {:style {:color "darkviolet"
                    :font-family "'JetBrains Mono', monospace"
                    :font-size "50"
                    :font-weight "bold"}} "Hoogle Translate"]
   [:br]
   [:label (@debug :info)]
   [:br]
   [:input
    {:spellcheck "false"
     :focus true ;; TODO fix
     :style {:padding "12px 20px"
             :margin "8px 0"
             :width "600px"
             :font-size "30" ; this is for the search box
             :font-family "'JetBrains Mono', monospace"
             :border-radius "25px"
             :border "2px solid grey"
             :outline-width "0"
             :text-align "center"
             :spellcheck "false"}
    ;  :value (@state :search-text) ;; TODO get search text to update on clicks
     :on-key-press
     (fn [e]
       (if (= (.-key e) "Enter")
         (reset! state {:search-text (.. e -target -value)
                        :top-padding "20px"
                        :results-table (generate-table (if (and (str/includes? (.. e -target -value) " ")
                                                                (not (str/includes? (.. e -target -value) "->")))
                                                         ( ->> (str/replace (.. e -target -value) " " "@")
                                                           (get data/by-key-map)
                                                           (get-id))
                                                         (.. e -target -value)) 
                                                       (decide-how (.. e -target -value)))})
         (.log js/console "Not Enter")))}]
   ; ((reset! state {:search-text (str/join [(@state :search-text) (-.key e)])}))))}]
   [:br]
   [:br]

   (@state :results-table)
   
   ;; Only show attribution and social links when no results are showing (top-padding is 250px)
   (when (= (@state :top-padding) "250px")
     [:div
      [:label (styles/font 25) "by code_report"]
      [social-links]])
   ])

(defn render! []
  (rdom/render
   [app-view]
   (js/document.getElementById "app")))
