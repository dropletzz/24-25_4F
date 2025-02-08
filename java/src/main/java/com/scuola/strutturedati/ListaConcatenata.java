package com.scuola.strutturedati;

public class ListaConcatenata<T> implements Coda<T>, Pila<T> {

    private class Nodo {
        T valore;
        Nodo prossimo;

        public Nodo(T v) {
            this.valore = v;
        }
    }

    private Nodo testa = null;

    // aggiunge un elemento in testa
    @Override
    public void push(T v) {
        if (this.testa == null) {
            this.testa = new Nodo(v);
        } else {
            Nodo t = this.testa;
            this.testa = new Nodo(v);
            this.testa.prossimo = t;
        }
    }

    // aggiunge un elemento in coda
    @Override
    public void pushBack(T v) {
        if (this.testa == null) this.testa = new Nodo(v);
        else {
            Nodo n = this.testa;
            while (n.prossimo != null) n = n.prossimo;
            // adesso in n ho l'ultmo nodo della lista
            n.prossimo = new Nodo(v);
        }
    }

    // rimuove l'elemento in testa e lo restituisce
    @Override
    public T pop() {
        T val = this.testa.valore;
        this.testa = this.testa.prossimo;
        return val;
    }
}
