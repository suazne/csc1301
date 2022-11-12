//Suzanne Schouest CSC 1301 HW 10 Hon Lab Section
/* Write a program called PrintOutMyArray which prompts user for the number of items in an array 
(a nonnegative integer), and saves it in an int variable called numItems. It then prompts user for 
the values of all the items and saves them in an int array called items. The program shall then print 
the contents of the array in the form of [x1, x2, ..., xn].*/
import java.util.Scanner;
import java.util.Arrays;
public class PrintOutMyArray
{
   public static void main(String[] args)
   {
   Scanner s = new Scanner(System.in);
   System.out.print("Enter the number of items: ");
   int numItems = s.nextInt();
   int[] items = new int[numItems];
   
   System.out.print("Enter the value of all items (separated by space): ");
   for (int i = 0; i < numItems; i++)
   {
      items[i] = s.nextInt();
   }
   
   String arrString = Arrays.toString(items);//convering array to string for easy printing
   System.out.print("The values are: " + arrString);
   }
}
