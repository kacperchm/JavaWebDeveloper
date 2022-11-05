package Spotkanie2;

public class NewCounter {
    public static void main(String[] args) {
        String str = "dwa";
        int number;

        switch (str) {
            case "jeden":
            case "jedynka":
                number = 1;
                break;
            case "dwa":
            case "dwójka":
                number = 2;
                break;
            case "trzy":
            case "trójka":
                number = 3;
                break;
            default:
                number = 0;
        }


        System.out.println(number);
    }
}
