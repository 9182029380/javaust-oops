package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your file path ");
       String s = scanner.nextLine();
       try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s))){
           List<Product> list = (List<Product>) ois.readObject();
           System.out.println(list);
           for(Product p : list){
               System.out.println(p.getName());
           }


       } catch (IOException e) {
           throw new RuntimeException(e);
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
    }
}
