/* Here the user inputs two numbers, the computer chooses a random "secret" number,
 * and the user guesses the number. If they are wrong, the computer tells them how 
 * far off they are! 
 */
import java.util.Scanner;
import java.util.Random;

public class Guess_A_Number
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.println("Guess the Secret number!");
      System.out.print("Enter maximum value for secret number: ");
      
      int max = 5; //maximum value for secret number
      int secretNum = rand.nextInt(max); //secret number assigned
      
      int guess = secretNum - 1; //initializing guess as something that cannot be the secret number and will allow the for loop to start
      
      for (int attempts = 0; guess != secretNum; attempts++)
      {
         System.out.println("Enter guess: ");
         guess = s.nextInt();
         int diff = abs(secretNum-guess);//difference between secret number and guess
         
         if (guess == secretNum)
            System.out.print("You won in " + attempts + " attempts!"); //if true, this is printed and we're kicked out of loop
         else 
         {
            if (guess > secretNum)
            {
               System.out.println("Too high; you off by " + diff + " places. try again!");//if false try again
            }
            else
            {
               System.out.println("Too low; you off by " + diff + " places. try again!");//if false try again
            }
         }
      }
   }
}
