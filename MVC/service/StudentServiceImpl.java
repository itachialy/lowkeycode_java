
package MVC.service;

import MVC.model.Student;
import MVC.repository.IStudentRepository;
import MVC.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements IStudentService{
    private final IStudentRepository iStudentRepository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return iStudentRepository.findAll() ;
    }

    @Override
    public void addStudent(String name, String birthday, String email, String className) {
        iStudentRepository.addStudent(name, birthday, email, className);
    }
}
