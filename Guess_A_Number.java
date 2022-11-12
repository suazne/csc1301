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
      
      int max = s.nextInt(); //maximum value for secren number
      int secretNum = rand.nextInt(max); //secret number assigned
      
      
      System.out.println("A new secret number has been chosen.");
      int guess = secretNum - 1; //initializing guess as something that cannot be the secret number and will allow the for loop to start
      
      
      for (int attempts = 0; guess != secretNum; attempts++)
      {
         System.out.println("Enter guess: ");
         guess = s.nextInt();
         
         if (guess == secretNum)
            System.out.print("You won in " + attempts + " attempts!"); //if true, this is printed and we're kicked out of loop
         else 
         {
            if (guess > secretNum)
               System.out.println("Too high; try again!");//if false try again
            else
               System.out.println("Too low; try again!");//if false try again
         }
      }
   }
}
