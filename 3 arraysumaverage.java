import java.util.Scanner;

class arraysumaverage {
    public static void main(String[] args) {
        System.out.println("welcome to array sum and average");
        int[] numarray = Arrayutility.inputArray();
        long sum = sum (numarray);
        double avg = average(numarray);
        System.out.println("sum of the number is:"+ sum );
        System.out.println("average of the no is " + avg);

    }

        public static long sum(int [] numarray){
        long sum =0;
        int i = 0;
        while(i< numarray.length){
            sum += numarray[i];
            i++;
        }
        return sum;
        }

    public static  double average(int[] numarray) {
        double  sum = sum(numarray);

        return (sum / numarray.length);

    }
}
