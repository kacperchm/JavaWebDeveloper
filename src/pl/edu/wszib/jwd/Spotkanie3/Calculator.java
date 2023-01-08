package pl.edu.wszib.jwd.Spotkanie3;

public class Calculator {

    int add(int a, int b) {
        int result = a+b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    int add(int a, int b, int c) {
        int result = a+b+c;
        System.out.println(a + " + " + b + "+" + c + " = " + result);
        return result;
    }

    double add(double a, double b) {
        double result = a+b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    double add(double a, double b, double c) {
        double result = a+b+c;
        System.out.println(a + " + " + b + " + " + c + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumInteger = calculator.add(1,2);
        double sumDouble = calculator.add(1.0,2.4,3.4);
    }
}
