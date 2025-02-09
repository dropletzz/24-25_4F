package com.scuola.strutturedati;

// Una Lista e' una sequenza ordinata di elementi,
// ogni elemento e' indicizzato con un numero intero
public abstract class Lista<T> { 
    // aggiunge l'elemento v alla posizione i
    public abstract void add(int i, T v);

    // elimina l'elemento alla posizione i e lo restituisce
    public abstract T del(int i);

    // restituisce l'elemento alla posizione i
    public abstract T get(int i);

    // restituisce la lunghezza della lista
    public abstract int size();

    /*
    // restituisce vero se la lista e' vuota
    public boolean empty();

    // restituisce il primo elemento
    public T first();

    // restituisce l'ultimo elemento
    public T last();

    // restituisce la posizione di v nella lista
    // o un numero negativo se v non si trova nella lista
    int find(T v);
     */
}
