package ss6_inheritance_polymorphism.point2D_3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(5,5);
        Point3D point3D = new Point3D(2,3,4);

        point2D.setXY(2f,8f);
        point3D.setXY(3f,8f);
        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}
