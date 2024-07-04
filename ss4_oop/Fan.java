package ss4_oop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
     // constructor
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }
    // getter setter
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(){
        this.speed = speed;
    }
    public boolean isOn(){
        return on;
    }
    public void setOn(){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public String toString(){
        if (on) {
            return "speed: " + speed + ", color: " + color + ", radius: " + radius + " , fan is on";
        } else {
            return "color: " + color + ", radius: " + radius + ", fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = FAST;
        fan1.radius = 10.0;
        fan1.color = "yellow";
        fan1.on = true;

        Fan fan2 = new Fan();
        fan2.speed = MEDIUM;
        fan2.radius = 5.0;
        fan2.color = "blue";
        fan2.on = false;
        System.out.println("fan1 : " + fan1.toString());
        System.out.println("fan2 : " + fan2.toString());
    }
}
