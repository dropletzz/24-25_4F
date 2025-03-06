package com.scuola.strutturedati;

// La CodaDoppia (Dequeue) permette di aggiungere/rimuovere
// elementi sia in testa che in coda.
public interface CodaDoppia<T> { 
    void pushFront(T v); // aggiunge un elemento in testa
    T popFront(); // toglie l'elemento in testa e lo restituisce
    void pushBack(T v); // aggiunge un elemento in coda
    T popBack(); // toglie l'elemento in coda e lo restituisce
}
