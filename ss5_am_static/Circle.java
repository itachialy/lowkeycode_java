package ss5_am_static;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public  double getArea(){
        return Math.PI * radius * radius;
    }
}
