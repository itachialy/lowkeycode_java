package CGManagement.controller;

import CGManagement.model.Student;
import CGManagement.service.IStudentService;
import CGManagement.service.StudentServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class StudentController {
    private final IStudentService iStudentService = new StudentServiceImpl();
    private final Scanner sc = new Scanner(System.in);
    public void displayStudent(){
        List<Student> students = iStudentService.findAll();
        for(Student s : students){
            System.out.println(s);
        }
    }

    public void addNewStudent() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập mã học viên: ");
        String code = sc.nextLine();
        System.out.print("Nhập tên HV: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh HV: ");
        String temp = sc.nextLine();
        LocalDate birthday = LocalDate.parse(temp);
        System.out.print("Nhập email của HV: ");
        String email = sc.nextLine();
        System.out.print("Nhập lớp học: ");
        String className = sc.nextLine();
        Student student = new Student(id, code, name, birthday, email, className);

        iStudentService.save(student);
    }
}
