package com.scuola.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Biblioteca {

    private static BufferedReader in = new BufferedReader(
        new InputStreamReader(System.in)
    );

    private ArrayList<Libro> libri;
    private ArrayList<Utente> utenti;

    public Biblioteca() {
        libri = new ArrayList<>();
        utenti = new ArrayList<>();
    }

    public void inserisciLibro() throws IOException {
        System.out.print("Inserisci titolo: ");
        String titolo = in.readLine();
        System.out.print("Inserisci autore: ");
        String autore = in.readLine();
        System.out.print("Inserisci numero pagine: ");
        int nPagine = Integer.parseInt(in.readLine());

        Libro l = new Libro(titolo, autore, nPagine);
        this.libri.add(l);
    }

    public void elimina(int i) {
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
            int scelta = Integer.parseInt(in.readLine());
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
                    System.out.println("Indice del libro da rimuovere: ");
                    int i = Integer.parseInt(in.readLine());
                    b.elimina(i);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
