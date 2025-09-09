public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "walker";
        child.doIt();
        System.out.println(child.name);

        ((Parent) child).doIt();
        System.out.println(child.name);
    }
}
