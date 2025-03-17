import java.util.Scanner;

class passwordChecker {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to password checker");
         String Pass ;

         do {
             System.out.println("please creat a password");
              Pass = input.next();

         }while(!isvalidPassword(Pass));
         System.out.println("thanks for entering a valid password");
     }

     public static boolean isvalidPassword(String Password){
         return Password.length()>5;
     }
}
