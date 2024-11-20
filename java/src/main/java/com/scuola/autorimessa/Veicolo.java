package com.scuola.autorimessa;

public class Veicolo {
    // static = relativo alla classe (e non alle istanze)
    private static int codiceProgressivo = 0;

    private String targa;
    private String marca;
    private String modello;
    private int codice;
    private int nPosti;

    public Veicolo(String targa, String marca, String modello, int nPosti) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.nPosti = nPosti;
        this.codice = codiceProgressivo;
        codiceProgressivo++;
    }
}
