package pl.edu.wszib.jwd.Spotkanie3;

public class B extends A{
    public B() {
        System.out.println("Wywołano konstruktor B");
    }

    public B(boolean flag) {
        super(true);
        if(!flag) {
            System.out.println("Wywołano konstruktor B z flagą " + flag);
        }
    }
}
