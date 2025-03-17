 class pallindromeArray {
     public static void main(String[] args) {
         System.out.println("welcome to pallindrome checker\n");
         int[] numArr =Arrayutility.inputArray();
         boolean ispallin = isPallindrome(numArr);
         if(ispallin) {
             System.out.println("your Array is Pallindrome ");
         }else{
             System.out.println("your Array is not Pallindrome");
         }

     }
     public static boolean isPallindrome(int[] numArr){
         int i = 0;
         while (i < numArr.length /2){
             if (numArr[i] != numArr[(numArr.length-1) -i]){
                 return false;
             }
             i++;
         }
         return true;
     }
}
