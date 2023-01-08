package Spotkanie3;

public class SquareRootV2 {
    static double squareRoot(double num) {
        return Math.sqrt(num);
    }


    public static void main(String[] args) {

        double num = Double.parseDouble(args[0]);
        double result = squareRoot(num);
        System.out.println("Pierwiastek z " + num + " wynosi: " + result);
    }
}
