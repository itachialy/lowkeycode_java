package CGManagement.repository;

import CGManagement.model.Teacher;

import java.util.List;

public interface ITeacherRepo {
    List<Teacher> findAll();
    void save(Teacher teacher);
}
