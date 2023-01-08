package pl.edu.wszib.jwd.Spotkanie3;

import java.awt.*;

public class FourDPoint extends Point {
    private int x;
    private int y;
    private int z;
    private int t;

    public FourDPoint(int x, int y, int z, int t) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.t = t;
    }


    static FourDPoint create(int x, int y, int z, int t) {
        FourDPoint fourDPoint = new FourDPoint(x, y, z, t);
        return fourDPoint;
    }

    void show() {
        System.out.println("Twoje współrzędne to:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);
    }

    public static void main(String[] args) {
        FourDPoint firstFourDPoint = FourDPoint.create(5,6,8,1);
        firstFourDPoint.show();
    }
}
