package CGManagement.repository;

import CGManagement.model.Student;
import CGManagement.model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepoImpl implements ITeacherRepo{
    private final static List<Teacher> teachers;
    static {
        teachers = new ArrayList<>();
        teachers.add(new Teacher(1, "HV1", "Việt",LocalDate.parse("2000-09-09"),
                "viet@gmail.com",1));
    }
    @Override
    public List<Teacher> findAll() {
        return teachers;
    }

    @Override
    public void save(Teacher teacher) {
        teachers.add(teacher);
    }
}
