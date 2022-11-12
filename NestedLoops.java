//Suzanne Schouest CSC 1301 Honors Section Homework 8 Program 1

/*I would submit one zip file with all my homeowork files in it but I don't know 
if I am going to be able to finish the otherassignments because I procrastinated*/

import java.util.Scanner;
public class NestedLoops
{
public static void main (String [] args) 
{
   Scanner s = new Scanner(System.in);
   int numRows;
   int numColumns;
   int currentRow;
   int currentColumn;
   char currentColumnLetter;
   
   System.out.print("Enter number of rows: ");
   numRows = s.nextInt();
   System.out.print("Enter number of columns: ");
   numColumns = s.nextInt();
   
   for (currentRow = 1; currentRow <= numRows; currentRow++) 
   {
      currentColumnLetter = 'A';
      for (currentColumn = 1; currentColumn <= numColumns; currentColumn++) 
      {
         System.out.print(currentRow);
         System.out.print(currentColumnLetter + " ");
         currentColumnLetter++;
      }
   }
   System.out.println("");
}
}