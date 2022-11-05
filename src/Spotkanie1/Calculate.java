package Spotkanie1;

public class Calculate {
    public static void main(String[] args) {
        int firstSquare = 2;
        int secondSquare = 7;
        int thirdSquare = 11;
        int fourthSquare = 19;

        System.out.println("Pierwszy kwadrat:");
        System.out.println("Pole powierzchni wynosi: " + (firstSquare * firstSquare));
        System.out.println("Obwód wynosi: " + (4*firstSquare));
        System.out.println("Przekątna wynosi: " + (firstSquare * Math.sqrt(2)));

        System.out.println("");
        System.out.println("Drugi kwadrat:");
        System.out.println("Pole powierzchni wynosi: " + (secondSquare * secondSquare));
        System.out.println("Obwód wynosi: " + (4*secondSquare));
        System.out.println("Przekątna wynosi: "  + (secondSquare * Math.sqrt(2)) );

        System.out.println("");
        System.out.println("Trzeci kwadrat:");
        System.out.println("Pole powierzchni wynosi: " + (thirdSquare * thirdSquare) );
        System.out.println("Obwód wynosi: " + (4*thirdSquare));
        System.out.println("Przekątna wynosi: "  + (thirdSquare * Math.sqrt(2)) );
        
        System.out.println("");
        System.out.println("Czwarty kwadrat:");
        System.out.println("Pole powierzchni wynosi: " + (fourthSquare * fourthSquare));
        System.out.println("Obwód wynosi: " + (4 * fourthSquare));
        System.out.println("Przekątna wynosi: "  + (fourthSquare * Math.sqrt(2)) );

    }
}
