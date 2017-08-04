(println 
    (apply
        (fn [a b] 
            (if 
                (re-find 
                    (re-pattern 
                        (str 
                            \^
                            (apply 
                                str 
                                (map 
                                    #(case 
                                        %1 
                                        \t "[a-zA-Z]" 
                                        \d "[0-9]" 
                                        \  " "
                                        ""
                                     ) 
                                     b
                                ) 
                            )
                            \$
                        )
                    )
                    a
                )
                "Match"  
                "No Match"
            )
        )
        *command-line-args*
    )
)