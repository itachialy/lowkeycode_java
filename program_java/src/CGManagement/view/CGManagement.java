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
                    System.out.println("Chinh sua sinh vien.");
                    break;
                case 4:
                    System.out.println("Xoa sinh vien.");
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

//    public static void chooseTeacherFunction() {
//        Scanner sc = new Scanner(System.in);
//        TeacherController teacherController = new TeacherController();
//        do {
//            System.out.println("Lựa chọn chức năng: \n" +
//                    "1.Hien thi danh sach \n" +
//                    "2.Them moi giang vien. \n" +
//                    "3.Chinh sua giang vien. \n" +
//                    "4.Xoa giang vien. \n" +
//                    "5.Quay ve Menu chính.");
//            int choice = Integer.parseInt(sc.nextLine());
//            switch (choice) {
//                case 1:
//                    teacherController.displayTeacher();
//                    break;
//                case 2:
//                    System.out.println("Them moi giang vien.");
//                    break;
//                case 3:
//                    System.out.println("Chinh sua giang vien.");
//                    break;
//                case 4:
//                    System.out.println("Xoa giang vien.");
//                    break;
//                case 5:
//                    return;
//            }
//        } while (true);
    }
