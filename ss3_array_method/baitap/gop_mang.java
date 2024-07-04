package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng 1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Nhập các phần tử mảng 1: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhập kích thuóc mảng 2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Nhập các phần tử mảng 2: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Mảng 1 là: " + Arrays.toString(arr1));
        System.out.println("Mảng 2 là: " + Arrays.toString(arr2));
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }
        System.out.println("Mảng 3 khi ghép mảng 1 vào là: " + Arrays.toString(arr3));

        for (int i =0; i < size2; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println("Mảng 3 sau khi ghép thêm mảng 2 vào là: " + Arrays.toString(arr3));
    }
}
