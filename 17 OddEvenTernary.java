import java.util.Scanner;

class OddEvenTernary {
    public static void main(String[] args) {
        System.out.println("welcome to check if the given no is odd or even");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the no");
        int num1 = input.nextInt();
        //OddEvenTernary ternary = new OddEvenTernary();
        String result = (num1 % 2 == 0) ?"even" : "not even";
        System.out.println("your no is "+ result);
    }

}


