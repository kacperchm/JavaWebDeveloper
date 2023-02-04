package pl.edu.wszib.jwd.Spotkanie4.lab16;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();
        int hours = -3;
        int numberOfSeconds = 0;
        try {
            numberOfSeconds = etd.getNumberOfSeconds(hours);
            System.out.println(hours + "h to " + numberOfSeconds + "s");
        } catch (IllegalArgumentException e) {
            System.out.println("Naprawiamy...");
            numberOfSeconds = etd.getNumberOfSeconds(hours);
            numberOfSeconds = numberOfSeconds * -1;
            System.out.println(hours + "h to " + numberOfSeconds + "s");
        }

    }

    public int getNumberOfSeconds(int hours) {

        return hours * 60 * 60;
    }
}
