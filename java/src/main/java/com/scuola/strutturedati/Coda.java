package com.scuola.strutturedati;

// La Coda (Queue) e' una coda FIFO (first in first out)
public interface Coda<T> { 
    void enqueue(T v); // aggiunge un elemento in fondo alla coda
    T dequeue(); // toglie i primo elemento e lo restituisce
}

