 class maxArrayForEach {
     public static void main(String[] args) {
         System.out.println("welcome to finding the maximum");
         int[] arr = Arrayutility.inputArray();

         int max = Integer.MIN_VALUE;
         for (int num: arr){
             if(max < num){
                 max =num;
             }
         }
         System.out.println("maxium no is "+ max );
     }
}
