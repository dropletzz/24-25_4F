package com.scuola.strutturedati;

// La Pila (Stack) e' una coda LIFO (last in first out)
public interface Stack<T> { 
    void push(T v); // aggiunge un valore in testa
    T pop(); // toglie il primo valore e lo restituisce
}
