package bluga.oop.data;

public abstract class Animal {
    public String name;
    // if the method using abstract, we don't need to specify the parameter, but the child have to override the method
    public abstract void run();
}
