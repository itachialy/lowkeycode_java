package MVC.repository;

import MVC.model.Student;

public interface IStudentRepository {
    Student[] findAll();
}
