package bluga.oop.application;

import bluga.oop.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Ajinomoto", 30_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }


}
