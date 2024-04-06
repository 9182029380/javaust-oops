package FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class ReadfilewithInputstream {
    public static void main(String[] args) {
        try {
            InputStream i = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\es6.txt");
            int data;
            while ((data = i.read()) != -1) {
                System.out.print((char) data);
            }
            i.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

}
