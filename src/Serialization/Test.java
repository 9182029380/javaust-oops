package Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        List<Product> list = new ArrayList<>();
        list.add(new Product("HP Pavilion 35.6 cm Laptop 14-dv2014TU",65999.00,"12th Generation Intel® Core™ i5 processor Windows 11 Home 35.6 cm (14) diagonal display Brightview with Intel® Iris® Xᵉ Graphics 16 GB DDR4 512 GB SSD Solid State Drive Backlit keyboard, Fingerprint reader, Wide Vision 720p HD camera, B&O Speakers","12th Generation Intel","HP","Silver","10",80));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter folderpath");
        String folderpath = sc.nextLine();
        String filepath= folderpath+File.separator+"product.ser";
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath))){
            oos.writeObject(list);
            System.out.println("File saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
