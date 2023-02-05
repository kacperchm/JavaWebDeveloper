package pl.edu.wszib.jwd.Spotkanie4.lab18;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTester {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(213);
        numbers.add(21);
        numbers.add(1);
        numbers.add(42);
        numbers.add(11);
        numbers.add(12);
        numbers.add(14);
        numbers.add(224);

        System.out.println(numbers);

        numbers.remove(2);
        System.out.println(numbers);

    }
}
