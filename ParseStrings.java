//Suzanne Schouest Hon CSC 1301 Homework 9 Strings PROGRAM #3
import java.util.Scanner;
public class ParseStrings//splits one string into two strings; loops over and over until 'q' is entered
{
public static void main(String args[])
{
   Scanner s = new Scanner(System.in);
   String str1;

   do
   {
      System.out.println("Please enter a string below that contains two words separated by a comma. Enter 'q' to quit (case sensitive).");
      str1 = s.nextLine();

      if (!"q".equals(str1))//as long as 'q' hasn't been entered, 
      {
         while (str1.indexOf(',') < 0)//does the string contain a comma? if not:
         {
            System.out.println("Your string must contain a comma. Try again.");
            System.out.println("Please enter a string below that contains two strings separated by a comma.");
            str1 = s.nextLine();//user enters a new value to fit requirements
         }
      
      str1 = str1.trim();//trim leading/trailing spaces
      int commaPos = str1.indexOf(',');//find where the comma position is
      
      String word1 = str1.substring(0, commaPos);//extract first word
      word1 = word1.trim();//trim leading/trailing spaces
      String word2 = str1.substring(commaPos+1);//extract second word
      word2 = word2.trim();//trim leading/trailing spaces
      
      //print out substrings
      System.out.println("First word: " + word1);
      System.out.println("Second word: " + word2);
      }
   } while (!"q".equals(str1));//so long as the string doesn't equal "quit," the loop will continue
   System.out.println("Goodbye.");
}
}