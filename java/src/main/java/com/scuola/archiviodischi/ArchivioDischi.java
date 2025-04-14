package com.scuola.archiviodischi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArchivioDischi {
    private ArrayList<Disco> dischi;
    private Set<Autore> autori;

    public ArchivioDischi() {
        this.dischi = new ArrayList<Disco>();
        this.autori = new HashSet<Autore>();
    }

    public void aggiungi(Disco d) {
        this.dischi.add(d);
        this.autori.add(d.getAutore());
    }

    public int lunghezza() {
        return this.dischi.size();
    }

    public void stampaAutori() {
        for (Autore a : this.autori) {
            System.out.println(a.getNome());
        }
    }

    public String toString() {
        String s = "";

        for (Disco d : this.dischi) {
            s = s + d.toString() + "\n";
        }

        return s;
    }
}
