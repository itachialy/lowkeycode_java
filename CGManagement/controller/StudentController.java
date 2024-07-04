package CGManagement.controller;

import CGManagement.model.Student;
import CGManagement.service.IStudentService;
import CGManagement.service.StudentServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private final IStudentService iStudentService = new StudentServiceImpl();
    private final Scanner sc = new Scanner(System.in);
    public String inputCode,inputName, inputEmail, inputClassName, inputDOB;
    //hien thị danh sách sinh viên
    public void displayStudent(){
        List<Student> students = iStudentService.findAll();
        for(Student s : students){
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
    public void removeStudent(){
        System.out.println("Nhập id của học viên cần xóa :");
        int id = Integer.parseInt(sc.nextLine());
        boolean isRemoved = iStudentService.removeStudent(id);
        if (isRemoved){
            System.out.println("xóa thành công");
        } else {
            System.out.println("ID k tồn tại");
        }
    }
    public void updateStudent(){
        System.out.println("Nhập id của học viên cần chỉnh sửa :");
        int id = Integer.parseInt(sc.nextLine());
        // Kiểm tra xem học viên có tồn tại không
        if (!iStudentService.isExistingStudent(id)) {
            System.out.println("Học viên với ID này không tồn tại.");
            return; // Thoát khỏi phương thức nếu không tồn tại học viên
        }
        inputFromScreen();
        if (iStudentService.updateStudent(id, inputCode, inputName, LocalDate.parse(inputDOB), inputEmail, inputClassName)){
            System.out.println("Cập nhật thành công.");
        } else {
            System.out.println("Không thành công");
        }
    }
}
