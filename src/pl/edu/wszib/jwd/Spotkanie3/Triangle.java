package pl.edu.wszib.jwd.Spotkanie3;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (height * base)/2;
    }
}
