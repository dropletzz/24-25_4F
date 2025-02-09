package com.scuola.strutturedati;

// Una List e' una sequenza ordinata di elementi indicizzati con un numero intero
public interface List<T> extends Deque<T> { 
    // aggiunge l'elemento v alla posizione i
    void add(int i, T v);

    // elimina elemento alla posizione i e lo restituisce
    T rem(int i);

    // restituisce l' elemento alla posizione i
    T get(int i);

    // restituisce il primo elemento
    T first();

    // restituisce l'ultimo elemento
    T last();

    // restituisce la lunghezza della lista
    int size();
}
