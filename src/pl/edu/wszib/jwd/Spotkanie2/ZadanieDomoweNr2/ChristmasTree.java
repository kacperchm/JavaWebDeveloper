package pl.edu.wszib.jwd.Spotkanie2.ZadanieDomoweNr2;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        String num;
        System.out.println("Podaj wysokość choinki: ");
        Scanner s = new Scanner(System.in);
        num = s.nextLine();
        if(num.matches("\\d+")) {
            createChristmasTree(Integer.parseInt(num));
        } else {
            createChristmasTree(18);
        }
    }

    public static void createChristmasTree(int a) {
        char[] charArr = {'+','.','*','~','^','°'};
        int width = 1;
        for (int i = 1; i < a; i++) {
            width = width + 2;
        }
        char[][] christmasTree = new char[a][width];
        int l = christmasTree.length;

        for (int j = 0; j < christmasTree.length; j++) {
            for (int k = 0; k < christmasTree[j].length; k++) {
                if(k < (l - j -1) || k > (l + j-1)) {
                    christmasTree[j][k] = ' ';
                    System.out.printf(christmasTree[j][k]+"");
                }else {

                    christmasTree[j][k] = charArr[(int) (Math.random()*6)];
                    System.out.printf(christmasTree[j][k]+"");
                }
            }
            System.out.println();
        }

    }
}
