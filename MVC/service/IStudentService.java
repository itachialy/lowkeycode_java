
package MVC.service;

import MVC.model.Student;

public interface IStudentService {
    Student[] findAll();

    void addStudent(String name, String birthday, String email, String className);
    
}
