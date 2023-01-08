package pl.edu.wszib.jwd.Spotkanie3;

import pl.edu.wszib.jwd.Spotkanie3.PT1.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester packageTester1 = new PackageTester();
        pl.edu.wszib.jwd.Spotkanie3.PT2.PackageTester packageTester2 = new pl.edu.wszib.jwd.Spotkanie3.PT2.PackageTester();
        pl.edu.wszib.jwd.Spotkanie3.PT3.PackageTester packageTester3 = new pl.edu.wszib.jwd.Spotkanie3.PT3.PackageTester();

        packageTester1.introduce();
        packageTester2.introduce();
        packageTester3.introduce();
    }
}
