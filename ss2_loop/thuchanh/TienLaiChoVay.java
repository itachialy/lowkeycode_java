
package ss2_loop.thuchanh;

import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double laiSuat = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi :");
        money = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số tháng gửi :");
        month = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập lãi suất :");
        laiSuat = Double.parseDouble(sc.nextLine());
        double total = 0;
        for (int i = 0 ; i < month ; i++) {
            total += money * (laiSuat/100) / 12  * month;
        }
        System.out.println("Lãi suất nhận được là : "+ total);
    }
}
