package CGManagement.service;

import CGManagement.model.Teacher;

import java.util.List;

public interface ITeacherService {
    List<Teacher> findAll();
    void save(Teacher teacher);
}
