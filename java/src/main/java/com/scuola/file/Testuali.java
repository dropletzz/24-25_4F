package com.scuola.file;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Testuali {

    public static void main(String[] args) {
        String percorsoFile = "percorso/del/tuo/file.txt"; // Sostituisci con il percorso effettivo del tuo file
        String contenutoFile = leggiFile(percorsoFile);

        if (contenutoFile != null) {
            System.out.println("Contenuto del file:\n" + contenutoFile);
        } else {
            System.out.println("Impossibile leggere il file.");
        }
    }

    public static String leggiFile(String percorsoFile) {
        StringBuilder contenuto = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(percorsoFile))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenuto.append(linea).append("\n"); // Aggiunge la linea e un carattere di nuova riga
            }
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
            return null;
        }
        return contenuto.toString();
    }
}