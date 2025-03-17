import java.util.Scanner;

class OccurencesForEach {

         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             System.out.println("welcome to finding the occurences");
             int[] arr = Arrayutility.inputArray();
             System.out.println("enter a no u want to find ");
             int element = input.nextInt();
             int occ = countOccurences(arr , element);
             System.out.println("your element was found "+ occ +" times");

     }

     public static int countOccurences(int[] Arr,int element){
             int occ = 0;
             for(int num :Arr){
                 if (num == element){
                     occ++;
                 }
             }
             return occ;
     }

 }
