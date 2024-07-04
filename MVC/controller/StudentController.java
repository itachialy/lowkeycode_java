
package MVC.controller;

import MVC.model.Student;
import MVC.service.IStudentService;
import MVC.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private final IStudentService iStudentService = new StudentServiceImpl();

    public void displayStudent() {
        Student[] students = iStudentService.findAll();
        for (Student s : students) {
            if (s == null) {
                break;
            }
            System.out.println(s);
        }
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập id:");
//        int id = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập mã khóa học:");
//        String code = sc.nextLine();
        System.out.println("Nhập tên sinh viên:");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh (dd-mm-yyyy):");
        String birthday = sc.nextLine();
        System.out.println("Nhập email:");
        String email = sc.nextLine();
        System.out.println("Nhập lớp học:");
        String className = sc.nextLine();
        iStudentService.addStudent(name, birthday, email, className);

////        // Tạo sinh viên mới từ thông tin nhập vào
////        Student student = new Student( name, birthday, email, className);
//        // Gọi phương thức addStudent của repository để thêm sinh viên vào danh sách
//        IStudentService.addStudent(student);
//        System.out.println("Sinh viên đã được thêm thành công!");
    }
}
