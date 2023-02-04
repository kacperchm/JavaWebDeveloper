package pl.edu.wszib.jwd.Spotkanie4.lab16;

import java.util.Scanner;

public class SquareCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double d = 0;
        System.out.println("Podaj liczbę którą chcesz wyciągnąć pierwiastek: " );

        try {
            d = Double.parseDouble(s.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Błąd! Podana wartość nie jest liczbą!");
            System.exit(-1);
        }

        if(d < 0) {
            throw new IllegalArgumentException("Błąd! Podana liczba jest ujemna!");
        }
        System.out.println(Math.sqrt(d));
    }
}

