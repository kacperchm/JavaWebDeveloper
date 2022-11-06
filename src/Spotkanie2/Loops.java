package Spotkanie2;

import java.math.BigInteger;

public class Loops {
    public static void main(String[] args) {

//        int x = 2;
//        {
//            int y = 10;
//            y= x+y;
//            System.out.println(y);
//        }
//
//        if (x>2) {
//            System.out.println("Jest większe od 2");
//        } else if(x<2){
//            System.out.println("Jest mniejsze od 2");
//        } else {
//            System.out.println("Jest równe 2");
//        }
//
//
//        char grade = 'A';
//
//        switch (grade) {
//            case 'A':
//                System.out.println("Wspaniale");
//            break;
//            case 'B':
//                System.out.println("Dobrze");
//            break;
//            case 'D':
//                System.out.println("Mogło być lepiej");
//            break;
//            default:
//                System.out.println("Rozważ oszukiwanie");
//
//        }
//
//        if(grade == 'A'){
//            System.out.println("Wspaniale");
//        }else if(grade == 'B'){
//            System.out.println("Dobrze");
//        }else if(grade == 'D') {
//            System.out.println("Dobrze");
//        }else {
//            System.out.println("Rozważ oszukiwanie");
//        }
//
//        int myScore = 98;
//        int yourScore = 102;
//        int ourBestScore = myScore > yourScore? myScore:yourScore;
//        System.out.println(ourBestScore);
//
//        for (int i = 1; i<10 ; i++) {
//            System.out.println("i=" + i);
//        }
//
////        for(;;) {
////            System.out.println("pętla nieskończona");
////        }
//
//        for (int i = 0; i <10; i++) {
//            System.out.printf("%d ", i);
//        }
//
//        System.out.println();
//
//        int number = 6;
//        BigInteger factorial = BigInteger.ONE;
//        for(int i = 1; i<=number; i++ ) {
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//        }
//
//        System.out.printf("%d! = %s%n", number, factorial);
//
//        for(int i = 1, sum =1; i <= 128; i*=2, sum+=i) {
//            System.out.printf("i = %d, sum = %d%n", i, sum);
//        }
//        int i = 0;
//        while (i<100) {
//            System.out.println(i);
//            i++;
//        }
//
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<100);

        for (int i = 1; i <10; i++) {
            if(i%2==2) {
                break;
            }
            System.out.print(i);
            System.out.print(" ");

        }

    }
}
