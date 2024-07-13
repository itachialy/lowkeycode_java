package ss16_iostream;

import CGManagement.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Demo_Arraylist {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        String src = "src/ss16_iostream/demo.csv";
        File file = new File(src);
        Student student = new Student(1, "HV-01", "Itachi",
                LocalDate.parse("1000-11-11"), "viety@gnmail.com", "c0324");
        Student student2 = new Student(1, "HV-01", "Itachi",
                LocalDate.parse("1000-11-11"), "viety@gnmail.com", "c0324");
        list.add(student);
        list.add(student2);

        try (
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for( Student s : list) {
                String data = s.converToLine();
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
