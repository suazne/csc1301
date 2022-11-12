//Suzanne Schouest Honors CSC 1301 Lab
/*This program takes an input of an integer and lets the user know its number of digits, 
largest digit, and reverse of the integer. This simply program incorporates the creation of 
methods in a class, basic tasks such as reversing an integer, loops, using user input, etc.
*/
import java.util.Scanner;
public class NumberFun
{
   public static int numDigits(int num) //gives number of digits in the integer
   {
      int i;//index
      for (i = 0; num > 0; i++)
      {
         num = num / 10;//with every loop, num looses a decimal place. The loop stops at 0.
      }
      return i;//return how many times the loop repeated before num = 0: this gives the number of digits in num
   }
   public static int maxDigit(int num)
   {
      int max = 0;//initializing max, the largest digit in the integer
      int digit;
      for (int i = 0; num > 0; i++)
      {
         digit = num % 10;//isolates the digit so we can compare the digit to the current maximum
         if (digit > max)
            max = digit;//setting new max, if needed
         num = num / 10;//moving decimal place over to look at the next digit in the integer
      }
      return max;//return maximum digit
   }
   public static int reverseDigits(int num)
   {
      int reverse = 0;//initializing reverse, the reverse of num
      int remainder;//initializing remainder, which will be a placeholder for each digit of num within the loop
      while (num > 0)//the while loop will continue until we have looked at each digit
      {
         remainder = num % 10;//isolates the digits so we can make a new number "reverse" out of each digit
         reverse = ((reverse * 10) + remainder);//places each digit in reverse order
         num /= 10;//gets rid of end digit of num so we can move on to next digit in num
      }
      return reverse;//returns the reverse number
   } 
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int num = 1;//initializing num
      
      for (int i = 0; num != 0; i++)//loop until user enters "0" to end loop
      {
         System.out.println("Please enter a positive integer or a 0 to stop: ");
         num = s.nextInt();//num becomes what the user enters
         
         if (num != 0){//if the user didn't enter zero, continue to print the following
            System.out.println(num + " has " + numDigits(num) + " digit(s)");
            System.out.println("The max digit of " + num + " is " + maxDigit(num));
            System.out.println(num + " reversed is " + reverseDigits(num));}
         else 
            System.out.println("Thank you. Goodbye.");//say goodbye and with num = 0, we will be kicked out of loop
      }
   }
}
      
