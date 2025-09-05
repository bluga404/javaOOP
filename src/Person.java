class Person {

    String name;
    String address;
    final String country = "Indonesia";

    Person (String name, String address){
        this.name = name;
        this.address = address;
    }

    Person (String paramName){
        // name = paramName;
        // code below using this keyword
        this(paramName, null);
    }

    Person (){
        this(null);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", nama objek ini adalah " + this.name);
    }

}
