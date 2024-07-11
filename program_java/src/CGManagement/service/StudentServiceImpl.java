package CGManagement.service;

import CGManagement.model.Student;
import CGManagement.repository.IStudentRepo;
import CGManagement.repository.StudenRepoImpl;

import java.time.LocalDate;
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



    @Override
    public boolean removeStudent(int id) {
        return iStudentRepo.removeStudent(id);
    }

    @Override
    public boolean updateStudent(int id, String code, String name, LocalDate birthday, String email, String className) {
        return iStudentRepo.updateStudent(id, code, name, birthday, email, className);
    }

    @Override
    public boolean isExistingStudent(int id) {
        return iStudentRepo.isExistingStudent(id);
    }
}
