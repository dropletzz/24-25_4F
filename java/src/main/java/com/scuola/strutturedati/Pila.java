package com.scuola.strutturedati;

// La Pila (o Stack) e' una coda LIFO
public interface Pila<T> { 
    void push(T v); // aggiunge un valore in testa
    T pop(); // toglie il primo valore e lo restituisce
}
