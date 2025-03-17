 class sumPositive {
     public static void main(String[] args) {
         System.out.println("welcome to adding positive numbers");
         int[] numArr = Arrayutility.inputArray();

         int sum = 0;
         for(int num : numArr){
             if (num<0){
                 continue;
             }
             sum += num;
         }
         System.out.println("the sum of positive numbers is :"+ sum);
     }
}
