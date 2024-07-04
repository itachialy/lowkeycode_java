
package MVC.repository;

import MVC.model.Student;
import MVC.model.Teacher;

public class TeacherRepositoryImpl implements ITeacherRepository{

    private final static Teacher[] teachers;
    static {
        teachers = new Teacher[5];
        teachers[0] = new Teacher(1, "01", "Itachi","13-09-2000", "kai@gmail.com", 50);
        teachers[1] = new Teacher(2, "02", "Gojo","13-09-2000", "kai@gmail.com", 50);
        teachers[2] = new Teacher(3, "03", "Koro-sensei","13-09-2000", "kai@gmail.com", 100);
    }
    @Override
    public Teacher[] findAll() {
        return teachers;
    }
}
