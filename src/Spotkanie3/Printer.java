package Spotkanie3;

public class Printer {
    int x = 0;
    int y = 0;

    void printMe() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printMe();
    }
}
