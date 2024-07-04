package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khai báo và khởi tạo mảng
        int[] arr = {1, 2, 3, 4, 5};
        // nhập phần tử cần xóa
        System.out.println("Nhập phần tử can xóa : ");
        int x = sc.nextInt();
        removeEle(arr, x);
    }

    public static void removeEle(int[] arr, int x) {
        boolean check = false; // biến check xem phần tử cần xóa có tồn tại trong manrg khong
        // có thì false => true
        int index_del = 0; // biến lưu trữ phần tử can xóa
        // tìm vị trí của phần tử cần xóa=> duyệt qua mảng
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) { // nếu pt v trí i tồn tai là phần tu can xóa
                check = true; // tìm thấy phần tử cần xóa
                index_del = i; // lưu trữ vị trí cần xóa
                break;
            }
        }
        if (check == true) {
            for (int i = index_del; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1]=0;
        }
        System.out.println("Mảng sau khi xóa : ");
        System.out.println(Arrays.toString(arr));
    }
}
