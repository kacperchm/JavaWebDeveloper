package pl.edu.wszib.jwd.Spotkanie4.lab15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDataProvider implements DataProvider{
    @Override
    public String getData(){
        try {
            return new String(Files.readAllBytes(Paths.get("data.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
