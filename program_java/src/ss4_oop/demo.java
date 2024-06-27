package ss4_oop;

public class demo {
    static public int X = 2;

    static {
        X = 1;
    }

    static public void method() {
        X = 5;
    }

    public static void main(String[] args) {
        demo o = new demo();
        demo.method();
        demo.X = 10;
        System.out.printf("x=%d, y=%d", o.X, demo.X);
    }
}
