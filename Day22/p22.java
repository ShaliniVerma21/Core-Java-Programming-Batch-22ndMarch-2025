package Day22;
//Program 15: Using RandomAccessFile to read/write at any position
//Useful when you want to update a file without rewriting the whole content.

import java.io.*;

public class p22{
 public static void main(String[] args) {
     try {
         RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");

         // Writing data
         raf.writeUTF("Hello Java File Handling");
         raf.seek(0); // Move pointer to beginning

         // Reading data
         String content = raf.readUTF();
         System.out.println("Read from file: " + content);

         // Writing at specific position
         raf.seek(5);
         raf.writeUTF(" inserted text");
         raf.close();

         System.out.println("RandomAccessFile operations done.");
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
