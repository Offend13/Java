package Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferFileRead {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("src/Files/FileRead.java"));
            String line;
            while (true) {
                try {
                    while (((line = file.readLine()) != null)) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
