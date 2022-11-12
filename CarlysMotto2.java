public class CarlyEventPrice
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   
   int chargePerPerson = 35;
   int numGuests;
   int totalPrice = chargePerPerson*numGuests;
   boolean lgParty = false;
   
   System.out.println("Enter the number of guests:");
   numGuests = s.nextInt();
   
   if (numGuests >= 50)
      lgParty = true;
   
   System.out.println("***************************************************");
   System.out.println("** Carly’s makes the food that makes it a party. **");
   System.out.println("***************************************************");
   
   System.out.println("Number of guests: " + numGuests);
   System.out.println("Price per guest: " + chargePerPerson);
   System.out.println("Total Price: " + totalPrice);
   
   if (lgParty == true)
      System.out.println("This is a large party");
   else
      System.out.println("This is not a large party");
}
}