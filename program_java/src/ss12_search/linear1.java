package ss12_search;

import java.util.Scanner;

public class linear1 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5} ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can tim kiem");
        int v = sc.nextInt();
        System.out.println("Phần tử cần tìm ở vị trí thứ ;" + linear(arr , v));

    }
    public static int linear(int[]arr,int v){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v){
                return i;
            }
        }
        return -1;
    }
}

