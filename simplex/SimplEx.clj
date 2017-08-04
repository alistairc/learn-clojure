(defn simplex [source pattern] 

    (defn char-to-regex [char] 
        (case char
            \t "[a-zA-Z]"
            \d "[0-9]"
            \  " " 
            ""
        )
    )
    
    (def expression (str "^" (apply str (map char-to-regex pattern)) "$") )
    
    (if 
        (re-find (re-pattern expression) source)
        "Match"  
        "No Match"
    )
)





;degenerate cases
(assert (= (simplex "" "") "Match"))

;letter - single
(assert (= (simplex "a" "t") "Match"))
(assert (= (simplex "B" "t") "Match"))
(assert (= (simplex "1" "t") "No Match"))
(assert (= (simplex " " "t") "No Match"))

;letter - multiple
(assert (= (simplex "abzABZ" "tttttt") "Match"))
(assert (= (simplex "a1cABC" "tttttt") "No Match"))
(assert (= (simplex "abc ABC" "ttttttt") "No Match"))


;digits
(assert (= (simplex "9" "d") "Match"))
(assert (= (simplex "0" "d") "Match"))
(assert (= (simplex "a" "d") "No Match"))
(assert (= (simplex " " "d") "No Match"))

(assert (= (simplex "123" "ddd") "Match"))
(assert (= (simplex "12a" "ddd") "No Match"))
(assert (= (simplex "1 3" "ddd") "No Match"))


;spaces
(assert (= (simplex " " " ") "Match"))
(assert (= (simplex "0" " ") "No Match"))
(assert (= (simplex "a" " ") "No Match"))

(assert (= (simplex "   " "   ") "Match"))
(assert (= (simplex " 1 " "   ") "No Match"))


;mixed
(assert (= (simplex "abc123" "tttddd") "Match"))
(assert (= (simplex "123abc" "tttddd") "No Match"))
(assert (= (simplex "123abc" "dddttt") "Match"))
(assert (= (simplex "abc123" "dddttt") "No Match"))

