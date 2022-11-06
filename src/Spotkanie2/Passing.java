package Spotkanie2;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą wartości " + i);
        changeIt(i);
        System.out.println("Po zmianie " + i);
    }

    static void changeIt(int i) {
        System.out.println("Zmieniam i");
        i++;

    }
}
