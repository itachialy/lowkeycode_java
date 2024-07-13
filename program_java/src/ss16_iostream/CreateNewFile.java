package ss16_iostream;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        String src = "src/ss16_iostream";
        String fileName = "demo1.csv";
        File file = new File(src, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getAbsoluteFile());
    }
}
