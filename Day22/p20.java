package Day22;
//Program 13: Copying binary data using FileInputStream and FileOutputStream
//Useful for handling images, audio, and other binary files.

import java.io.*;

public class p20{
 public static void main(String[] args) {
     try {
         FileInputStream fis = new FileInputStream("demo2.txt");
         FileOutputStream fos = new FileOutputStream("binary_copy.txt");

         int byteData;
         while ((byteData = fis.read()) != -1) {
             fos.write(byteData);
         }

         fis.close();
         fos.close();
         System.out.println("File copied using binary streams.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
