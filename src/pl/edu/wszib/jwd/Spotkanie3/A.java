package pl.edu.wszib.jwd.Spotkanie3;

public class A {
    public A() {
        System.out.println("Wywołano konstruktor A");
    }

    public A(boolean flag) {
        super();
        if(!flag) {
            System.out.println("Wywołano konstruktor A z flagą " + flag);
        }
    }
}
