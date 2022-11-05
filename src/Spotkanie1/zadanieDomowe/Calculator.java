public class Calculator {
    public static void main(String[] args) {
        int firstNum = 23;
        int secondNum = 12;

        add(firstNum, secondNum);
        subtract(firstNum, secondNum);
        multiply(firstNum, secondNum);



    }

    public static void add(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result);
    }
    public static void subtract(int a, int b) {
        int result = a - b;
        System.out.println(a + " - " + b + " = " + result);
    }

    public static void multiply(int a, int b) {
        int result = a * b;
        System.out.println(a + " x " + b + " = " + result);
    }
}
