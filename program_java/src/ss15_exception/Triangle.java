package ss15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của tam giác : ");
        try {
            double edge1 = sc.nextDouble();
            double edge2 = sc.nextDouble();
            double edge3 = sc.nextDouble();
            checkTriangle(edge1,edge2,edge3);
            System.out.println("Tam giác hợp lệ");
        } catch (IllegalTriangleException e){
            System.err.println("Lỗi: " + e.getMessage());
        }
        catch (InputMismatchException ime){
            System.err.println("Vui lòng nhập số, không nhập chữ hay kí tự bậy bạ.");
        }finally {
            System.out.println("Kết thúc chương trình");
        }

    }
    public static void  checkTriangle ( double edge1 , double edge2 , double edge3 ) throws IllegalTriangleException {
        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
            throw new IllegalTriangleException("Các cạnh của tam giác không thể là số âm hay bằng 0.");
        }
        if (edge1 + edge2 < edge3 || edge2 + edge3 < edge1 || edge3 + edge1 < edge2) {
            throw new IllegalTriangleException("Tổng 2 cạnh nhập vào phải lớn hơn cạnh còn lại.");
        }
        if (edge1 == edge2 && edge2 == edge3) {
            throw new IllegalTriangleException("Tam giác này là tam giác đều.");
        }

    }
}
