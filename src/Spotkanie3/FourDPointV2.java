package Spotkanie3;

import java.awt.*;

public class FourDPointV2 extends Point {

    private int z;
    private int t;

    public FourDPointV2(int x, int y, int z, int t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }


    static FourDPointV2 create(int x, int y, int z, int t) {
        FourDPointV2 fourDPoint = new FourDPointV2(x, y, z, t);
        return fourDPoint;
    }

    void show() {
        System.out.println("Twoje współrzędne to:");
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
        System.out.println("z = " + this.z);
        System.out.println("t = " + this.t);
    }

    public static void main(String[] args) {
        FourDPointV2 firstFourDPoint = FourDPointV2.create(5,6,8,1);
        firstFourDPoint.show();
    }
}
