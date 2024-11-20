package com.scuola.archiviodischi;

 public class Autore {
    private String nome;

    public Autore(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
