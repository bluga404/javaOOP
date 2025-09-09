public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Walker", "Balige");

        manager.sayHello("Budi");

        var vicePresident = new VicePresident("Valen");

        vicePresident.sayHello("Anton");

        System.out.println(manager.name);
        System.out.println(vicePresident.name);
    }
}
