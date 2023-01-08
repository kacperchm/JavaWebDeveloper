package pl.edu.wszib.jwd.Spotkanie2;

public class EqualsTester {
    public static void main(String[] args) {

        String str1, str2;
        str1 = "Ale to się rozrasta.";
        str2 = str1;

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("Ten sam obiekt? " + (str1==str2));

        System.out.println("____________________________");

        str2 = new String(str1);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("Ten sam obiekt? " + (str1==str2));
        System.out.println("Ta sama wartość" + str1.equals(str2));
    }
}
