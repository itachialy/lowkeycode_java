package case2.repository;

import case2.model.Student;

import java.util.List;

public interface StudentRepo {
    List<Student> getAllStudents();
    Student getStudentById(int id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);
}
