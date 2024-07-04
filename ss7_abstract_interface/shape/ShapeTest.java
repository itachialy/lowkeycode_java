
package ss7_abstract_interface.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}

//    Shape shape = new Shape();
//    System.out.println(shape);
//
//    shape = new Shape("red", false);
//    System.out.println(shape);
