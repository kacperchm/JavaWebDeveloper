package pl.edu.wszib.jwd.Spotkanie4.lab15;

import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        Player mp3 = new MP3(List.of(
                new Song("Avi","Dresscode","Akademia Sztuk Pięknych"),
                new Song("Metallica", "Nothing else matters","Black Album"),
                new Song("Avi","Michaelangelo","Akademia Sztuk Pięknych"),
                new Song("Pezet","Magenta","Muzyka współczesna"),
                new Song("Naucz się czekać","Magenta","Muzyka współczesna"),
                new Song("Polska Wersja","SŁOWO","Jeszcze będzie lepiej")));
        Player mp4 = new MP4(List.of(
                new Song("Avi","Dresscode","Akademia Sztuk Pięknych"),
                new Song("Avi","Michaelangelo","Akademia Sztuk Pięknych"),
                new Song("Pezet","Magenta","Muzyka współczesna"),
                new Song("Naucz się czekać","Magenta","Muzyka współczesna"),
                new Song("Polska Wersja","SŁOWO","Jeszcze będzie lepiej")
        ));
        Player walkman = new Walkman(List.of(
                new Song("Guzior", "Fala", "Fala"),
                new Song("Pezet","Magenta","Muzyka współczesna"),
                new Song("Avi","Dresscode","Akademia Sztuk Pięknych"),
                new Song("Metallica", "Nothing else matters","Black Album"),
                new Song("Avi","Michaelangelo","Akademia Sztuk Pięknych"),
                new Song("Naucz się czekać","Magenta","Muzyka współczesna"),
                new Song("Polska Wersja","SŁOWO","Jeszcze będzie lepiej")));

        mp4.play();
        mp4.next();
        mp4.prev();
        mp4.pause();
        System.out.println();

        mp3.play();
        mp3.prev();
        mp3.prev();
        mp3.prev();
        mp3.next();
        mp3.pause();
        System.out.println();

        walkman.play();
        walkman.next();
        walkman.next();
        walkman.next();
        walkman.prev();
        walkman.pause();
        System.out.println();
    }
}
