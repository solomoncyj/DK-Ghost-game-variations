
namespace Program
{
    class Program {         
        static void Main(string[] args)
        {
            int score = 0;
            Random rnd = new Random();
            int sDoor = 0;
            while (true)
            {
                Console.WriteLine("Three doors ahead");
                Console.WriteLine("a ghost is behind one");
                Console.WriteLine("Which door do you open");
                Console.WriteLine("1,2 or 3?");
                int gDoor = rnd.Next(1, 4);
                if (!(int.TryParse((Console.ReadLine()), out sDoor)))
                {
                    Console.WriteLine("Your answer must be between 1 and 3 inclusive!");
                    continue;
                }
                if (gDoor == sDoor)
                {
                    Console.WriteLine ("Run away");
                    Console.WriteLine ("Game over!");
                    Console.WriteLine($"you scored {score}");
                    break;
                } 
                else if(sDoor < 1 || sDoor > 3)
                {
                    Console.WriteLine("Your answer must be between 1 and 3 inclusive!");
                } 
                else {
                    Console.WriteLine ("No Ghost!");
                    Console.WriteLine ("You enter that next room");
                    score ++;
                }

            }
            
        }
    }
}