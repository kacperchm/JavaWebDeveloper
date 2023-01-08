package pl.edu.wszib.jwd.Spotkanie1;

public class ValueOfnBitV2 {
    public static void main(String[] args) {
        int number = 2;
        int bitOfNumber = 1;



            String strNumber =String.format("%32s", Integer.toBinaryString(number)).replace(' ', '0');
            System.out.println(strNumber);

            if (bitOfNumber <= strNumber.length()) {
                System.out.println("Bit " + bitOfNumber + " liczby " + number + " wynosi " + strNumber.charAt(bitOfNumber-1));
            } else {
                System.out.println("Twoja liczba nie posiada bitu nr " + bitOfNumber);

        }
    }
}
