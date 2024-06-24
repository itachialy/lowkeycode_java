package MVC.repository;

import MVC.model.Student;

import java.time.LocalDate;

public class StudentRepositoryImpl implements IStudentRepository {

    private final static Student[] students;
    static {
        students = new Student[5];
        students[0] = new Student(1, "01", "Việt","13-09-2000", "kai@gmail.com", "A1");
        students[1] = new Student(2, "11", "Việt","13-09-2000", "kai@gmail.com", "A1");
        students[2] = new Student(3, "12", "Việt","13-09-2000", "kai@gmail.com", "A1");
    }
    @Override
    public Student[] findAll() {
        return students;
    }
}
