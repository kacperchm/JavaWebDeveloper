package Spotkanie1;

public class CharacterType {
    public static void main(String[] args) {
        showInfo('a');
        showInfo('b');
        showInfo('A');
        showInfo('ą');
    }

    public static void showInfo(char a) {
        System.out.println("Kod znaku '" + a + "' to: " + (int)a);
    }
}
