import java.util.Scanner;

public class Full_XmasTree
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Please enter the desired number of rows:");
      int r = s.nextInt(); //initializing number of rows
      
         for (int i = 0; i < r; i++) //creating tree itself (without trunk)
         {
            for (int j = r - i; j > 1; j--)
            {
               System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
         System.out.println();
         }
         for (int j = r; j > 1; j--) 
         {
            System.out.print(" "); //blank spaces for around trunk 
         }
         for (int j = 0; j <= 0; j++)
         {
            System.out.print("* "); //forming skinny upper part of trunk
         }
         System.out.println();
         for (int i = 0; i < (r - 2)/2; i++) //forming lower part of trunk
         {
            for (int j = r - i; j > 1; j--)
            {
               System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) 
            {
               System.out.print("* ");
            }
         System.out.println();
        }

    }

}