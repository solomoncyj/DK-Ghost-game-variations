package main

import (
	"crypto/rand"
	"fmt"
	"math/big"
)



func main() {
	var score int = 0
	var s_door int
	for {
		fmt.Println("Three doors ahead")
		fmt.Println("a ghost is behind one")
		fmt.Println("Which door do you open")
		fmt.Println("1,2, or 3?")
		g_door, _ := rand.Int(rand.Reader, big.NewInt(4))
		fmt.Scanln(&s_door)
		if s_door < 1 || s_door > 3 {
			// sad path 1
			score = score - 1
			fmt.Println("your answer must be between 1 and 3 inclusive!")
			continue
		}
		
		if int(g_door.Int64()) == s_door {
			
			fmt.Println("GHOST!")
			fmt.Println("Run away")
			fmt.Println("Game over!")
			fmt.Println("you scored", score)
			break
		}
		fmt.Println("No ghost!")
		fmt.Println("You enter the next room.")
	  	score ++
		
	}
}
