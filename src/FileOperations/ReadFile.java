package FileOperations;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("C:\\Users\\Admin\\OneDrive\\Desktop\\es6.txt");
            BufferedReader reader = new BufferedReader(file);
            String line ;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
