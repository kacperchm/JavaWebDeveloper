package pl.edu.wszib.jwd.Spotkanie3;

public class WashingMachine {
    private int temp;
    private int spinning;

    public void modForSensitiveClothes() {
        temp = 30;
        spinning = 800;
    }

    public void modForTowelsAndBedLinen() {
        temp = 90;
        spinning = 1200;
    }

    public void showMode() {
        System.out.println("Chosen mode set property values to " + toString());
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "temp=" + temp +
                ", spinning=" + spinning +
                '}';
    }
}
