package Spotkanie1;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kacper", "Chmura", 24, 'm', (long)(Math.random()*10000000));
        System.out.println(employee1.FirstName);
        System.out.println(employee1.LastName);
        System.out.println(employee1.Age);
        System.out.println(employee1.Gender);
        System.out.println(employee1.PersIDNum);

        System.out.println(employee1.toString());
    }
}

class Employee {
    String FirstName;
    String LastName;
    int Age;
    char Gender;
    long PersIDNum;

    public Employee(String firstName, String lastName, int age, char gender, long persIDNum) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Gender = gender;
        PersIDNum = persIDNum;
    }

    @Override
    public String toString() {
        return "Spotkanie1.Employee{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                ", Gender=" + Gender +
                ", PersIDNum=" + PersIDNum +
                '}';
    }
}
