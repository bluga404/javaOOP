class PolymorphismApp {
    public static void main(String[] args) {
//        Employee employee = new Employee("Walker");
//        employee.sayHello("Budi");
//
//        employee = new Manager("Simanjuntak","Balige");
//        employee.sayHello("Budi");
//
//        employee = new VicePresident("Valen");
//        employee.sayHello("Budi");

        // polymorphism
        sayHello(new Employee("Walker"));
        sayHello(new Manager("Simanjuntak"));
        sayHello(new VicePresident("Valentinus"));
    }

    static void sayHello(Employee employee){
        System.out.println("Hello, " + employee.name);
    }
}
