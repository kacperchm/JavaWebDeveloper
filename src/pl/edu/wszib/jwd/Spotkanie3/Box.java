package pl.edu.wszib.jwd.Spotkanie3;

import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;

    int x2 = 0;
    int y2 = 0;

    public Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Box(Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }

    public Box(Point topLeft, int w, int h) {
        this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y + h);
    }

    void printBox() {
        System.out.println("Box: <" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ">");
    }

    public static void main(String[] args) {
        Box box;
        System.out.println("Za pomocą współrzędnych (25,25) i (50,50)");
        box = new Box(25,25,50,50);
        box.printBox();

        box = new Box(new Point(1,1), new Point(10,5));
        box.printBox();

        box = new Box(new Point(2,2), 20,16);
        box.printBox();
    }
}
