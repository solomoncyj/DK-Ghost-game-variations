import java.util.Random;
import java.util.Scanner;
public class ghostgame {
    public static void main(String[] args) 
    {
        double score = 0;
        Random rand = new Random();
        try (Scanner input = new Scanner(System.in)) {
            while (true){
                System.out.println("Three doors ahead...\na ghost is behind one.\nWhich door do you open?\n 1,2, or 3?");
                int g_door = rand.nextInt(3);
                g_door ++;
                int s_door = input.nextInt();
                if (s_door == g_door) {
                    System.out.println("GHOST! \nRun away!\nGame over! you scored" + score);
                    break;
                } else if (s_door < 1 || s_door > 3) {
                    System.out.println("CHEATER");
                    score --;
                }else {
                    System.out.println("No ghost!\nYou enter the next room.");
                    score ++ ;
                }
            }
        }
    }
}
