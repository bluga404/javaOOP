package bluga.oop.application;
import bluga.oop.data.*;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        car.drive();
        System.out.println(car.tire());
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());

    }
}
