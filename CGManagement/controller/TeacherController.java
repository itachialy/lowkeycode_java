package CGManagement.controller;

import CGManagement.model.Student;
import CGManagement.model.Teacher;
import CGManagement.service.ITeacherService;
import CGManagement.service.TeacherServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class TeacherController {
    private final ITeacherService iTeacherService = new TeacherServiceImpl();
    private final Scanner sc = new Scanner(System.in);
    public void displayTeacher(){
        List<Teacher> teachers = iTeacherService.findAll();
        for (Teacher s : teachers){
            System.out.println(s);
        }
    }

    public void addNewTeacher() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập mã giảng vien: ");
        String code = sc.nextLine();
        System.out.print("Nhập tên GV: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh GV: ");
        String temp = sc.nextLine();
        LocalDate birthday = LocalDate.parse(temp);
        System.out.print("Nhập email của GV: ");
        String email = sc.nextLine();
        System.out.print("Nhập lương: ");
        int salary = Integer.parseInt(sc.nextLine());
        Teacher teacher = new Teacher(id, code, name, birthday, email, salary);

        iTeacherService.save(teacher);
    }
}
