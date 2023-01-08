package pl.edu.wszib.jwd.Spotkanie3;

public class Human {

    void eat() {
        System.out.println(this.getClass().getSimpleName() + " eats pasta");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
    }
}
