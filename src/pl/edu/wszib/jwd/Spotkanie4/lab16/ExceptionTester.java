package pl.edu.wszib.jwd.Spotkanie4.lab16;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Nasz nr to: " + numbers[i/0]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego indexu");
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak...");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Koniec");
        }
    }
}