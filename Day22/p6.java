package Day22;
import java.io.*;

/*
 * 7. Serialization – Saving Employee Objects
 * -----------------------------------------------------
 * Description: Serializes an Employee object to a file.
 * Purpose: Demonstrates storing objects persistently using Serializable interface.
 * Real Example: Saving employee details to a database file or backup.
 */
class Employee7 implements Serializable {
    String name;
    int age;

    Employee7(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class p6 {
    public static void main(String[] args) {
        Employee7 emp = new Employee7("Shalini", 28);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Employee serialized successfully.");
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }
    }
}
