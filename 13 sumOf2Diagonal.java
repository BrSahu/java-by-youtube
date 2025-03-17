import java.util.Scanner;

class sumOf2Diagonal {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("welcome to diagonal sum");
         int[][] numArr = Arrayutility.input2DArray();
         long sum = sumOfDigonals(numArr);
         System.out.println("sum of diagonals is " + sum);

     }

     public static long sumOfDigonals(int[][] numArr) {
         long leftSum = sumOfLeftDigonals(numArr);
         long rightsum = sumOfRightDigonals(numArr);
         long sum = leftSum + rightsum;
         if (numArr.length % 2 != 0){
             int ind = numArr.length /2;
             sum -= numArr[ind][ind];
         }

         return sum;
     }
    public static long sumOfLeftDigonals(int[][] numArr) {
         long sum = 0;
         int i=0;
         while (i < numArr.length){
             sum += numArr[i][i];
             i++;
         }
        return sum;
    }
    public static long sumOfRightDigonals(int[][] numArr) {
         long sum =0;
         int i=0;
         while (i< numArr.length){
             int col = numArr.length -1 -i;
             sum += numArr[i][col];
                     i++;
         }
        return sum;
    }
}
