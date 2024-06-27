package ss5_am_static;

public class TestCircle {
    public static void main(String[] args) {
        Circle cc1 = new Circle();
        System.out.println("Circle 1 - radius : " + cc1.getRadius());
        System.out.println("Circle 1 - Area : " + cc1.getArea());

        Circle cc2 = new Circle(2.5);
        System.out.println("Circle 2 - radius : " + cc2.getRadius());
        System.out.println("Circle 2 - Area : " + cc2.getArea());
    }
}
