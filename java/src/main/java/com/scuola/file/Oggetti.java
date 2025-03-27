package com.scuola.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.scuola.util.Read;

// Deve implementare Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 2L; // Recommended for version control
    String name;
    int age;
    int x = 32;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', x='"+x+"' age=" + age + "}";
    }
}

public class Oggetti {
    public static void main(String[] args) {
        String filename = "persone.ser";
        List<Person> lista;
        // Deserialize Object
        try (ObjectInputStream in = new ObjectInputStream(
            new FileInputStream(filename))
        ) {
            lista = (List<Person>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            lista = new ArrayList<>();
        }

        for (Person p : lista) {
            System.out.println(p);
        }

        boolean esci = false;
        while (!esci) {
            int scelta = Read.integerMinMax("0 -> salva ed esci\n1 -> inserisci persona", 0, 1);
            if (scelta == 1) {
                lista.add(new Person(
                    Read.string("Inserisci nome"), 
                    Read.integerMin("Inserisci eta", 0)
                ));
            }
            else {
                // Serialize Object
                try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(filename))
                ) {
                    out.writeObject(lista);
                    System.out.println("Dati salvati correttamente, arrivederci.");
                    esci = true;
                } catch (IOException e) {
                    e.printStackTrace();
                    esci = true;
                }
            }
        }

    }
}
