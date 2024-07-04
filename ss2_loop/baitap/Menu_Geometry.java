package ss2_loop.baitap;

import java.util.Scanner;

public class Menu_Geometry {
    public static void main(String[] args) {
        int choice = -1 ;
        Scanner sc = new Scanner(System.in);
        while ( choice != 0 ) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle botton-left");
            System.out.println("3. Draw the square triangle top-left");
            System.out.println("4. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: // in hình chữ nhật
                    for (int i = 0; i < 3 ; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2: // in hình TG vuông góc trái dưới
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("+ ");
                        }
                        System.out.println();
                    }
                    break;
                case 3: // in hình TG vuông góc trái trên
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("$ ");
                        }
                        System.out.println();
                    }
                    break;
                case 4: // in tam giác vuông
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("#");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Chỉ nhập những số có trong MENU :)) ");
            }
        }
    }
}