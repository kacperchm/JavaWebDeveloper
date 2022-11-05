package Spotkanie1;

public class NumberSystem {
    public static void main(String[] args) {

        int a=1;
        int b=5;


        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0'));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ', '0'));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("------------------------------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(String.format("%32s", Integer.toBinaryString(b >> 2)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(b << 2)).replace(' ', '0'));


    }
}
