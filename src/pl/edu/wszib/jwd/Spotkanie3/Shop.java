package pl.edu.wszib.jwd.Spotkanie3;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("mleko", 4.89);
        Product product2 = new Product("mleko", 4.89);

        System.out.println(product1 == product2);
        System.out.println(product1.equals(product2));

    }
}
