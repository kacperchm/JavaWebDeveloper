package Spotkanie3;

public class SubPrinter extends Printer{
    int z = 3;

    @Override
    void printMe() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        SubPrinter sp = new SubPrinter();
        sp.printMe();
    }
}
