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
        if (employee instanceof VicePresident){
            VicePresident vp = new VicePresident("Valentinus");
            System.out.println("Hello VP " + vp.name);
        } else if (employee instanceof Manager){
            Manager manager = new Manager("Simanjuntak");
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello employee " + employee.name);
        }
    }
}
