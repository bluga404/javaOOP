package bluga.oop.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Masako", 20_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
