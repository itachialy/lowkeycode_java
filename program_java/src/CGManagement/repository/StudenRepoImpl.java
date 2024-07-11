package CGManagement.repository;

import CGManagement.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudenRepoImpl implements IStudentRepo {
    private final static List<Student> students;
    static {
        students = new ArrayList<>();
        students.add(new Student(1, "HV1", "Việt", LocalDate.parse("2000-09-09"), "viet@gmail.com", "C0324"));

    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }


    @Override
    public boolean removeStudent(int id) {
        for(Student student : students){
            if (student.getId() == id){
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateStudent(int id,String code,  String name, LocalDate birthday, String email, String className) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setBirthday(birthday);
                student.setName(name);
                student.setBirthday(birthday);
                student.setEmail(email);
                student.setClassName(className);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isExistingStudent(int id) {
        for (Student student : students){
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
