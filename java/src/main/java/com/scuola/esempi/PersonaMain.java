package com.scuola.esempi;

public class PersonaMain {

    @SuppressWarnings("unused")

    public static void main(String[] args) {
        Persona p1 = new Persona("Mario Rossi", 36);
        presenta(p1);

        Persona p2 = new Persona("Pierina Esposito", 12);
        presenta(p2);
        compraDocumentoFalso(p2);
        presenta(p2);
    }

    public static void presenta(Persona p) {
        System.out.println(
            "Ciao, mi chiamo " + p.getNome() + " e sono " + 
            (p.maggiorenne() ? "maggiorenne" : "minorenne")
        );
    }
    
    public static void compraDocumentoFalso(Persona p) {
        if (!p.maggiorenne()) {
            p.setEta(18);
        }
    }
}

