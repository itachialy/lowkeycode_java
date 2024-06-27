package MVC.service;

import MVC.model.Student;

public interface IStudentService {
    static void addStudent(Student newStudent) {
    }

    Student[] findAll();
    Student[] addStudent();
}
