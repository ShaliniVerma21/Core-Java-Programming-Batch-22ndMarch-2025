package Day22;
//Program 12: Writing data using PrintWriter (useful for formatted text)

import java.io.*;

public class p2{
 public static void main(String[] args) {
     try {
         PrintWriter writer = new PrintWriter("printwriter.txt");
         writer.println("Name: Shalini");
         writer.println("Age: 28");
         writer.printf("Marks: %.2f", 95.75); // formatted output
         writer.close();
         System.out.println("Data written using PrintWriter.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
