package pl.edu.wszib.jwd.Spotkanie3;

public class VisitCounterTester {
    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();
        visitCounter.increment();
        visitCounter.increment();
        visitCounter.increment();

        System.out.println(visitCounter.getCounter());
    }
}
