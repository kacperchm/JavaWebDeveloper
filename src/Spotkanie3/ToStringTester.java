package Spotkanie3;

import java.awt.*;

public class ToStringTester {
    public static void main(String[] args) {
        Integer i = 2;
        System.out.println(i);

        Point point = new Point(3,4);
        System.out.println(point);

        Employee employee = new Employee("Kowalski", 28,4500);
        System.out.println(employee);

        Employee employee1 = new Employee("Chmura", 24,9800);
        System.out.println(employee1);
    }
}
