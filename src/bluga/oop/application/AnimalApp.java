package bluga.oop.application;

import bluga.oop.data.*;

public class AnimalApp {
    public static void main(String[] args) {

        // here we use polymorphism for creating Cat Object
        Animal animal = new Cat();
        animal.name = "Kitten";

        animal.run();

    }
}
