//Suzanne Schouest CSC 1301 HW 10 Hon Lab Section
/*Write a program called StarryArrays which prompts user for the number of items in an array 
(a non-negative integer), and saves it in an int variable called numItems. It then prompts 
user for the values of all the items (non-negative integers) and saves them in an int array 
called items. The program shall then print the contents of the array in a graphical form, 
with the array index and values represented by number of star*/
import java.util.Scanner;
public class StarryArrays
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
   for (int j = 0; j < items.length; j++) 
   {
      System.out.print("slot " + j + ": ");
      for (int v = 0; v < items[j]; v++) 
      {
         System.out.print("*");
      }
      System.out.println("(" + items[j] + ")");
   }
   }
}
