package ss6_inheritance.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2,"blue");
        Cylinder cylinder1 = new Cylinder(2, "blue", 5);
        System.out.println(cylinder1.toString());
        System.out.println(circle1.toString());
    }
}
