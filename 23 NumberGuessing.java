import java.util.Scanner;

class NumberGuessing {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("welcome to number guessing game");
            int num ;
             do {
                 System.out.println("please enter a number between 1-50");
                  num = input.nextInt();
             }while (!isSameNo(num));
            System.out.println("u hv guessed a correct number");
        }


        public static boolean isSameNo(int num){
            return num == 25 || num ==50 || num == 1;
        }
    }


