package com.scuola.archiviodischi;

public class Canzone {
    private String titolo;
    private String genere;

    public Canzone(String titolo, String genere) {
        this.titolo = titolo;
        this.genere = genere;
    }

    @Override
    public String toString() {
        return titolo;
    }
}
