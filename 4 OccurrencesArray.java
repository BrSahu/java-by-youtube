import java.util.Scanner;

 class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Array occurences\n");
        int[] numArr = Arrayutility.inputArray();
        System.out.println("now enter the no u want to find: ");
        int num = input.nextInt();
        int occurences = noOfOccurrences( numArr , num);
        System.out.println("ur element was found " + occurences + "times in the array");
    }

    public static int noOfOccurrences(int[] numArr, int num) {
        int occ =0 ;
        int i=0;
        while (i < numArr.length){
            if (numArr[i] == num ){
                occ++;

            }
            i++;
        }
        return occ;
       // return noOfOccurrences;

    }
}

