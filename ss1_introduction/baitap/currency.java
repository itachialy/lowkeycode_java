package ss1_introduction.baitap;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền USD :");
        usd = Integer.parseInt(sc.nextLine());
        int rate = usd * 23000 ;
        System.out.println("Số tiền VNĐ là : " + rate);
    }
}
