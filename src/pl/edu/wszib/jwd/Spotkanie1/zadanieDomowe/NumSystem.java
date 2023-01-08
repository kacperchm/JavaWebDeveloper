public class NumSystem {
    public static void main(String[] args) {
        int a = 5;
        int b = 14;

        System.out.println(String.format("%32s",Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("--------------------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(a+b)).replace(' ', '0'));

        System.out.println("");
        System.out.println("");
        System.out.println(String.format("%32s",Integer.toOctalString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toOctalString(b)).replace(' ', '0'));
        System.out.println("--------------------------------");
        System.out.println(String.format("%32s",Integer.toOctalString(a+b)).replace(' ', '0'));

        System.out.println("");
        System.out.println("");
        System.out.println(String.format("%32s",Integer.toHexString(a)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toHexString(b)).replace(' ', '0'));
        System.out.println("--------------------------------");
        System.out.println(String.format("%32s",Integer.toHexString(a+b)).replace(' ', '0'));
    }
}
