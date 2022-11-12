import java.util.Scanner; 
import java.util.Random;

public class RandomGuessMatch
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.println("Guess a number between 1 and 5!");
      
      int max = 5; //maximum value for secret number
      int min = 1; //minimum value for secret number
      int secretNum = min + rand.nextInt(max); //secret number assigned
      
      System.out.println("Enter guess: ");
      int guess = s.nextInt();
      int diff = Math.abs(secretNum-guess);//difference between secret number and guess
         
      if (guess == secretNum)
         System.out.print("You got it!"); //if true, this is printed and we're kicked out of loop
      else 
      {
         if (guess > secretNum)
         {
            System.out.println("Too high; you were off by " + diff + " places. The number was " + secretNum);//if false try again
         }
         else
         {
            System.out.println("Too low; you were off by " + diff + " places. The number was " + secretNum);//if false try again
         }
      }
   }
}
