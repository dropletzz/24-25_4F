package com.scuola.archiviodischi;
import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String titolo;
    private ArrayList<Canzone> canzoni;
    private Autore autore;

    public Disco(String titolo, ArrayList<Canzone> canzoni, Autore autore) {
        this.titolo = titolo;
        this.canzoni = canzoni;
        this.autore = autore;
    }

    public Autore getAutore() {
        return this.autore;
    }
    
    public List<Canzone> getCanzoni() {
        return this.canzoni;
    }

    public String toString() {
        String s = "Titolo: " + titolo + "\n";
        s = s + "Autore: " + autore.toString() + "\n";

        int i = 1;
        for (Canzone canzone : canzoni) {
            s = s + i + ") " + canzone.toString() + "\n";
            i++;
        }
        return s;
    }
}
