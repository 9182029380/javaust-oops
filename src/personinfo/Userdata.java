package personinfo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Userdata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\sharath\\sharath.csv");
            PrintWriter writer = new PrintWriter(fileOutputStream);
            writer.println("Name,Age,Gender,Aadhar number,PAN number");
            boolean continueInput = true;
            while (continueInput) {
                System.out.println("Enter name");
                String name = sc.nextLine();
                System.out.println("Enter age");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter gender");
                String gender = sc.nextLine();
                System.out.println("Enter aadhar number");
                String aadhar = sc.nextLine();
                System.out.println("Enter pan number");
                String pan = sc.nextLine();


                writer.println(name+","+age+","+gender+","+aadhar+","+pan);
                System.out.println("Do you want to continue? (yes/no)");
                String choice = sc.nextLine().toLowerCase();
                if (!choice.equals("yes"))
                continueInput = false;
            }
            writer.close();
            fileOutputStream.close();
            System.out.println("Data saved to file.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

