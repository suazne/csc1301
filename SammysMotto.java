import java.util.scanner;
public class MadLibs
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   
   System.out.println("After each line, enter words to complete sentences in order to finish the story!");
   System.out.println("Mary had a little (noun)");
   String word1 = s.nextLine();
   
   System.out.println("Its (noun) was (adjective) as snow");
   String word2 = s.nextLine();
   String word3 = s.nextLine();

   System.out.println("And everywhere that Mary (past tense verb)");
   String word4 = s.nextLine();
   
   System.out.println("Mary had a little " + word1);
   System.out.println("Its " + word2 + " was " + word3 + " as snow");
   System.out.println("And everywhere that Mary " + word4);
   System.out.println("The " + word1 + " was sure to go.");
   
}
}