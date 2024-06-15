package ss4_oop;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructor
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    // Getter and Setter methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + " - fan is on";
        } else {
            return "Color: " + color + ", Radius: " + radius + " - fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("fan1: " + fan1.toString());
        System.out.println("fan2: " + fan2.toString());
    }
}
/*

            Fan
-------------------------------
 + SLOW: int
 + MEDIUM: int
 + FAST: int
-------------------------------
 - speed: int
 - on: boolean
 - radius: double
 - color: String
-------------------------------
 + Fan()
 + getSpeed(): int
 + setSpeed(speed: int): void
 + isOn(): boolean
 + setOn(on: boolean): void
 + getRadius(): double
 + setRadius(radius: double):void
 + getColor(): String
 + setColor(color: String): void
 + toString(): String

 */