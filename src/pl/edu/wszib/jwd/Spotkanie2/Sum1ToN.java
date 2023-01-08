package pl.edu.wszib.jwd.Spotkanie2;

import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        System.out.println("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;
        int sum =1;

        System.out.print("Suma 1");
        while (number<n) {
            number++;
            sum+= number;
            System.out.print(" + " + number);
        }
        System.out.println(" = " + sum);
    }
}
