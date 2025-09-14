package Day22;

//Program 3: Reading data from a file using Scanner

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p11{
 public static void main(String[] args) {
     try {
         File file = new File("demo2.txt");
         Scanner reader = new Scanner(file);
         while (reader.hasNextLine()) { // Read line by line
             String data = reader.nextLine();
             System.out.println(data);
         }
         reader.close();
     } catch (FileNotFoundException e) {
         System.out.println("File not found.");
         e.printStackTrace();
     }
 }
}
