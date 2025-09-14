package Day22;

//Program 7: Displaying list of files in a directory

import java.io.File;

public class p15 {
 public static void main(String[] args) {
     File folder = new File("."); // Current directory
     String[] fileList = folder.list();
     System.out.println("Files in current directory:");
     for (String name : fileList) {
         System.out.println(name);
     }
 }
}
