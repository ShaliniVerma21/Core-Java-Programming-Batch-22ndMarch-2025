package Day22;
//Program 10: Object Serialization & Deserialization (Storing object in file)

import java.io.*;

//Serializable class
class Student implements Serializable {
 String name;
 int age;

 Student(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

public class p18{
 public static void main(String[] args) {
     // Serialization
     try {
         Student s1 = new Student("Shalini", 25);
         FileOutputStream fos = new FileOutputStream("student.ser");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(s1);
         oos.close();
         fos.close();
         System.out.println("Object serialized successfully.");
     } catch (IOException e) {
         e.printStackTrace();
     }

     // Deserialization
     try {
         FileInputStream fis = new FileInputStream("student.ser");
         ObjectInputStream ois = new ObjectInputStream(fis);
         Student s2 = (Student) ois.readObject();
         ois.close();
         fis.close();

         System.out.println("Object deserialized:");
         System.out.println("Name: " + s2.name + ", Age: " + s2.age);
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
