package pl.edu.wszib.jwd.Spotkanie1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Investment {
    public static double round(double value) {
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static void main(String[] args) {
        var sum = 14000d;
        sum = sum * 1.4;
        sum -= 1500;
        sum *= 1.12;

        System.out.println(Investment.round(sum));

    }
}
