package ss5_am_static;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.0);
        System.out.println(circle2.getRadius() + circle2.getArea());
    }
}
