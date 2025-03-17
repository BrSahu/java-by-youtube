import java.util.Scanner;

class MonthOfTheYear {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to check in which month we r in");
         System.out.println("pls the month no");
         int num = input.nextInt();
         String monthName = getMonthName(num);
         System.out.println("your month name is "+ monthName);

     }
     public static String getMonthName(int num){
        return switch (num) {
             case 1 -> "january";
             case 2 -> "febuary";
             case 3 -> "march";
             case 4 -> "april";
             case 5 -> "may";
             case 6 -> "june";
             case 7 -> "july";
             case 8 -> "august";
             case 9 -> "september";
             case 10 -> "october";
             case 11-> "november";
             case 12 -> "december";
             default -> "mars month";
         };



    }
}
