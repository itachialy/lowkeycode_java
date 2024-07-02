package CGManagement.repository;

import CGManagement.model.Student;

import java.util.List;

public interface IStudentRepo {
    List<Student> findAll();

    void save(Student student);

}
