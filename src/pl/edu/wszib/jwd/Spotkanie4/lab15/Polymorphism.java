package pl.edu.wszib.jwd.Spotkanie4.lab15;

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        shape.draw();
        rectangle.draw();

        System.out.println(rectangle instanceof Rectangle);
        System.out.println(rectangle instanceof Shape);
        System.out.println(rectangle instanceof Object);

        shape = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        circle.draw();
        triangle.draw();
    }
}
