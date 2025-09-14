package Day22;
//Program 9: Counting words in a file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p17{
 public static void main(String[] args) {
     try {
         File file = new File("demo2.txt");
         Scanner reader = new Scanner(file);

         int wordCount = 0;
         while (reader.hasNext()) { // Read word by word
             reader.next();
             wordCount++;
         }
         reader.close();
         System.out.println("Total words in file: " + wordCount);
     } catch (FileNotFoundException e) {
         System.out.println("File not found.");
         e.printStackTrace();
     }
 }
}
