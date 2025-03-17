import java.util.Scanner;
class SimpleCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to simple calculater");
        System.out.println("please enter the 1st no ");
        int num1 = input.nextInt();
        System.out.println("please enter the 2nd no ");
        int num2 = input.nextInt();
        System.out.println("please enter the operator ");
        String op = input.next();
        int result = switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };
        System.out.println("your answer is " + result);
    }
}

