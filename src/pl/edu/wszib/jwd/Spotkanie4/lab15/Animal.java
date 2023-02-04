package pl.edu.wszib.jwd.Spotkanie4.lab15;

public class Animal {
    String name;

    public Animal() {
        this.name = "Noname";
    }

    String showName() {
        return "zwierzę " + name;
    }

    String makeSound() {
        return "??";
    }

    void introduce() {
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}
