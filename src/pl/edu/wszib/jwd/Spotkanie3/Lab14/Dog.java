package pl.edu.wszib.jwd.Spotkanie3.Lab14;

public class Dog extends Animal{
    private static int numOfDogs = 0;

    public Dog() {
        numOfDogs++;

    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public int getInstanceNumber() {
        return numOfDogs;
    }
}
