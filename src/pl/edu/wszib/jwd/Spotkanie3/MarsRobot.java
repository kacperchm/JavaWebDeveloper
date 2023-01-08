package pl.edu.wszib.jwd.Spotkanie3;

public class MarsRobot {
    String status;
    int speed;
    int power;

    public MarsRobot() {
    }

    public MarsRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    public static void main(String[] args) {
        MarsRobot marsRobot1 = new MarsRobot();
        MarsRobot marsRobot2 = new MarsRobot("w bazie", 0,25);

        marsRobot1.status = "w bazie";
        marsRobot1.speed = 0;
        marsRobot1.power = 20;

        System.out.println(marsRobot2.power);
    }
}
