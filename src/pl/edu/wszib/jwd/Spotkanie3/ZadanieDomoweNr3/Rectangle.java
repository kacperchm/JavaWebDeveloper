package pl.edu.wszib.jwd.Spotkanie3.ZadanieDomoweNr3;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle() {
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(int x) {
        this.width = x;
        this.length = x;
    }

    void surfaceArea(Rectangle x) {
        int area = x.length * x.width;
        System.out.println("Pole powierzchni wynosi: " + area);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(25, 10);
        Rectangle r2 = new Rectangle( 10);
        Rectangle r3 = new Rectangle();

        r1.surfaceArea(r1);
        r2.surfaceArea(r2);
        r3.surfaceArea(r3);
    }
}
