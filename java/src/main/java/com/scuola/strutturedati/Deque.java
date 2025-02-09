package com.scuola.strutturedati;

// La Coda (Queue) e' una coda FIFO (first in first out)
public interface Deque<T> { 
    void push(T v); // aggiunge un valore in testa
    T pop(); // toglie l'elemento in testa e lo restituisce
    void pushBack(T v); // aggiunge un valore in coda
    T popBack(); // toglie l'elemento in coda e lo restituisce
}
