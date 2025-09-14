package Day22;

//Program 6: Deleting a file using delete() method

import java.io.File;

public class p14{
 public static void main(String[] args) {
     File file = new File("demo1.txt");
     if (file.delete()) {
         System.out.println("Deleted file: " + file.getName());
     } else {
         System.out.println("Failed to delete the file.");
     }
 }
}
