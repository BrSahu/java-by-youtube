package in.kgcoding.challenge40;

 class employee {
    private String name ;
     private int age ;
     private double salary;

     employee(String name, double salary, int age) {
         this.name = name;
         this.salary = salary;
         this.age = age;
     }

     String getEmployeeDetails(){
         return "EmployeeDetails : Name: " + name
                 + ", age: " + age
                 + ", Salary: "+ salary;
     }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
