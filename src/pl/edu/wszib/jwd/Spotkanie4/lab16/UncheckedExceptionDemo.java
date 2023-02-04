package pl.edu.wszib.jwd.Spotkanie4.lab16;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        UncheckedExceptionDemo ued = new UncheckedExceptionDemo();
        int i = ued.getNumFromString("a");
        if (i > 0) {
            System.out.println("Oto nasza liczba przemnożona przez 99: " + (i * 99));
        }
    }

    public int getNumFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak... Upewnij się że przekazywany string jest liczbą." + e.getMessage());
        }
        return -1;
    }
}
