import java.util.Scanner;

public class testing {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter an integer: "); // Initial prompt for input

      // Repeat until next item is an integer
      while (!scan.hasNextInt()) 
      {        
          scan.next(); // Read and discard offending non-int input
          System.out.print("Please enter an integer: "); // Re-prompt
      }
      
      // At this point in the code, the user has entered an integer
      int input = scan.nextInt(); // Get the integer
      
      // And now you can use the input variable.
      System.out.println(input);
}
}