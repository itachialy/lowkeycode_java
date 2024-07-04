package MVC.repository;

import MVC.model.Student;

public interface IStudentRepository {
    Student[] findAll();


    void addStudent(String name, String birthday, String email, String className);
}