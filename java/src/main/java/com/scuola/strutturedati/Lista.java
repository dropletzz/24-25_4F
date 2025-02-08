package com.scuola.strutturedati;

// La Pila (o Stack) e' una coda LIFO
public interface Lista<T> { 
    // aggiunge l'elemento v alla posizione i
    void add(int i, T v);

    // elimina elemento alla posizione i e lo restituisce
    T rem(int i);

    // restituisce l' elemento alla posizione i
    T get(int i);

    // restituisce la lunghezza della lista
    int size();
}
