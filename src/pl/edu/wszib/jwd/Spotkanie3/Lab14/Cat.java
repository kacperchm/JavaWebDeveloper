package pl.edu.wszib.jwd.Spotkanie3.Lab14;

public class Cat extends Animal{
    private static int numOfCats = 0;

    public Cat() {
        numOfCats++;
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public int getInstanceNumber() {
        return numOfCats;
    }
}
