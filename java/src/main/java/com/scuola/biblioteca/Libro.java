package com.scuola.biblioteca;

public class Libro {
    private String titolo;
    private Autore autore;
    private int numPagine;

    public Libro(String t, Autore a, int n) {
        titolo = t;
        autore = a;
        numPagine = n;
    }
}
