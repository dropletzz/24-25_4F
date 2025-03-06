package com.scuola.strutturedati;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementazione di un grafo con liste di adiacenza.
 * Ogni vertice puo' contenere dei dati di un generico tipo T.
 * Gli archi non contengono nessuna informazione aggiuntiva.
 */
public class Grafo<T> {

    public class Vertice {
        private final T valore;
        private final List<Vertice> verticiCollegati;

        private Vertice(T valore) {
            this.valore = valore;
            this.verticiCollegati = new ArrayList<>();
        }

        public Vertice collega(Vertice v) {
            this.verticiCollegati.add(v);
            return this;
        }

        public List<Vertice> getCollegati() {
            return this.verticiCollegati;
        }

        public T getValore() {
            return this.valore;
        }
    }

    private final List<Vertice> vertici;
    private Vertice radice = null; 

    public Grafo() {
        this.vertici = new ArrayList<>();
    }

    public Vertice getRadice() {
        return this.radice;
    }

    public void setRadice(Vertice v) {
        this.radice = v;
    }

    public List<Vertice> getVertici() {
        return vertici;
    }

    public Vertice creaVertice(T valore) {
        Vertice v = new Vertice(valore);
        this.vertici.add(v);
        return v;
    }
}
