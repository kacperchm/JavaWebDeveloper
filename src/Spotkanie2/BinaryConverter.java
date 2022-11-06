package Spotkanie2;

public class BinaryConverter {
    public static void main(String[] args) {
        String binaryStr = "111111111101";
        Long num = 0l;
        for (int j = 0, i = binaryStr.length()-1; i >= 0 ; i--, j++) {
            char a = binaryStr.charAt(i);
//            zmiana z char na int
//            Character.getNumericValue(a);
            switch (a){
                case '1': {
                    num = num + (long) (Math.pow(2,j));
                } break;
                default:{
                }break;
            }
        }
        System.out.println(num);

    }
}
