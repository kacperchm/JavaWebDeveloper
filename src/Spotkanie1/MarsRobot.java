package Spotkanie1;

public class MarsRobot {
    String status;
    int speed;
    float temperature;
    public void checkTemperature() {
        if(temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }

    public void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }

    public void checkStatus(){
        System.out.println(status);
    }
}
