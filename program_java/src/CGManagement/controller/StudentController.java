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
    public String inputCode, inputName, inputEmail, inputClassName, inputDOB;

    public void displayStudent() {
        List<Student> students = iStudentService.findAll();
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void inputFromScreen() {
        System.out.println("Nhập vào mã sinh viên: ");
        inputCode = sc.nextLine();
        System.out.print("Nhập tên học viên: ");
        inputName = sc.nextLine();
        System.out.print("Nhập ngày sinh HV: ");
        inputDOB = sc.nextLine();
        System.out.print("Nhập email của HV: ");
        inputEmail = sc.nextLine();
        System.out.print("Nhập lớp học: ");
        inputClassName = sc.nextLine();
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

    public void removeStudent() {
        System.out.println("Nhập id của học viên cần xóa : ");
        int id = sc.nextInt();
        boolean isRemove = iStudentService.removeStudent(id);
        if (isRemove) {
            System.out.println(" Xóa thành công ");
        } else {
            System.out.println("id khong tồn tại.");
        }
    }

    public void updateStudent() {
        System.out.println("Nhập id của học viên cần chỉnh sửa : ");
        int id = sc.nextInt();
        if (!iStudentService.isExistingStudent(id)) {
            System.out.println("Không tồn tại id này trong danh sách học viên.");
            return;
        }
        inputFromScreen();
        if (iStudentService.updateStudent(id, inputCode, inputName, LocalDate.parse(inputDOB), inputEmail, inputClassName)) {
            System.out.println("Cập nhật thành công.");
        } else {
            System.out.println("Không thành công");
        }
    }
}
