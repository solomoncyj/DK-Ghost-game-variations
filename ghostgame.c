#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void) {
    // Initialize score to 0
    int score = 0;

    // Seed the random number generator
    srand(time(NULL));

    // Loop through the rooms
    while (1) {
        printf("Three doors ahead...\na ghost is behind one.\nWhich door do you open?\n");

        // Generate a random door number (1, 2, or 3)
        int g_door = rand() % 3 + 1;

        // Get the user's guess
        int user_guess;
        printf("1, 2, or 3? ");
        scanf("%d", &user_guess);

        // Check if the user's guess is valid (between 1 and 3 inclusive)
        if (user_guess < 1 || user_guess > 3) {
            printf("Your guess must be a number and between 1 and 3 inclusive!\n");
            continue;
        }

        // Check if the user's guess is correct
        if (user_guess == g_door) {
            printf("GHOST! \nRun away!\nGame over! you scored %d\n", score);
            break;
        } else {
            printf("No ghost!\nYou enter the next room.\n");
            score++;
        }
    }

    // Display the final score
    printf("You scored %d points!\n", score);

    return 0;
}
