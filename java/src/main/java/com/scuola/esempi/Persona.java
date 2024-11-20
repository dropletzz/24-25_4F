package com.scuola.esempi;

public class Persona {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return this.nome;
    }

    public int getEta() {
        return this.eta;
    }
    
    public void setEta(int nuovaEta) {
        this.eta = nuovaEta;
    }

    public boolean maggiorenne() {
        return this.eta >= 18;
    }
}



