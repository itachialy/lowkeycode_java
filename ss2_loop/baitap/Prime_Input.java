
package ss2_loop.baitap;

import java.util.Scanner;

public class Prime_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra :");
        int numbers = sc.nextInt();
        int count = 0;
        int n = 2;
        System.out.println(numbers + " số nguyên tố đầu tiên là :");
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
