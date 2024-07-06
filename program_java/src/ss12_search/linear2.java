package ss12_search;

import java.util.Arrays;
import java.util.Scanner;

public class linear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size :");
        int size = sc.nextInt();
        int[]arr = new int[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("Nhập phần tử thứ " +i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhập phần tử v:");
        int v = sc.nextInt();

        System.out.println("vị trí phần tử " + v + " là :" + linear(arr,v));
    }
    public static int linear(int[] arr, int v){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                return i;
            }
        }
        return -1;
    }
}
