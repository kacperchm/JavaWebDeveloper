package Spotkanie2;

public class FrequentNumber {
    public static void main(String[] args) {
        int mostFrequent = 0;
        int[] arr = {1, 1, 2, 5, 7, 5, 3, 2, 3, 5, 7, 5, 3, 1, 2, 3, 4, 6, 4, 3, 2, 7, 8, 9, 9, 9, 9, 6};
        int[] num = new int[10];
        for (int i = 0; i < arr.length; i++) {
            num[arr[i]]++;
        }
        for (int j = 1; j < num.length; j++) {
            if (num[j] > num[mostFrequent]) {
                mostFrequent = j;
            }
        }
        System.out.println("Najcześciej powtarzającą się cyfrą jest: " + mostFrequent + " Wystąpiła " + num[mostFrequent] + " razy");
    }
}
