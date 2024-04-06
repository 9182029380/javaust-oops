package FileOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        try {
            OutputStream w = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\sharath\\sharath.txt");
            String text="In Java, a File is an abstract data type. A named location used to store related information is known as a File. There are several File Operations like creating a new File, getting information about File, writing into a File, reading from a File and deleting a File.";
            byte[] b = text.getBytes();
            w.write(b);
            w.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
