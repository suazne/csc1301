//Suzanne Schouest CSC 1301 Honors Fall 2021
//This program promts a user to create a password that fits certain requirements as listed below

import java.util.Scanner;
public class TestPassword
{
public static boolean passwordCheck(String password)
{
   int numUpperCase = 0;
   int numLowerCase = 0;
   int numDigits = 0;
   int numSpecial = 0;
   String special = "~!@#$%^&*";//reference string for special characters
   int numSpace = 0;

   for (int i = 0; i < password.length(); i++)//cycling through string by each character
   {
      char c = password.charAt(i);
   
      if (Character.isUpperCase(c))//if character is an uppercase letter, count
      numUpperCase++;
      if (Character.isLowerCase(c))//if character is a lowercase letter, count
      numLowerCase++;
      if (Character.isDigit(c))//if character is a digit, count
      numDigits++;
      if (special.indexOf(c) != -1)//if character is one of the symbols from the special string, count
      numSpecial++;
      if (Character.isWhitespace(c))
      numSpace++;
   }
   
   if (password.length() < 10)//if password isn't long enough
   {
      System.out.println("Your password must be at least 10 characters long");
      return false;//invalid
   }
   else if (numUpperCase < 2)//if password doesn't contain at least 2 uppercase letters
   {
      System.out.println("Your password must contain at least 2 uppercase letters");
      return false;//invalid
   }
   else if (numLowerCase < 4)//if password doesn't contain at least 4 lowercase leters
   {
      System.out.println("Your password must contain at least 4 lowercase letters");
      return false;//invalid
   }
   else if (numDigits < 1)//if password doesn't contain at least 1 digit
   {
      System.out.println("Your password must contain at least one digit");
      return false;//invalid
   }
   else if (numSpecial < 1)//if password doesn't contain at least 1 special character
   {
      System.out.println("Your password must contain at least 1 special character");
      return false;//invalid
   }
   else if (numSpace > 0)
   {
      System.out.println("Your password cannot contain any spaces");
      return false;//invalid
   }
   else //if all of the requirements are met, return true (valid)
   {
      return true;
   }
}
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   System.out.println("Enter a password below. The password must contain the following:");//list of requirements
   System.out.println("- at least 10 characters");
   System.out.println("- at least 2 uppercase letters");
   System.out.println("- at least 4 lowercase letters");
   System.out.println("- at least 1 digit");
   System.out.println("- at least 1 special character");
   System.out.print("Password: ");//prompted for input
 
   String password = s.next();//user inputs password
   
   while (passwordCheck(password) == false)//repeat until true (password is valid and meets requirements)
   {
      System.out.println("Try again!");
      System.out.print("Password: ");
      password = s.next();//redifine password with each loop, if needed
   }
   
   if (passwordCheck(password) == true)
   System.out.println("Valid password. Have a good Day! Goodbye.");//notification of validity
}
}