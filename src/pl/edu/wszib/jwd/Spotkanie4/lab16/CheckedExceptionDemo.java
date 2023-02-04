package pl.edu.wszib.jwd.Spotkanie4.lab16;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws MalformedURLException {
        CheckedExceptionDemo ced = new CheckedExceptionDemo();
 //       ced.urlTesterByTryCatch("http312s://www.wszib.edu.pl");
        ced.urlTesterByThrows("http312s://www.wszib.edu.pl");

    }

    public void urlTesterByTryCatch(String urlString) {
        try {
            URL url = new URL(urlString);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Nieprawidłowy adres URL: " + e.getMessage());
        }
    }

    public void urlTesterByThrows(String urlString) throws MalformedURLException {
        URL url = new URL(urlString);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}
