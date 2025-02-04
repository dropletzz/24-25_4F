package com.scuola.salvataggiofile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Make sure the class implements Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for version control
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ProvaSalvataggio {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        String filename = "person.ser";

        // Serialize Object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(person);
            System.out.println("Object saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize Object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Person loadedPerson = (Person) in.readObject();
            System.out.println("Loaded Object: " + loadedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
