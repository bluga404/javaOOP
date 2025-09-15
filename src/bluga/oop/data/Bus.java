package bluga.oop.data;

public class Bus implements Car{

    public String getBrand() {
        return "Toyota";
    }

    public void drive() {
        System.out.println("HINO drive");
    }

    public int tire() {
        return 10;
    }

    public boolean isMaintenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
