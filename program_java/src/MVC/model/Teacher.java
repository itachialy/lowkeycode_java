package MVC.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private int salary;
    public Teacher(int id, String code, String name, String birthday, String email, int salary) {
        super(id, code, name, birthday, email);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                '}' +
                super.toString();
    }
}
