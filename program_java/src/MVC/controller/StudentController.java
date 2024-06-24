package MVC.controller;

import MVC.model.Student;
import MVC.service.IStudentService;
import MVC.service.StudentServiceImpl;

public class StudentController {
    private final IStudentService iStudentService = new StudentServiceImpl();
    public void displayStudent(){
        Student[] students = iStudentService.findAll();
        for(Student s : students){
            if (s == null) {
                break;
            }
            System.out.println(s);
        }
    }
}
