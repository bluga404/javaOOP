package bluga.oop.application;

import bluga.oop.data.*;

public class LocationApp {
    public static void main(String[] args) {
        var location = new City();
        location.name = "Surabaya";
        System.out.println(location.name);
    }
}
