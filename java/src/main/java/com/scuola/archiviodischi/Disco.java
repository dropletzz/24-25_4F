package com.scuola.archiviodischi;
import java.util.ArrayList;

public class Disco {
    private String titolo;
    private ArrayList<Canzone> canzoni;
    private Autore autore;

    public Disco(String titolo, ArrayList<Canzone> canzoni, Autore autore) {
        this.titolo = titolo;
        this.canzoni = canzoni;
        this.autore = autore;
    }

    public String toString() {
        String s = "Titolo: " + titolo + "\n";
        s = s + "Autore: " + autore.toString() + "\n";

        for (Canzone canzone : canzoni) {
            // aggiungi numeri delle canzoni
            s = s + canzone.toString() + "\n";
        }
        return s;
    }
}
