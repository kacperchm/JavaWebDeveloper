package pl.edu.wszib.jwd.Spotkanie3;

public class WashingMachineTester {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.modForSensitiveClothes();
        washingMachine.showMode();
        washingMachine.modForTowelsAndBedLinen();
        washingMachine.showMode();
    }

}
