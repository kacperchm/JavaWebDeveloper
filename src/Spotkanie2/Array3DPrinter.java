package Spotkanie2;

public class Array3DPrinter {
    public static void main(String[] args) {
        int[][][] arr = {{{1, 2}, {1, 5, 5}, {1, 5, 6, 5}}, {{1, 2}, {1, 5, 5}, {1, 5, 6, 5}},{{1, 2}, {1, 5, 5}, {1, 5, 6, 5}}, {{1, 2}, {1, 5, 5}, {1, 5, 6, 5}}};
        for (int i = 0; i < arr.length ; i++) {
            for (int k = 0; k < arr[i].length ; k++) {
                for (int j = 0; j < arr[i][k].length ; j++) {
                    System.out.println("arr["+ i + "][" + k +"][" +j+"] = " + arr[i][k][j]);
                }
            }
        }
    }
}
