class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Halo " + name + ", saya adalah Vice President " + this.name);
    }
}