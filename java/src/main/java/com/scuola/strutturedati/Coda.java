package com.scuola.strutturedati;

// La Coda (o Queue) e' una coda FIFO
public interface Coda<T> { 
    void pushBack(T v); // aggiunge un valore in coda
    T pop(); // toglie il primo valore e lo restituisce
}
