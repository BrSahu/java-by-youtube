 class ArraytoString {
     public static void main(String[] args) {
         String[] arr = new String[] {"this", "is","the", "best" , "and" ,"most",
                 "detailed", "video", "available", "on" ,"you", "tube", "for",
                 "java", "maybe "};
         StringBuilder sb = new StringBuilder();
         for (String str : arr) {
             sb.append(str).append(" ");

         }
         System.out.println(sb);
     }
}
