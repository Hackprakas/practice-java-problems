import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

// The class implements Serializable to enable serialization
class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Optional, helps with version control of the class

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 123);

        // Serialization: Saving the object to a file
        try (FileOutputStream fos = new FileOutputStream("employee.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(emp); // Serialize the object
            System.out.println("Employee object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization: Reading the object from a file
        try (FileInputStream fis = new FileInputStream("employee.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Employee deserializedEmp =  (Employee) ois.readObject(); // Deserialize the object
            System.out.println("Deserialized Employee: " + deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
