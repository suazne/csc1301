//Suzanne Schouest CSC 1301 HW 10 Hon Lab Section
/*Write a program that creates an array which can hold ten values. The user must fill the array with random
numbers from 1 to 100. The program then displays the values in the array on the screen. Then you should
create your java algorithm to search to find the largest value in the array, and display that value and its
slot number.*/
import java.util.Scanner;
import java.util.Arrays;
public class DisplayArray
{
   public static void main(String[] args)
   {
   int[] displayArray = new int[10];
   int maxValue = 0;//start maxValue at a value of 0
   int maxPosition = 0;//start max position at beginning of string

   Scanner s = new Scanner(System.in);
   System.out.println("Enter 10 values to fill the array:");
   for (int i = 0; i < displayArray.length; i++) 
   {
      displayArray[i] = s.nextInt();//user defines the value in each "slot" of the array
      while ((displayArray[i] > 100) || (displayArray[i] < 1))//checking bounds
      {
         System.out.println("values must be integers between 1 and 100. Give a new value for slot " + i + " below.");
         displayArray[i] = s.nextInt();//redifine value if it doesnt fall between 1 and 100
      }
   }
   
   String arrString = Arrays.toString(displayArray);//convering array to string for easy printing
   System.out.println("Content of displayArray: " + arrString);
   
   for (int j = 0; j < displayArray.length; j++)//loop thru each "slot" in Array
   {
      if (displayArray[j] > maxValue)
      {
         maxValue = displayArray[j];//redifine max if needed
         maxPosition = j;//redifine position of maxValue if needed
      }
   }
   
   System.out.println("The largest value of displayArray is " + maxValue);
   System.out.println("The value " + maxValue + " occurs in slot " + maxPosition + " of the array.");
   }
}
   