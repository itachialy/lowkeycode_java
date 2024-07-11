package ss12_search;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 6, 7, 7, 7, 9, 10};
        // ta có 0 + 9 = 9 / 2 = 4 = arr[4] = mid = 6
        // arr mid = 6 , bé hơn sonhapvao là 7 nên chay min = mid + 1 , mid là 4 + 1 =  5 = low
        //  tiếp tục 5 vẫn bé hơn sonhapvao là 7 nên tiếp tục  chạy vòng lặp
        // low 5 và high đang 9
        //mid = 9 + 5 bằng 14 chia 2 bằng 7
        // arr[7] bàng 7 luôn , bằng vs  số nhập vao la 7 nên dừng vòng lp

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần tìm kiếm :");
        int v = sc.nextInt();
        System.out.println("vị trí là : " + binary(arr, v));
    }
    public static int binary( int[] arr , int sonhapvao) {
        int min = 0;
        int max = arr.length -1;
        while (max >= min) {
            int mid = ( max + min)/2;
            if (sonhapvao == arr[mid]){
                return mid;
            } else if (sonhapvao > arr[mid]) {
                min = mid + 1;
            } else { // ( sonhapvao < arr[mid]
                max = mid - 1;
            }
        }
        return -1;
    }
}
