package pl.edu.wszib.jwd.Spotkanie3.Lab14;

public class Sheep extends Animal{
    private static int numOfSheeps = 0;

    public Sheep() {
        numOfSheeps++;
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    @Override
    public int getInstanceNumber() {
        return numOfSheeps;
    }
}
