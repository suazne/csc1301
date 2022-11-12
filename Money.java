public class Money{ //demo nested in class program
   public static void main(String args[]){
      
    for (int i = 1; i <= 5; i++) { // imnner curly for loop outside then flows below
        for (int j = 1; j <= 10; j++) { // curly for the prints * and money
            System.out.print("*");
        }
        System.out.print("money");   // to end the line
    }
   }
   }