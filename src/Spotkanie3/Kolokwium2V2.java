//Napisz program posiadający metodę o nazwie showMatrix() wyświetlającą na ekranie dowolną dwuwymiarową tablicę liczb
// całkowitych w postaci macierzy. Zaprezentuj działanie metody.
//
//        Przykład:
//        1   2   4
//        3   2   5
//        1   1   1

package Spotkanie3;

public class Kolokwium2V2 {

    static void showMatrix(int[][] tabToMatrix) {

        for (int i = 0; i<tabToMatrix.length; i++) {
            System.out.println();
            for(int j = 0; j<tabToMatrix[i].length; j++) {
                System.out.printf(tabToMatrix[i][j] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int[][] tab = {{1,2,4,3},
                    {2,4,5,6}};
        showMatrix(tab);
    }
}
