//Suzanne Schouest Hon CSC 1301 Homework 9 Strings PROGRAM #2
import java.util.Scanner;
public class NameAssess//splits a string of user's name to first/last names, outputs lengths, and initials
{
public static void main(String args[])
{
   boolean cont = true;//initializing boolean that will determine if the loop continues or not
   int input;//yes/no input for user promt (asking if they want to enter another name as well)
   do
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your first and last name, separated by a space:");
      String fullName = s.nextLine();
      fullName = fullName.trim();//gets rid of leading or trailing spaces
      
      int spacePos = fullName.indexOf(' ');//finding space between first/last names
      
      String firstName = fullName.substring(0, spacePos);//first name in a string
      String lastName = fullName.substring(spacePos+1);//second name in a string
      lastName = lastName.trim();//trim in case there was more than one space in the fullName string
      
      //the first/last names, length of the names, and initials are printed below, along with the option to enter another name
      System.out.println("Hello there " + fullName + '!'); 
      System.out.println("Your first name, " + firstName + ", has " + firstName.length() + " characters.");
      System.out.println("Your last name, " + lastName + ", has " + lastName.length() + " characters.");
      System.out.println("Also, your initials are " + firstName.charAt(0) + lastName.charAt(0) + '!');
      System.out.println("Do you wish to enter another name? Enter 'Y' for yes, or 'N' for no (case sensitive).");
      input = s.next().charAt(0);
      
      if (input == 'Y'){//if they enter yes, the boolean cont is true, repeating the loop
      cont = true;}
      else{//if they enter anything other than Y (so, N), the boolean cont is false, ending the loop
      cont = false;}
   } while (cont == true);//condition of repeating loop: user inputs "Y"
   System.out.println("Goodbye.");
}
}
