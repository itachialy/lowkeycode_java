package CSV.service;


import CSV.model.Student;

import java.time.LocalDate;
import java.util.List;


public interface IStudentService {
    List<Student> findAll();

    boolean addStudent(int id, String code, String name, LocalDate birthday, String email, String className);

    boolean removeStudent(int id);

    boolean updateStudent(int id, String name, LocalDate birthday, String email, String className);

    List<Student> getStudentsByName(String name);
}
