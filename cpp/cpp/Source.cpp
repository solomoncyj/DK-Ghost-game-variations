#include <iostream>
#include <cstdlib>
#include <ctime>

int main () {
  srand(time(0));
  int score = 0;
  while (1) {
    int input = 0;
    cout << "Three doors ahead..." << '\n';
    cout << "a ghost is behind one." << '\n';
    cout << "Which door do you open" << '\n';
    cout << "1,2 or 3" << '\n';
    int g_door = (rand() % 3) + 1;
    try {
      cin >> input;
    }
    catch {
      cout << "Your guess must be a number and between 1 and 3 inclusive!" << '\n';
      continue;
    }
    if (input > 3 || input < 1) {
      cout << "Your guess must be a number and between 1 and 3 inclusive!" << '\n';
    }
    if (input == g_door) {
      

    }
  }
}