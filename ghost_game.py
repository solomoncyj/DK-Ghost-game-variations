import random as rd

# Initialize score to 0
score = 0

# Loop through the rooms
while (True):
    print('Three doors ahead...\na ghost is behind one.\nWhich door do you open?')

    # Generate a random door number (1, 2, or 3)
    g_door = rd.randint(1, 3)

    # Get the user's guess
    user_input = input('1, 2, or 3? ')

    # Check if the user's input is a valid number
    if not user_input.isdigit():
        print("Your guess must be a number and between 1 and 3 inclusive!")
        continue

    # Convert the user's input to an integer
    user_guess = int(user_input)

    # Check if the user's guess is valid (between 1 and 3 inclusive)
    if user_guess < 1 or user_guess > 3:
        print("Your guess must be a number and between 1 and 3 inclusive!")
        continue

    # Check if the user's guess is correct
    if user_guess == g_door:
        print('GHOST! \nRun away!\nGame over! you scored {}'.format(score))
        break
    else:
        print('No ghost!\nYou enter the next room.')
        score += 1

# Display the final score
print('You scored {} points!'.format(score))
