package CGManagement.service;

import CGManagement.model.Student;
import CGManagement.repository.IStudentRepo;
import CGManagement.repository.StudenRepoImpl;

import java.util.List;

public class StudentServiceImpl implements IStudentService{
    private final IStudentRepo iStudentRepo = new StudenRepoImpl();

    @Override
    public List<Student> findAll() {
        return iStudentRepo.findAll();
    }

    @Override
    public void save(Student student) {
        iStudentRepo.save(student);
    }
}
