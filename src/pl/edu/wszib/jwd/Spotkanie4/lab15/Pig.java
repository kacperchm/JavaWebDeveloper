package pl.edu.wszib.jwd.Spotkanie4.lab15;

public class Pig extends Animal{
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "świnka " + name;
    }

    @Override
    String makeSound() {
        return "chrum chrum";
    }
}

