package ss6_inheritance_polymorphism.point_moveablePoint;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        MoveablePoint mp1 = new MoveablePoint(1,2,3 ,4);
        MoveablePoint mp2 = new MoveablePoint(5,6,7,8);

        System.out.println("moveablePoint1 "+mp1.toString());
        System.out.println("moveablePoint2 "+mp2.toString());

        MoveablePoint mp3 = mp1.move();
        System.out.println("moveablePoint3 "+mp3.move());

    }
}
