package com.scuola.strutturedati;

// La Coda (Queue) e' una coda FIFO (first in first out)
public interface Coda<T> { 
    void push(T v); // aggiunge un valore in testa
    T popBack(); // toglie l'ultimo elemento e lo restituisce
}
