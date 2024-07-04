package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class GTNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập vào các phần tử trong mảng");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}
