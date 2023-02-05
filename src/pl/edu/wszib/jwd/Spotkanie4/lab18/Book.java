package pl.edu.wszib.jwd.Spotkanie4.lab18;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Book {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("https://java.mmiklas.wszib.edu.pl/dodatki/crsto10.txt");
        List<String> book = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(file);
        String line = bufferedReader.readLine();
        do {
            book.add(line);
        } while (line == null);

        System.out.println("Ilość linijek książki to: " + book.size());

    }
}
