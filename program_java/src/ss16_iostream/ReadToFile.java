package ss16_iostream;

import CGManagement.model.Student;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadToFile {
    public static void main(String[] args) {
        String src = "src/ss16_iostream/demo1.csv";
        File file = new File(src);
        List<Student> list = new ArrayList<>();
        try(
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String temp;

            while ((temp = bufferedReader.readLine()) != null) {
                String dataArray[] = temp.split(",");
                list.add(new Student(
                        Integer.parseInt(dataArray[0]),
                        dataArray[1],
                        dataArray[2],
                        LocalDate.parse(dataArray[3]),
                        dataArray[4],
                        dataArray[5]
                ));
            }

        } catch(IOException e){
            e.printStackTrace();

        }
        System.out.println(list);
    }
}
