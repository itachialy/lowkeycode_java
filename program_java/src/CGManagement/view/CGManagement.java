package CGManagement.view;

import CGManagement.controller.StudentController;

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
                    "5.Quay ve Menu chính.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
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
                    return;
            }
        } while (true);
    }
}
