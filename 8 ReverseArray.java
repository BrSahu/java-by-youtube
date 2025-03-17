//import static jdk.internal.util.ArraysSupport.reverse;

class ReverseArray {
     public static void main(String[] args) {
         System.out.println(" welcome to Array reversal\n");
         int[] numArr = Arrayutility.inputArray();
         reverse(numArr);
         System.out.println("your reversed Array is ");
         Arrayutility.displayArray(numArr);
     }

    public static void reverse(int[] arr) {
         int i=0;
         while (i< arr.length/2) {
             int swap = arr[i];
             arr[i] = arr[(arr.length-1) - i] ;
             arr[(arr.length-1) - i] = swap ;
                     i++;
         }

    }
}
