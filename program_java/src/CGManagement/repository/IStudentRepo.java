package CGManagement.repository;

import CGManagement.model.Student;

import java.time.LocalDate;
import java.util.List;

public interface IStudentRepo {
    List<Student> findAll();
    void save(Student student);

    boolean removeStudent(int id);
    boolean updateStudent(int id, String code, String name, LocalDate birthday, String email, String className);
    boolean isExistingStudent(int id);
}
