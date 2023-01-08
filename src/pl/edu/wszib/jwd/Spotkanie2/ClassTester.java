package pl.edu.wszib.jwd.Spotkanie2;

public class ClassTester {
    private int i;
    static int j = 2;

    public int change() {
        int k = 7;
        return i + k * j;
    }
    public static void main(String[] args) {

        ClassTester ct = new ClassTester();
        System.out.println(ct.i);
    }
}

