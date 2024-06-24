package MVC.view;

import MVC.controller.StudentController;

public class CodeGymManagement {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.displayStudent();
    }
}
