package case2.service;

import case2.model.Student;
import case2.repository.StudentRepo;
import case2.repository.StudentRepoImpl;

import java.util.List;

public class StudentServiceimpl implements StudentService {
    private final StudentRepo studentRepo = new StudentRepoImpl();
    @Override
    public List<Student> getAllStudents() {
        return studentRepo.getAllStudents();
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepo.getStudentById(id);
    }

    @Override
    public void addStudent(Student student) {
        studentRepo.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepo.updateStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteStudent(id);
    }
}
