package pl.edu.wszib.jwd.Spotkanie3;

public abstract class Shape {
    private String Color;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public abstract double getArea();
}
