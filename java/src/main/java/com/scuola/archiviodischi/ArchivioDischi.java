package com.scuola.archiviodischi;

import java.util.ArrayList;

public class ArchivioDischi {
    private ArrayList<Disco> dischi;

    public ArchivioDischi() {
        this.dischi = new ArrayList<Disco>();
    }

    public void aggiungi(Disco d) {
        this.dischi.add(d);
    }

    public int lunghezza() {
        return this.dischi.size();
    }

    public String toString() {
        String s = "";

        for (Disco d : this.dischi) {
            s = s + d.toString() + "\n";
        }

        return s;
    }
}
