package Day22;

import java.io.*;

/*
 * 8. Deserialization – Reading Employee Objects
 * -----------------------------------------------------
 * Description: Reads a previously serialized Employee object from file.
 * Purpose: Demonstrates retrieving objects stored in files.
 * Real Example: Loading employee data for application startup or reports.
 */
public class p7{
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee7 emp = (Employee7) ois.readObject();
            System.out.println("Deserialized Employee: " + emp);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }
    }
}

