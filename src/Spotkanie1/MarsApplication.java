package Spotkanie1;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();

        System.out.println("Zwiększanie prędkości do 3");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Zmiana temperatury do -90");
        spirit.temperature = -90;
        spirit.showAttributes();


        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("");
        System.out.println("");

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "eksploracja";
        opportunity.speed = 4;
        opportunity.temperature = -60;

        opportunity.showAttributes();
        opportunity.checkStatus();
    }
}
