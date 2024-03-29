package pl.edu.wszib.jwd.Spotkanie4.lab18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListCompareDemo {
    public static final int MAX_VAL = 1_000_000;
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        fill(numbers);
        long startTime = System.currentTimeMillis();
        insertInMiddle(numbers);
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime + " milisekund");
    }

    static void fill(List list) {
        for (int i = 0; i < MAX_VAL; i++) {
            list.add(i);
        }
    }

    static void insertInMiddle(List list) {
        int half = MAX_VAL/2;
        int part = MAX_VAL / 10;
        ListIterator<Integer> listIterator = list.listIterator(half);
        for (int i = 1; i <= part ; i++) {
            listIterator.add(0);
        }

    }
}
