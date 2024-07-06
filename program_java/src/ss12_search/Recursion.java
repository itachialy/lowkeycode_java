package ss12_search;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 55};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần tìm kiếm :");
        int v = sc.nextInt();
        System.out.println("vị trí là : " + binary(arr, v, arr.length - 1, 0));
    }


    public static int binary(int[] arr, int v, int max, int min) {
        if (max >= min) {
            int mid = (max + min) / 2;
            if (v == arr[mid]) {
                return mid;
            } else if (v > arr[mid]) {
                min = mid + 1;
                return binary(arr, v, max, min);
            } else {
                max = mid - 1;
                return binary(arr, v, max, min);
            }
        }
        return -1;
    }
}