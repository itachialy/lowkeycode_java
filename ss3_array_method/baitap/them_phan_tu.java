package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};// khởi tạo mảng arr gồm 5 phần tử
        System.out.println("Nhập phần tử cần chèn :");
        int x = sc.nextInt() ; // x là phan tu cần chèn
        System.out.println("Nhập vị trí index cần chèn :");
        int index = sc.nextInt(); // index là vị trí can chèn x vào
        if (index < 0 || index >= arr.length - 1){
            System.out.println("Không chèn dc phần tử vào mảng.");
        }
            for (int i = arr.length - 1; i >= index; i--) {
                /* duyệt mảng để chèn x vào mảng tại vị trí index
                duyệt i chạy từ cuối mảng đến vị trí index cần chèn
                mỗi lần lặp sẽ dịch chuyển các phần tử sang phải 1 vị trí
                bắt đầu từ vị trí cuối cùng của mảng và kết thúc
                tại vị trí index cần chèn phần tử mới.
                 */
                arr[i] = arr[i - 1];
        }
            arr[index] = x;
        System.out.println("Mảng sau khi thêm :");
        System.out.println(Arrays.toString(arr));
    }
}
