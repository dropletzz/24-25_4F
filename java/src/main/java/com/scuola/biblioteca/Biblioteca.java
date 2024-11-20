package com.scuola.biblioteca;



public class Biblioteca {
    private static final int MAX_LIBRI = 4000;
    private static final int MAX_UTENTI = 700;

    private Libro[] libri;
    private Utente[] utenti;

    public Biblioteca() {
        libri = new Libro[MAX_LIBRI];
        utenti = new Utente[MAX_UTENTI];
    }
}
