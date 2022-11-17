package Spotkanie2.ZadanieDomoweNr2;

import java.math.BigInteger;

public class SeedOnChessboard {
    public static void main(String[] args) {

        double[][] chessboard = fillTheChessboard();
        double value = seedCounter(chessboard);
        System.out.println("Ilość ziaren to: " + value);

    }

    public static double[][] fillTheChessboard() {
        double i = 1;
        double[][] arr = new double[8][8];
        for (int j = 0; j < 8; j++) {
            for (int k = 0; k < 8; k++) {
                if (i == 1) {
                    arr[j][k] = 1;
                } else {
                    arr[j][k] = i;
                }
                i = i * 2;
            }
        }
        return arr;
    }

    public static double seedCounter(double[][] arr) {
        double sum = 0;

        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                sum = sum + arr[j][k];
            }
        }
        return sum;
    }
}
