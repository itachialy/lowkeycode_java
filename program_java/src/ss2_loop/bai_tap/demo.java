package ss2_loop.bai_tap;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        int n ;
//        Scanner sc = new Scanner(System.in);
//
//        do {
//            System.out.println("nhập 1 số");
//            n = sc.nextInt();
//        } while (n < 0 || n > 50)  ;


//        int rows = 5; // Số hàng của tam giác

        for (int i = 1; i <= 5; i++) { // Vòng lặp ngoài, duyệt qua số dòng (chiều dài)
            // In ra dấu '*' ở bên trái
            for (int j = 1; j <= 5 -i; j++) {
                System.out.print("-");
            }
            // In ra dấu '*' ở bên phải
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng sau khi in ra một hàng
        }


//        for (int i = 1; i <= 5 ; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("+");
//            }
//            System.out.println();
//        }
    }
}
