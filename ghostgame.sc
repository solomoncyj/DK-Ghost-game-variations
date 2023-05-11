import scala.util.Random

// Initialize score to 0
var score = 0

// Create a Random object
val rnd = new Random

// Define a function to get a random door number (1, 2, or 3)
def getRandomDoor: Int = rnd.nextInt(3) + 1

// Define the main game loop
while (true) {
  println("Three doors ahead...")
  println("A ghost is behind one.")
  println("Which door do you open?")

  // Generate a random door number
  val gDoor = getRandomDoor

  // Get the user's guess
  val userInput = scala.io.StdIn.readLine("1, 2, or 3? ")

  // Check if the user's input is a valid number
  if (!userInput.forall(_.isDigit)) {
    println("Your guess must be a number and between 1 and 3 inclusive!")
  } else {
    // Convert the user's input to an integer
    val userGuess = userInput.toInt

    // Check if the user's guess is valid (between 1 and 3 inclusive)
    if (userGuess < 1 || userGuess > 3) {
      println("Your guess must be a number and between 1 and 3 inclusive!")
    } else {
      // Check if the user's guess is correct
      if (userGuess == gDoor) {
        println(s"GHOST! \nRun away!\nGame over! You scored $score points.")
        sys.exit(0)
      } else {
        println("No ghost!\nYou enter the next room.")
        score += 1
      }
    }
  }
}

// Display the final score
println(s"You scored $score points!")
