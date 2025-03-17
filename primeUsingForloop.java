import java.util.Scanner;

public class primeUsingForloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to prime no checker");
        System.out.println("please enter a number to" +
                " check if its prime or not");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("your number is "+
                (isPrime(num) ? "prime":"not prime"));
    }

    public static boolean isPrime(int num){

        for (int i = 2; i < num;i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
