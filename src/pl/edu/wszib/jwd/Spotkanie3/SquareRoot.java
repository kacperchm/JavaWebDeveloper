package pl.edu.wszib.jwd.Spotkanie3;

import java.util.Scanner;

public class SquareRoot {
    static double squareRoot(double num) {
        return Math.pow(num,0.5);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj pierwiastkowaną liczbę: ");
        double num = s.nextDouble();
        double result = squareRoot(num);
        System.out.println("Pierwiastek z " + num + " wynosi: " + result);
    }
}
