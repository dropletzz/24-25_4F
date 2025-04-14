package com.scuola.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import com.scuola.util.Read;;


public class Biblioteca {

    private ArrayList<Libro> libri;
    private ArrayList<Utente> utenti;

    public Biblioteca() {
        libri = new ArrayList<>();
        utenti = new ArrayList<>();
    }

    public void inserisciLibro() throws IOException {
        String titolo = Read.string("Inserisci titolo: ");
        String autore = Read.string("Inserisci autore: ");
        int nPagine = Read.integer("Inserisci numero pagine: ");

        this.libri.add(new Libro(titolo, autore, nPagine));
    }

    public void eliminaLibro(int i) {
        this.libri.remove(i);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.libri.size(); i++) {
            Libro libro = this.libri.get(i);
            s += String.format("(%d) %s\n", i, libro);
            // s += this.libri.get(i).toString() + "\n";
        }
        return s;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Biblioteca b = new Biblioteca();
        boolean fine = false;

        while (!fine) {
            System.out.println("0 => ESCI\n"
                    +"1 => VISUALIZZA LIBRERIA\n"
                    +"2 => INSERISCI LIBRO\n"
                    +"3 => RIMUOVI LIBRO"
            );
            int scelta = Read.integer("");
            switch (scelta) {
                case 0:
                    fine = true;
                    break;                
                case 1:
                    System.out.println(b);
                    break;  
                case 2:
                    b.inserisciLibro();
                    break;
                case 3:
                    System.out.println(b);
                    int i = Read.integer("Indice del libro da rimuovere: ");
                    b.eliminaLibro(i);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
