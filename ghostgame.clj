(ns ghost-game
  (:import (java.util Random)))

;; Initialize score to 0
(def score 0)

;; Create a Random object
(def rnd (Random.))

;; Define a function to get a random door number (1, 2, or 3)
(defn get-random-door []
  (inc (rnd/nextInt 3)))

;; Define the main game loop
(while true
  (println "Three doors ahead...")
  (println "A ghost is behind one.")
  (println "Which door do you open?")

  ;; Generate a random door number
  (def g-door (get-random-door))

  ;; Get the user's guess
  (def user-input (read-line))

  ;; Check if the user's input is a valid number
  (if-not (string/isNumeric user-input)
    (do
      (println "Your guess must be a number and between 1 and 3 inclusive!")
      (recur))

    ;; Convert the user's input to an integer
    (let [user-guess (Integer/parseInt user-input)]
      ;; Check if the user's guess is valid (between 1 and 3 inclusive)
      (if (or (< user-guess 1) (> user-guess 3))
        (do
          (println "Your guess must be a number and between 1 and 3 inclusive!")
          (recur))

        ;; Check if the user's guess is correct
        (if (= user-guess g-door)
          (do
            (println "GHOST! \nRun away!\nGame over! You scored" score "points.")
            (break))
          (do
            (println "No ghost!\nYou enter the next room.")
            (def score (inc score))
            (recur)))))))

;; Display the final score
(println "You scored" score "points!")
