package com.scuola.autorimessa;

import java.util.ArrayList;

public class Autonoleggio {

    private ArrayList<Veicolo> veicoli;

    public Autonoleggio() {
        veicoli = new ArrayList<>();
    }

    public void aggiungi(Veicolo v) {
        this.veicoli.add(v);
    }

    public void rimuovi(String targa) {
        int i;
        for (i = 0; i < this.veicoli.size(); i++) {
            Veicolo v = this.veicoli.get(i);
            if (targa.equals(v.getTarga())) {
                break;
            }
        }

        if (i < this.veicoli.size()) {
            this.veicoli.remove(i);
        }
    }

    public ArrayList<Veicolo> cercaConPosti(int nPosti) {
        ArrayList<Veicolo> risultati = new ArrayList<>();
        for (Veicolo v : this.veicoli) {
            if (v.getPosti() == nPosti) {
                risultati.add(v);
            }
        }
        return risultati;
    }

    public String toString() {
        String s = "";
        for (Veicolo v : this.veicoli) {
            // s = s + v.toString();
            s += v.toString() + "\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Autonoleggio a = new Autonoleggio();
        a.aggiungi(new Veicolo("FW343WE", "Audi", "A4", 5));
        a.aggiungi(new Veicolo("ASASS", "Audi", "A4", 5));
        a.aggiungi(new Veicolo("KSKSKS", "Audi", "A4", 5));
        a.aggiungi(new Veicolo("AABBCC", "Lamborghini", "Aventador", 4));

        System.out.println(a.toString());
        a.rimuovi("FW343WE");
        System.out.println(a.toString());

        a.rimuovi("xxxyyy");

        System.out.println("Veicoli con 5 posti: " + a.cercaConPosti(5));
        System.out.println("Veicoli con 4 posti: " + a.cercaConPosti(4));
        System.out.println("Veicoli con 3 posti: " + a.cercaConPosti(3));
    }
}
