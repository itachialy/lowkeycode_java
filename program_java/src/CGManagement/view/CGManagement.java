package CGManagement.view;

import CGManagement.controller.StudentController;

import java.io.File;
import java.util.Scanner;

public class CGManagement {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        chooseMainFunc();
        chooseStudentFunc();
    }

    public static void chooseMainFunc() {
        do {
            System.out.println("Lựa chọn chức năng: \n" +
                    "1.Quản lí sinh viên. \n" +
                    "2.Quản lí giảng viên. \n" +
                    "3.Kết thúc chương trình.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    chooseStudentFunc();
                    break;
                case 2:
//                    chooseTeacherFunction();
                    System.out.println("Chưa hoàn thành xong chức năng này.");
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập đúng lựa chọn.");
            }
        } while (true);
    }

    public static void chooseStudentFunc() {
        StudentController studentController = new StudentController();
        do {
            System.out.println("Lựa chọn chức năng: \n" +
                    "1.Hien thi danh sach \n" +
                    "2.Them moi sinh vien. \n" +
                    "3.Chinh sua sinh vien. \n" +
                    "4.Xoa sinh vien. \n" +
                    "5.Tìm kiếm sinh viên theo tên. \n" +
                    "6. Xuất file CSV từ List. \n" +
                    "7. Thêm học viên vào file CSV. \n" +
                    "8. Hiển thị danh sách học viên từ file CSV. \n" +
                    "9. Chỉnh sửa thông tin HV trong file CSV. \n" +
                    "10. Xóa học viên trong file CSV. \n" +

                    "0.Quay ve Menu chính.") ;
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 0:
                    return;
                case 1:
                    studentController.displayStudent();
                    break;
                case 2:
                    studentController.addNewStudent();
                    break;
                case 3:
                    studentController.updateStudent();
                    break;
                case 4:
                    studentController.removeStudent();
                    break;
                case 5:
                    studentController.getStudentByName();
                case 6:
                    studentController.exportToCSV();
                    break;
                case 7:
                    studentController.addStudentToCSV();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;

            }
        } while (true);
    }
}
