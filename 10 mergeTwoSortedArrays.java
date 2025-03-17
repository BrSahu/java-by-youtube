import java.sql.SQLOutput;

class mergeTwoSortedArrays {
    public static void main(String[] args) {
        System.out.println("welcome to merging of two sorted Arrays \n");
        int[] arr1 = Arrayutility.inputArray();
        int[] arr2 = Arrayutility.inputArray();
        int[] mergedArr = merge(arr1, arr2);
        System.out.println("your merged Array is :");
        Arrayutility.displayArray(mergedArr);

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays while both arrays have elements left
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        // If there are any remaining elements in arr1
        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }

        // If there are any remaining elements in arr2
        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }

        return newArr;
    }
}

