package Spotkanie3;

public class C extends B{
    public C() {
        System.out.println("Wywołano konstruktor C");
    }

    public C(boolean flag) {
        super(true);
        if(!flag) {
            System.out.println("Wywołano konstruktor C z flagą " + flag);
        }
    }
}
