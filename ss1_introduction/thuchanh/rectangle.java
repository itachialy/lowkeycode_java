package ss1_introduction.thuchanh;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập chiều cao :");
        height = Float.parseFloat(sc.nextLine()); // nhập chiều cao
        System.out.println("Nhập chiều rộng :");
        width = Float.parseFloat(sc.nextLine()); // nhập chiều rộng
        float area = height * width ;
        System.out.println("Diện tích HCN là : " +area);
    }
}
