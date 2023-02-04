package pl.edu.wszib.jwd.Spotkanie4.lab17;

public class TshirtTester {
    public static void main(String[] args) {
        Tshirt t1 = new Tshirt(TshirtSize.L,"Nike");
        System.out.println(t1);
        System.out.println(t1.getSize().getChestWidth());
    }
}
