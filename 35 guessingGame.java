import java.util.Scanner;

 class guessingGame {

    int random ;
    guessingGame(){
        random = (int) Math.round(Math.random()*100);
    }

    /**
     * @param guessNumber the number that player guessed
     * @return
     * - negative if the guessed number is smaller
     * - positive if the guessed number is higher
     * - 0 if the guessed number is correct
     */
    int guess(int guessNumber){
     return guessNumber - random;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        guessingGame game = new guessingGame();
        System.out.println("welcome to the number guessing game ");
        System.out.println("enter the number u guess between 1-100 ");
        int guess ;
        int result ;
        do {
            System.out.println("guess the number: ");
            guess =  input.nextInt();
            result= game.guess(guess);
            if (result == 0) {
                System.out.println("congrats , your guess is correct");
            }else if (result < 0 ){
                System.out.println("please guess a higher number ");
            }else {
                System.out.println("please guess a lower number ");
            }
        }while (result != 0);


    }

}
