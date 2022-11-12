////Suzanne Schouest CSC 1301 HW 10 Hon Lab Section
/*Write a program which prompts user for the number of students in a class (a non-negative integer), and
saves it in an int variable called numStudents. It then prompts user for the grade of each of the students
(integer between 0 to 100) and saves them in an int array called grades. The program shall then compute
and print the average (in double rounded to 2 decimal places) and minimum/maximum (in int).*/
import java.util.Scanner;
public class GradeBookKeeper
{
   public static int findMax(int[] grades)
   {
   int max = grades[0];//initialize at slot 0 of array, which is a 0
   for (int i = 1; i < grades.length; i++)
   {
      if (grades[i] > max)
         max = grades[i];//redifine max if needed
   }
   return max;//return max value
   }
   
   public static double findAvg(int[] grades)
   {
   int sum = 0;
   for (int i = 1; i <= grades.length - 1; i++)
   {
      sum += grades[i];//add up each grade
   }
   double avg = sum/(grades.length - 1);//divide sum of each grade by number of student grades
   return avg;//return avg
   }
   
   public static int findMin(int[] grades)
   {
   int min = grades[1];//starting with first grade as the lowest 
   for (int i = 2; i < grades.length; i++)//cycling thru following grades
   {
      if (grades[i] < min)
         min = grades[i];//redifine min if needed
   }
   return min;//returns minimum value
   }
   
   public static void main(String[] args)
   {
   Scanner s = new Scanner(System.in);
   System.out.print("Enter the number of students in the class: ");
   int numStudents = s.nextInt();//user defines number of students
   int[] grades = new int[numStudents+1];//make array 1 larger than number of students so as to ignore slot 0 in array
   
   for (int i = 1; i <= numStudents; i++)//starting at slot 1
   {
      System.out.print("Enter the grade of student " + i + ": ");
      grades[i] = s.nextInt();//user enters grades into array 
   }
   
   System.out.println("The average was : " + String.format("%.2f", findAvg(grades)));//find avg and rounds to 2 decimal places
   System.out.println("The highest grade was a " + findMax(grades));
   System.out.println("The lowest grade was a " + findMin(grades));
   }
}
