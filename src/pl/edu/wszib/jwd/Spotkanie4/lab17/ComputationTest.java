package pl.edu.wszib.jwd.Spotkanie4.lab17;

public class ComputationTest {
    public static void main(String[] args) {
        double a = 20;
        double v = 10;
        double result1 = Computation.ADD.perform(a,v);
        double result2 = Computation.DIVIDE.perform(a,v);
        double result3 = Computation.SUBTRACT.perform(a,v);
        double result4 = Computation.MULTIPLY.perform(a,v);

        System.out.println(a + " + " + v + " = " + result1);
        System.out.println(a + " / " + v + " = " + result2);
        System.out.println(a + " - " + v + " = " + result3);
        System.out.println(a + " * " + v + " = " + result4);
    }
}
