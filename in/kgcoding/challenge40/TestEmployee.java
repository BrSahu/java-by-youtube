package in.kgcoding.challenge40;

public class TestEmployee {
    public static void main(String[] args) {
        employee emp = new employee("bhojraj",25000,26);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("krishna");
        System.out.println(emp.getEmployeeDetails());
    }
}
