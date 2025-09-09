package bluga.oop.application;

import bluga.oop.data.*;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();

        // if we don't use setter and getter, we have to make it public for the fields, so everyone can change the value without validation
        // category.id = null;

        // that is why we use encapsulation
        category.setId("ID");
        category.setId(null);

        category.setExpensive(false);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
