import java.util.Scanner;

class PallindromeRecursion {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to pallindrome checker");
         System.out.println("enter the string to be checked");
         String str = input.next();
         System.out.println("your string is : "+
                 ((isPallindrome(str) ? "Pallindrome"
                                      : "not Pallindrome ")));

     }
     public static boolean isPallindrome(String str){
         if (str.length() <=1){
             return true;
         }
         int lastpos = str.length() -1;
         if (str.charAt(0) != str.charAt(lastpos)) {
             return false;
         }
         String newStr = str.substring(1,lastpos);
         return isPallindrome(newStr);
     }
}
