package com.scuola.biblioteca;

public class Libro {
    private String titolo;
    private String autore;
    private int numPagine;

    public Libro(String t, String a, int n) {
        titolo = t;
        autore = a;
        numPagine = n;
    }

    public String toString() {
        return titolo;
    }
}
