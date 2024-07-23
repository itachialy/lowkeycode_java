package case2.view;



import case2.controller.StudentController;
import case2.model.Student;

import java.util.Scanner;

public class Main {
    private final StudentController studentController = new StudentController();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("===== Student Management System =====");
            System.out.println("1. View all students");
            System.out.println("2. View student by ID");
            System.out.println("3. Add new student");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
             // Consume newline character

            switch (choice) {
                case 1:
                    studentController.getAllStudents();
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    studentController.getStudentById(id);
                    break;
                case 3:
                    System.out.println("Enter student id: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    Student newStudent = new Student(id1,name, age);
                    studentController.addStudent(newStudent);
                    break;
                case 4:
                    System.out.print("Enter student ID to update: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter updated student name: ");
                    String updatedName = scanner.nextLine();
                    System.out.print("Enter updated student age: ");
                    int updatedAge = Integer.parseInt(scanner.nextLine());
                    Student updatedStudent = new Student(updateId,updatedName, updatedAge);
                    updatedStudent.setId(updateId);
                    studentController.updateStudent(updatedStudent);
                    break;
                case 5:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    studentController.deleteStudent(deleteId);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }

    public static void main(String[] args) {
        Main studentView = new Main();
        studentView.displayMenu();
    }
}
