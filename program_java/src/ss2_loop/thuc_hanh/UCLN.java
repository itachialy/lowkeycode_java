package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a :");
        a = sc.nextInt();
        System.out.println("Nhập số b :");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("Không có UCLN.");
        } else if (a == 0) {
            System.out.println("UCLN là : " + b);
        } else if (b == 0) {
            System.out.println("UCLN là : " + a);
        }
        while (a != b) {
                if (a > b)
                    a = a - b ;
                else // a<b
                    b = b - a;
            }
            System.out.println("UCLN : " + a);
        }
    }
