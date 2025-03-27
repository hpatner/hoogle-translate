(ns ht.styles)

(defn font [font-size]
  {:style {:font-family "JetBrains Mono, monospace"
           :font-size (str font-size)
           :font-weight "bold"}})

(defn social-icon-style []
  {:height 40 
   :width 40
   :transition "all 0.2s ease-in-out"
   :transform "scale(1)"})

(defn social-links-container []
  {:style {:display "flex" 
           :gap "10px" 
           :justify-content "center" 
           :margin-top "10px"}})

(defn logo-link []
  {:position "absolute"
   :right "30px"
   :top "30px"
   :cursor "pointer"})

(defn logo-image []
  {:height "60px"
   :width "60px"
   :transition "all 0.2s ease-in-out"
   :transform "scale(1)"})
