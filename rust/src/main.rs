use rand::Rng;
use std::io::stdin;
fn main() {
    let mut score: u64 = 0;
    let mut rng = rand::thread_rng();
    let mut chosenDoor = String::new();
    while let Ok(door @ 1..=3) = stdin()
        .read_line(&mut chosenDoor)
        .expect("unable to read from stdin")
        .trim()
        .parse()
    {
        let ghostDoor = rng.gen_range(1, 4);
        match chosenDoor {
            ghostDoor => {
                println!("Run away");
                println!("Game over!");
                println!("You scored {}", score);
                return;
            }
            _ => {
                println!("No ghost!");
                println!("You enter the next room.");
                score += 1;
            }
        }
    }
    println!("Your answer must be between 1 and 3 inclusive!");
}
