package pl.edu.wszib.jwd.Spotkanie3;

public class Boy extends Human{
    @Override
    void eat() {
        System.out.println(this.getClass().getSimpleName() + " eats pizza");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
    }
}
