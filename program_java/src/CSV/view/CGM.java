package CSV.view;


import CSV.controller.StudentController;

import java.util.Scanner;

public class CodeGymManagement {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MenuFunc();
    }

    public static void MenuFunc() {
        do {
            System.out.println("----------------Trang chủ---------------" +
                    "1. Quản lí học viên" +
                    "2. Quản lí giảng viên" +
                    "0. Thoát chương trình" +
                    "Nhập lựa chọn:" );
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    StudentManagement();
                    break;
                case 2:
//                    TeacherManagement();
                    break;
                default:
                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
            }
        }while(true);
    }

    public static void StudentManagement() {
        StudentController studentController = new StudentController();
        do{
            System.out.println(
                    "1. Hiển thị danh sách HV" +
                    "2. Thêm học viên" +
                    "3. Xóa học viên"+
                    "4. Chỉnh sửa thông tin HV"+
                    "5. Tìm kiếm học viên theo tên"+
                    "6. Xuất file CSV từ List"+
                    "7. Thêm học viên vào file CSV"+
                    "8. Hiển thị danh sách học viên từ file CSV"+
                    "9. Chỉnh sửa thông tin HV trong file CSV"+
                    "10. Xóa học viên trong file CSV"+
                    "0. Quay lại trang chủ"+
                    "Nhập lựa chọn : ");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 0 : return;
                case 1 :
                    studentController.displayAllStudents(); break;
                case 2 :
                    studentController.addStudent();
                    break;
                case 3 :
                    studentController.removeStudent();
                    break;
                case 4 :
                    studentController.updateStudent();
                    break;
                case 5:
                    studentController.getStudentsByName();
                    break;
                case 6:
                    studentController.exportToCSV();
                    break;
                case 7:
                    studentController.addStudentToCSV();
                    break;
                case 8:
                    studentController.displayAllStudentsFromCSV();
                    break;
                case 9:
                    studentController.updateStudentInCSV();
                    break;
                case 10:
                    studentController.deleteStudentInCSV();
                    break;
                default:
                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
            }
        }while(true);

    }
//    public static void TeacherManagement() {
//        TeacherController teacherController = new TeacherController();
//        do{
//            System.out.println("""
//                    ---------Quản lí giảng viên----------
//                    1. Hiển thị danh sách GV
//                    2. Thêm giảng viên
//                    3. Xóa giảng viên
//                    4. Chỉnh sửa thông tin GV
//                    0. Quay lại trang chủ
//                    Nhập lựa chọn :\s""");
//            int opt = Integer.parseInt(sc.nextLine());
//            switch (opt){
//                case 0 : return;
//                case 1 : teacherController.displayAllTeachers(); break;
//                case 2 :
//                case 3 :
//                case 4 :
//                default:
//                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
//            }
//        }while(true);
//    }
}

