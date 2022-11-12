import java.util.Scanner;

public class Half_XmasTree
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the desired number of rows:");
      int r = s.nextInt();
      
      for (int i = 0; i < r; i++) //initialize loop to be sure the prorper number of rows are printed
      {
         for (int j = 0; j < i; j++)
         {
            System.out.print(" "); //spaces for between stars
         }
         for (int j = 0; j < (r - i); j++)
         {
            System.out.print("*"); //star for tree
         }
         System.out.println();
      }
   }
}
