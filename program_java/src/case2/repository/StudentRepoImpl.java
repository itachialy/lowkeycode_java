package case2.repository;

import case2.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepoImpl implements StudentRepo {
    private final String filePath = "src/case2/view/case.txt";

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                Student student = new Student(id, name, age);
                students.add(student);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            ;
        }
        return students;
    }

    @Override
    public Student getStudentById(int id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int studentId = Integer.parseInt(parts[0]);
                if (studentId == id) {
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    return new Student(id, name, age);
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void addStudent(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(student.getId() + "," + student.getName() + "," + student.getAge() + "\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            ;
        }
    }

    @Override
    public void updateStudent(Student student) {
        List<Student> students = getAllStudents();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == student.getId()) {
                students.set(i, student);
                found = true;
                break;
            }
        }
        if (found) {
            saveStudents(students);
        } else {
            System.out.println("Student not found with ID " + student.getId());
        }
    }

    @Override
    public void deleteStudent(int id) {
        List<Student> students = getAllStudents();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            saveStudents(students);
        } else {
            System.out.println("Student not found with ID " + id);
        }
    }

    private void saveStudents(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getAge() + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
