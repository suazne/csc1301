//Suzanne Schouest CSC 1301 Hon Section Homeowrk 8 Program 2
/* This program takes a string of characters (a telephone number than can include digits
 * or letters) and converts them into a telephone number consisting of only digits.
 */
import java.util.Scanner;
public class PhoneNumberDecoder 
{
public static void main(String[] args) 
{
   Scanner s = new Scanner(System.in);
   String phoneStr; // User input: Phone number string
   int i; // Current index in phone number string
   char currChar; // Current char in phone number string
   int currCharNum; //number equivalent for letters
   
   System.out.print("Enter phone number: ");
   phoneStr = s.next();
   
   System.out.print("Numbers only: ");
   for (i = 0; i < phoneStr.length(); ++i) 
   {  // For each element
      //Enter phone number: 1-555-HOLIDAY
      //Numbers only: 1?555????????
   currChar = phoneStr.charAt(i);
   if ((currChar >= '0') && (currChar <= '9')) 
   {
      System.out.print(currChar); // Print character as is
   } 
   else 
   {
      if (currChar == '-')
      System.out.print(""); //get rid of dash, but dont print a question mark!
      
      else {
      if((currChar == 'A') || (currChar == 'B') || (currChar == 'C')) //changes letters to nums
      System.out.print(2);
      
      else {
      if((currChar == 'D') || (currChar == 'E') || (currChar == 'F')) //changes letters to nums
      System.out.print(3);
      
      else {
      if((currChar == 'G') || (currChar == 'H') || (currChar == 'I')) //changes letters to nums
      System.out.print(4);

      else {
      if((currChar == 'J') || (currChar == 'K') || (currChar == 'L')) //changes letters to nums
      System.out.print(5);

      else {
      if((currChar == 'M') || (currChar == 'N') || (currChar == 'O')) //changes letters to nums
      System.out.print(6);
     
      else {
      if((currChar == 'P') || (currChar == 'Q') || (currChar == 'R') || (currChar == 'S')) //changes letters to nums
      System.out.print(7);
      
      else {
      if((currChar == 'T') || (currChar == 'U') || (currChar == 'V')) //changes letters to nums
      System.out.print(8);
      
      else {
      if((currChar == 'W') || (currChar == 'X') || (currChar == 'Y') || (currChar == 'Z')) //changes letters to nums
      System.out.print(9);
      
      else {
      System.out.print('?');} //anything that isn't a letter or number or dash becomes a question mark
      
   }
   }
   }
   }
   }
   }
   }
   }
   }
   }
}
}
  
