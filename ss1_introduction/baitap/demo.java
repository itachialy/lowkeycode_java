package ss1_introduction.baitap;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Nhập số nhỏ hơn 50 và lớn hơn 0 :");
//            n = Integer.parseInt(sc.nextLine());
//            if (n < 50 && n > 0) {
//                return;
//            } else {
//                System.out.println("nhập lại");
//            }
//        }
//    }
//}
    Scanner sc = new Scanner(System.in);
    int n;
        do{
        System.out.println("Enter a number4: ");
        n = sc.nextInt();
    }while(n <=0 || n >= 50);
}
}

