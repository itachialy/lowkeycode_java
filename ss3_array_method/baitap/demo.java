package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

        public class demo {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
//                System.out.println("Nhập số mảng cha:");
//                int cha = sc.nextInt();
//                System.out.println("Nhập số mảng con:");
//                int con = sc.nextInt();
//                int arr2d[][] = new int[cha][con];
//                System.out.println("Nhap kich thuoc mang");
                int arr2d [][] = new int[3][3];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.println("Nhập giá trị cho phần tử vị trí [" + i + "][" + j + "]: ");
                        arr2d[i][j] = sc.nextInt();
                    }
                }
                System.out.println(Arrays.deepToString(arr2d));
    }
}
