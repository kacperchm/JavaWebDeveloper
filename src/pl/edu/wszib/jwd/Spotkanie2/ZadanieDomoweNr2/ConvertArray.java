package pl.edu.wszib.jwd.Spotkanie2.ZadanieDomoweNr2;

import java.util.Scanner;

public class ConvertArray {
    public static void main(String[] args) {

        System.out.println("Podaj rozmiar tablicy: ");
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();

       int arr1[] = createArray(l);
       int arr2[] = reverseArray(arr1);
       for(int k=0; k<arr2.length; k++) {
           System.out.println(arr2[k]);
       }
    }

    public static int[] createArray(int i) {
        int[] arr = new int[i];
        for(int j = 1; j<=i; j++){
            arr[j-1] = j;
        }
        return arr;
    }

    public static int[] reverseArray(int array[]) {
        int l = array.length;
        int[] revArr = new int[l];
        for(int a = l-1,b = 0; a>-1; a--, b++) {
            revArr[b] = array[a];
        }
        return revArr;
    }
}
