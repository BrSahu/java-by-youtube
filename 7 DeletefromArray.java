import java.util.Scanner;

class DeletefromArray {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("welcome to array deletion\n");
            int[] numArr = Arrayutility.inputArray();
            System.out.println("now enter the no uwant to delete");
            int numToDelete = input.nextInt();
            int[] newArr = deleteNumber(numArr, numToDelete);
            System.out.println("here is your new array");
            Arrayutility.displayArray(newArr);
        }



        public static int[] deleteNumber(int[] numArr, int numToDelete){
            int occ = OccurrencesArray.noOfOccurrences( numArr ,numToDelete);
            if (occ == 0){
                return numArr;
            }

            int newSize = numArr.length - occ ;
            int[] newArr = new int[newSize];
            //int[] newArr1 = new int[newSize];
            int i=0, j=0 ; //k = 0;
            while (i< numArr.length){
                if (numArr[i] != numToDelete){

                    newArr[j] = numArr[i];
                    j++;
                }
                i++;
            }
            return newArr;
        }
    }

