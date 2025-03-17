 class StudentToString {
    String name;
    int age;
    int rollnumber ;
    String house;

     public StudentToString(int age, String name, int rollnumber, String house) {
         this.age = age;
         this.name = name;
         this.rollnumber = rollnumber;
         this.house = house;
     }

     @Override
     public String toString() {
         return "Student Details:{name :"+ name
                 + " , age"+ age
                 + " , roll number"+ rollnumber
                 + " , house"+ house + "}";
     }

     public static void main(String[] args) {
         StudentToString stu = new StudentToString(26,"bhojraj",001,"aravali");
         System.out.println(stu);
     }
 }
