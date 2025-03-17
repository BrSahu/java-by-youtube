import java.util.Scanner;

class AbsoluteValue {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to the Absolute value of integer no");
         System.out.println("pls entae ur no");
         int num = input.nextInt();
         int result = num >= 0 ? num : - num;
         System.out.println("absolute value is"+result);

     }
}
