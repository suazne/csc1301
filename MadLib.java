import java.util.Scanner;
public class MadLib
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   
   System.out.println("After each line, enter words to complete sentences in order to finish the story!");
   System.out.println("Twinkle twinkle little (noun)");
   String word1 = s.nextLine();
   
   System.out.println("How I wonder what you (verb).");
   String word2 = s.nextLine();

   System.out.println("Up above the (noun) so high,");
   String word3 = s.nextLine();
   
   System.out.println("like a (noun) in the sky.");
   String word4 = s.nextLine();
   
   System.out.println("Twinkle twinkle little " + word1);
   System.out.println("How I wonder what you " + word2);
   System.out.println("Up above the " + word3 + " so high,");
   System.out.println("like a " + word4 + " in the sky.");
   
}
}