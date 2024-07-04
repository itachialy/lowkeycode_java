package ss3_array_method.thuchanh;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
//        int size;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Nhập dộ dài của mảng :");
//            size = Integer.parseInt(sc.nextLine());
//            if (size > 20)
//                System.out.println("Size không được vượt quá 20.");
//        } while (size > 20);
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng :");
        size = Integer.parseInt(sc.nextLine());
        while (size > 20) {
            System.out.println("Size không được vượt quá 20.");
            System.out.println("Nhập độ dài của mảng :");
            size = Integer.parseInt(sc.nextLine());
        }
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        for (int ele : arr)
            System.out.print(ele + " " );
        for (int j = 1; j < arr.length/2 ; j++) {
            int temp = arr[j];
            arr[j] = arr[size-1-j];
            arr[size-1-j] = temp;
        }
    }
}
