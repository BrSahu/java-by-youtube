import java.util.Scanner;

class multiplicationForloop {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to multiplication table of a no ");
         System.out.println("please enter a number u want a table of");
         int num = input.nextInt();
         int result;
         for (int i=1;i<11;i++){
             result = num * i;
             //System.out.println("your table is "+result);
             System.out.println(num+"x"+i+"="+result);
         }


     }
}
