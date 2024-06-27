package MVC.repository;

import MVC.model.Student;

import java.util.List;

public interface IStudentRepository {
    Student[] findAll();

    static Student[] addStudent() {
        return addStudent();
    }
//    public void display(List<Student> list);
//    public void remove(List<Student> list, int i);
//    public void edit(List<Student> list, int i);
}
