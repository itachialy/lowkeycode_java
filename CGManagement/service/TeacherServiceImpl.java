package CGManagement.service;

import CGManagement.model.Teacher;
import CGManagement.repository.ITeacherRepo;
import CGManagement.repository.TeacherRepoImpl;

import java.util.List;

public class TeacherServiceImpl implements ITeacherService{
    private final ITeacherRepo iTeacherRepo = new TeacherRepoImpl();
    @Override
    public List<Teacher> findAll() {
        return iTeacherRepo.findAll();
    }

    @Override
    public void save(Teacher teacher) {
        iTeacherRepo.save(teacher);
    }
}
