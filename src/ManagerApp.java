public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Walker";

        manager.sayHello("Budi");

        var vicePresident = new VicePresident();
        vicePresident.name = "Valen";

        vicePresident.sayHello("Anton");
    }
}
