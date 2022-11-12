public class Ascii_Tree
{
   public static void main(String[] args)
   {
      for (int i = 0; i < 10; i++)
      {
         for (int j = 0; j < 10-i; j++)
         {
            System.out.print(" "); //spaces for each row
         }
         for (int j = 0; j < i; j++)
         {
            System.out.print("\\"); // back slashes for each row of tree 
         }
         System.out.print("|"); //center of tree for each row all the way down
         for (int j = 0; j < i; j++)
         {
            System.out.print("/");//forward slashes for each row of tree
         }
         System.out.println(); //entering at the end of the row to go to next row
         
      }
   }
}