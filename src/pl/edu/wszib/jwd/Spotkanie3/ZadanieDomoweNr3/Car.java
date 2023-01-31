package pl.edu.wszib.jwd.Spotkanie3.ZadanieDomoweNr3;

import java.util.Random;

public class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static Car randomCar() {
        String[] models = {"Yaris", "Corolla", "Aygo"};
        String[] colors = {"srebrny", "niebieski", "czarny"};
        int[] years = {2018,2019,2020};
        Random rand = new Random();
        int randomModel = rand.nextInt(2);
        int randomColor = rand.nextInt(2);
        int randomYear = rand.nextInt(2);
        return new Car(models[randomModel],colors[randomColor], years[randomYear]);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
