
package ss2_loop.thuchanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số :");
        int number = Integer.parseInt(sc.nextLine());
        if (number < 2) {
            System.out.println(number +" không phải là số nguyên tố.");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.println(number + " là số nguyên tố.");
            else {
                System.out.println(number + " không phải là số nguyên tố.");
            }
        }
    }
}
