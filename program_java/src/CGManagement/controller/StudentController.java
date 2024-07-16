package CGManagement.controller;

import CGManagement.model.Student;
import CGManagement.service.IStudentService;
import CGManagement.service.StudentServiceImpl;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    public void getStudentByName() {
        String name;
        do {
            System.out.print("Nhập tên sinh viên cần tìm kiếm: ");
            name = sc.nextLine();
            if (name.isEmpty()) {
                System.out.println("Bạn chưa nhập tên để tìm kiếm!");
            } else {
                List<Student> studentList = iStudentService.getStudentsByName(name);
                if (studentList.isEmpty()) {
                    System.out.println("Không tìm thấy sinh viên nào có tên chứa \"" + name + "\".");
                } else {
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                }
            }
        } while (name.isEmpty());
    }

    public void exportToCSV() {
        try(
                FileWriter fileWriter = new FileWriter("src/CGManagement/view/students.csv", false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
                ) {
            try {
                bufferedWriter.write("Class\tID\tCode\tName\tBirthday\tEmail\n");
                List<Student> students = iStudentService.findAll();
                for( Student student : students){
                    bufferedWriter.write(
                            student.getClassName() + "\t" +
                            student.getId() + "\t" +
                            student.getCode() + "\t" +
                            student.getName() + "\t" +
                            student.getBirthday() + "\t" +
                            student.getEmail());
                    bufferedWriter.newLine();
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
     CRUD using file CSV
     Create: Thêm học viên vào file CSV
     Read: Đọc toàn bộ học viên từ file CSV
     Update: Cập nhật thông tin học viên trong file CSV
     Delete: Xóa học viên khỏi file CSV
     */
// chuyển dữ liệu file sang mảng list arr student
    File file = new File("src/CGManagement/view/students_data.csv");
    public List<Student> convertCSVtoLine( File file){
        List<Student> list = new ArrayList<>();
        try(
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Student student = new Student(Integer.parseInt(data[1]),
                        data[2],
                        data[3],
                        LocalDate.parse(data[4]),
                        data[5],
                        data[0]);
                list.add(student);
            }
        } catch ( IOException e){
            System.err.println(e.getMessage());
        }
        return list;
    }

    public void addStudentToCSV() {
        inputFromScreen();
        try (
                FileWriter fileWriter = new FileWriter("src/CGManagement/view/students_data.csv", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ){
            bufferedWriter.write(inputClassName + ","
                    + "0" + ","
                    + inputCode + ","
                    + inputName + ","
                    + LocalDate.parse(inputDOB) + ","
                    + inputEmail);
            bufferedWriter.newLine();
            System.out.println("Thêm sinh viên thành công.");

        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
