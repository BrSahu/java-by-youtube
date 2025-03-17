import java.util.Scanner;

class minimumTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to minium of two numbers");
        System.out.print("pls enter the no");
        int num1 = input.nextInt();
        System.out.print("pls enter the second no");
        int num2= input.nextInt();
        minimumTernary ternary = new minimumTernary();
        int min = ternary.min(num1,num2);
        System.out.println("minmum no is "+ min);



    }

    public  int min(int num1 ,int num2){
        return num1 < num2 ? num1 : num2;

    }
}
