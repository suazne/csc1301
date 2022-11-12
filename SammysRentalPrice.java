import java.util.Scanner;
public class SammysRentalPrice
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   System.out.println("Enter duration of rental in minutes:");
   int min = s.nextInt();
   int hrs = min/60;
   min = min%60;
   int pricePerHr = 40;
   int pricePerMin = 1;
   int totalPrice = hrs*pricePerHr + min*pricePerMin;
   
   System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   System.out.println("SS Sammy’s makes it fun in the sun SS");
   System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
   
   System.out.println("Hours: " + hrs);
   System.out.println("Min: " + min);
   System.out.println("Total Price: " + totalPrice);
}
}