public class ShapeApp{
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getCorner());

        var rectangular = new Rectangular();
        System.out.println(rectangular.getCorner());
        System.out.println(rectangular.getShapeCorner());
    }
}