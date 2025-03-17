import java.util.Scanner;

class studentScoreTernary {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("pls enter the marks of the student");
         int marks = input.nextInt();
         studentScoreTernary x = new studentScoreTernary();
          x.score( marks);

     }
//     public static int score(int num) {
//         if (num > 80) {
//             System.out.println("students marks are high");
//         } else if (num < 80 || num > 50) {
//             System.out.println("students marks are moderate");
//
//         } else {
//             System.out.println("students marks are low");
//         }
//            return score(int num);
//     }
public void score(int num) {
    // Using a ternary operator to categorize the score
    String result = (num > 80) ? "Student's marks are high" :
            (num >= 50 && num <= 80) ? "Student's marks are moderate" :
                    "Student's marks are low";

    System.out.println(result);
}
}
