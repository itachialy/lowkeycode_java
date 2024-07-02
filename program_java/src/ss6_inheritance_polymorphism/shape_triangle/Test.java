package ss6_inheritance_polymorphism.shape_triangle;

public class Test {
    public static void main(String[] args) {
        Shape sp1 = new Triangle(1,2,3);
        Triangle t1 = new Triangle();
        System.out.println(sp1.toString());
        System.out.println(t1.toString());
    }
}
