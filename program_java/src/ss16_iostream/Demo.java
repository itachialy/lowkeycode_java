package ss16_iostream;

import CGManagement.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        String src = "src/ss16_iostream/demo.csv";
        String name = "ok ahihi";
        File file = new File(src);
        Student student = new Student(1, "HV-01", "Itachi",
                LocalDate.parse("1000-11-11"), "viety@gnmail.com", "c0324");
        Student student2 = new Student(1, "HV-01", "Itachi",
                LocalDate.parse("1000-11-11"), "viety@gnmail.com", "c0324");
        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String data = student.getId() + "," + student.getCode() + "," + student.getName() + "," +
                    student.getBirthday() + "," +student.getEmail() + "," + student.getClassName();
            String data2 = student2.getId() + "," + student2.getCode() + "," + student2.getName() + "," +
                    student2.getBirthday() + "," +student2.getEmail() + "," + student2.getClassName();
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.write(data2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
