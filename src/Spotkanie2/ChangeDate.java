package Spotkanie2;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.StringTokenizer;

public class ChangeDate {
    public static void main(String[] args) {
        String birth = "05/08/1998";
        StringTokenizer tokenizer = new StringTokenizer(birth, "/");

        System.out.println("Dzień: " + tokenizer.nextToken());
        System.out.println("Miesiąc: " + tokenizer.nextToken());
        System.out.println("Rok: " + tokenizer.nextToken());

    }
}
