package com.scuola.archiviodischi;

public class Canzone {
    private String titolo;
    private String genere;

    public Canzone(String titolo, String genere) {
        this.titolo = titolo;
        this.genere = genere;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getGenere() {
        return this.genere;
    }

    @Override
    public String toString() {
        return titolo;
    }
}
