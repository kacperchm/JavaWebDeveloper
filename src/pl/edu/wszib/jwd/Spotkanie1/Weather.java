package pl.edu.wszib.jwd.Spotkanie1;

public class Weather {
    public static void main(String[] args) {

        float fah = 86;
        float cel = ((fah - 32)/9)*5;
        System.out.println(fah + " stopni Farenheita to " + cel + " stopni Celcjusza");

        float cel2 = 33;
        float fah2 = ((cel2/5)*9)+32;

        System.out.println(cel2 + " stopni Celcjusza to " + Math.round(fah2) + " stopni Farenheita");
    }
}
