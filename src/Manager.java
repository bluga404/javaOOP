class Manager extends Employee{
    String address;

    Manager(String name){
        super(name);
    }

    Manager(String name, String address){
        super(name);
        this.address = address;
    }

    void sayHello(String name){
        System.out.println("Halo " + name + ", saya adalah Manager " + this.name + ", saya tinggal di " + this.address);
    }
}
