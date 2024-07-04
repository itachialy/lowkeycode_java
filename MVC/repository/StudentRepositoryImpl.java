
package MVC.repository;

import MVC.model.Student;

public class StudentRepositoryImpl implements IStudentRepository {

    private final static Student[] students;
    static {
        students = new Student[5];
        students[0] = new Student(1, "HV-01", "Việt","13-09-2000", "kai@gmail.com", "A1");
        students[1] = new Student(2, "HV-02", "Việt","13-09-2000", "kai@gmail.com", "A1");
        students[2] = new Student(3, "HV-03", "Việt","13-09-2000", "kai@gmail.com", "A1");
    }
    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public void addStudent(String name, String birthday, String email, String className){
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                int id = i + 1;
                String code = "HV-0" + id;
                students[i] = new Student(id, code, name, birthday, email, className);
                System.out.println("Thêm học viên thành công!");
                return;
            }
        }
        System.out.println("Danh sách đã đủ. Không thể thêm học viên!");
    }
}
