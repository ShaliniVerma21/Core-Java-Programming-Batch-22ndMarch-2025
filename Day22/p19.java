package Day22;
//Program 11: Reading & Writing using BufferedReader and BufferedWriter
//Buffered classes are faster because they use an internal buffer.

import java.io.*;

public class p19{
 public static void main(String[] args) {
     try {
         // Writing with BufferedWriter
         BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"));
         writer.write("This is written using BufferedWriter.\n");
         writer.write("BufferedWriter is faster than FileWriter.");
         writer.close();

         // Reading with BufferedReader
         BufferedReader reader = new BufferedReader(new FileReader("buffered.txt"));
         String line;
         System.out.println("Reading file using BufferedReader:");
         while ((line = reader.readLine()) != null) {
             System.out.println(line);
         }
         reader.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
