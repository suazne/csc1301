import java.util.Scanner;

public class Lab7
{
   public static int findMax(int[] myList)
   {
      int max = 0;
      for (int i = 0; i < myList.length; i++)
      {
         if (myList[i] > max)
         i = max;
      }    
      return max;
   }
   
   public static float findAvg(int[] myList)
   {
      int sum = 0;
      for (int i = 0; i < myList.length; i++)
      {  
         sum = sum + myList[i];
      }
      float avg = (sum / myList.length) + (sum % myList.length);
      return avg;
   }
   public static int intLarger(int[] myList, int userNum)
   {
      int v = 0;
      for (int i = 0; i < myList.length; i++)
      {
         if (myList[i] > userNum)
         v++;
      }    
      return v;
   }
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter an integer for the size of your array:");
      int size = s.nextInt();
      
      int[] myList = new int[size];
   
      for (int i = 0; i < size; i++)
      {
         System.out.println("Enter an integer:");
         int position = s.nextInt();
         myList[i] = position;
      }
      
      System.out.println("Enter an integer to find count larger than:");
      int userNum = s.nextInt();
            
      System.out.println("The max value is: " + findMax(myList));
      System.out.println("The average value is: " + findAvg(myList));
      System.out.println("The number of values greater than " + userNum + " is: " + intLarger(myList, userNum));
   }
}