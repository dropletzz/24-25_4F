package com.scuola.archiviodischi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArchivioDischi {
    private List<Disco> dischi;
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
    
    public Set<String> getGeneri() {
        Set<String> generi = new HashSet<>();
        
        for (Disco d : this.dischi) {
            for (Canzone c : d.getCanzoni()){
                generi.add(c.getGenere().toLowerCase());
            }
        }
        
        return generi;
    }
    
    public HashMap<Autore, Integer> conteggioAlbumAutori() {
        HashMap<Autore, Integer> conteggi = new HashMap<>();
        for (Disco d : this.dischi) {
            Autore autore = d.getAutore();
            if (conteggi.containsKey(autore)) {
                Integer c = conteggi.get(autore);
                conteggi.put(autore, c + 1);
            }
            else {
                conteggi.put(autore, 1);
            }
        }
        return conteggi;
    }

    public String toString() {
        String s = "";

        for (Disco d : this.dischi) {
            s = s + d.toString() + "\n";
        }

        return s;
    }
}
