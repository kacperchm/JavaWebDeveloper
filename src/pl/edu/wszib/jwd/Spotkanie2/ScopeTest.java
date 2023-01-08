package pl.edu.wszib.jwd.Spotkanie2;

public class ScopeTest {
    int test = 10;

    void printTest() {
        System.out.println(test);
        int test = 20;
        System.out.println(test);
    }

    public static void main(String[] args) {
        ScopeTest sc = new ScopeTest();
        sc.printTest();
    }
}
