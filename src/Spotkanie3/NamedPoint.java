package Spotkanie3;

import java.awt.*;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    public static void main(String[] args) {
        NamedPoint namedPoint = new NamedPoint(5,5, "SmallPoint");
        System.out.println("Nazwa punktu " + namedPoint.name);
        System.out.println("x wynosi " + namedPoint.x);
        System.out.println("y wynosi " + namedPoint.y);

    }
}
