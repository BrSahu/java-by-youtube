package in.kgcoding.challenge42;

import java.util.Objects;

public class Person {
    private String Name;
    private int Age;

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person("bhojraj",26);
        Person p2 = new Person("bhojraj",26);
        System.out.println(p1.equals(p2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Age == person.Age && Objects.equals(Name, person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age);
    }
}
