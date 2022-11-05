package Spotkanie1;

public class DataTypes {
    public static void main(String[] args) {

        //domyślnie liczy całkowite traktowane są jako int
        System.out.println(2345654687898L);
        System.out.println(23456);

        byte b = -120;
        short s = 31678;
        int i = 1_123_456_789;
        long l = i * b;
        long itemsNumber = 115678946421487864l;


        //domyślnie liczby zmiennoprzecinkowe traktowane jako double
        double d = 34.35;
        float f = 15.12f;

        //typy znakowe
        System.out.println('a');
        System.out.println('\'');
        System.out.println('\t');

        char c = 43;
        System.out.println((int)c);

        //typ logiczny
        System.out.println(true);
        System.out.println(false);

        boolean choosen = true;
        boolean q = false;

        System.out.println(q);

        //Ciągi znaków

        String name = "Ala";
        System.out.println(name);
        System.out.println("Cześć jestem " + name);


    }
}
