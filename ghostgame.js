const readline = require('readline');
const rd = require('random');

let score = 0;

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function ask() {
  console.log('Three doors ahead...\na ghost is behind one.\nWhich door do you open?');
  rl.question('1,2 or 3?', (answer) => {
    const userGuess = parseInt(answer, 10);

    if (isNaN(userGuess) || userGuess > 3 || userGuess < 1) {
      console.log('Your guess must be a number and between 1 and 3 inclusive!');
      ask();
      return;
    }

    const gDoor = rd.randint(1, 3);

    if (userGuess === gDoor) {
      console.log('GHOST! \nRun away!\nGame over! you scored ${score}');
      rl.close();
    } else {
      console.log('No ghost!\nYou enter the next room.');
      score += 1;
      ask();
    }
  });
}

ask();
