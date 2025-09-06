class Manager {
    String name;
    String address;

    Manager(String name){
        this.name = name;
    }

    Manager(String name, String address){
        this.name = name;
        this.address = address;
    }

    void sayHello(String name){
        System.out.println("Halo " + name + ", Saya adalah Manager " + this.name + ". Saya tinggal di " + this.address);
    }
}
