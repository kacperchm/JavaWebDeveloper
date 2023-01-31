package pl.edu.wszib.jwd.Spotkanie3.ZadanieDomoweNr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Factory {
    public static void main(String[] args) {
        Car[] motomachi = new Car[5000];
        Car[] tsutsumi = new Car[4500];
        Car[] tahara = new Car[1700];
        int a = 0; //srebrna toyota yaris 2020
        int tsutsumiBlack = 0;
        int tsutsumiBlue = 0;
        int tsutsumiSilver = 0;

        for (int i = 0; i < motomachi.length; i++) {
            motomachi[i] = Car.randomCar();
        }

        for (int i = 0; i < motomachi.length; i++) {
            motomachi[i] = Car.randomCar();
        }

        for (int i = 0; i < tsutsumi.length; i++) {
            tsutsumi[i] = Car.randomCar();
        }

        for (int i = 0; i < tahara.length; i++) {
            tahara[i] = Car.randomCar();
        }

        for (int i = 0; i < motomachi.length; i++) {
            if (motomachi[i].getYear() == 2020
                    && motomachi[i].getColor() == "srebrny"
                    && motomachi[i].getModel() == "Yaris") {
                a++;
            }
        }

        for (Car car : tsutsumi) {
            switch (car.getColor()) {
                case "srebrny" -> tsutsumiSilver++;
                case "czarny" -> tsutsumiBlack++;
                case "niebieski" -> tsutsumiBlue++;
            }
        }
         if(tsutsumiBlue>tsutsumiBlack && tsutsumiBlue>tsutsumiSilver) {
             System.out.println("Najwięcej jest aut niebieskich ich liczba to: " + tsutsumiBlue);
         } else if (tsutsumiBlack>tsutsumiBlue && tsutsumiBlack>tsutsumiSilver) {
             System.out.println("Najwięcej jest aut czarnych ich liczba to: " + tsutsumiBlack);
         } else if (tsutsumiSilver>tsutsumiBlue && tsutsumiSilver>tsutsumiBlack) {
             System.out.println("Najwięcej jest aut szarych ich liczba to: " + tsutsumiSilver);
         }

        System.out.println();
        System.out.println("10 pierwszych samochodów w Tahara to: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(tahara[i].toString());
        }


    }


}
