package pl.edu.wszib.jwd.Spotkanie4.lab18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTester {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(13);
        numbers.add(3);
        numbers.add(22);
        numbers.add(54);
        numbers.add(12);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.forEach(n -> System.out.println(n));

        System.out.println();
        Iterator<Integer> integerIterator = numbers.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        System.out.println();
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
