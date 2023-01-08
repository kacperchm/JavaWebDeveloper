package pl.edu.wszib.jwd.Spotkanie3;

public class GeometricFigures {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,8);
        Triangle triangle = new Triangle(4,6);
        showArea(rectangle);
        showArea(triangle);
    }

    public static void showArea(Shape shape){
        System.out.println("Pole powierzchni figury to: " + shape.getArea());
    }
}
