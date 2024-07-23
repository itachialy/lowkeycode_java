package case2.controller;

import case2.model.Student;
import case2.service.StudentService;
import case2.service.StudentServiceimpl;

import java.util.List;

public class StudentController {
    private final StudentService studentService = new StudentServiceimpl();

    public void getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        // Process the list of students (e.g., print or return)
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    public void getStudentById(int id) {
        Student student = studentService.getStudentById(id);
        // Process the student (e.g., print or return)
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student with id " + id + " not found.");
        }
    }
    public void addStudent(Student student) {
        studentService.addStudent(student);
        System.out.println("Student added successfully.");
    }
    public void updateStudent(Student student) {
        studentService.updateStudent(student);
        System.out.println("Student updated successfully.");
    }
    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
        System.out.println("Student with id " + id + " deleted successfully.");
    }
}
