
package MVC.controller;

import MVC.model.Teacher;
import MVC.service.ITeacherService;
import MVC.service.TeacherServiceImpl;

public class TeacherController {
    private final ITeacherService iTeacherService = new TeacherServiceImpl();

    public void displayTeacher() {
        Teacher[] teachers = iTeacherService.findAll();
        for (Teacher ele : teachers) {
            if (ele == null) {
                break;
            }
            System.out.println(ele);
        }
    }
}
