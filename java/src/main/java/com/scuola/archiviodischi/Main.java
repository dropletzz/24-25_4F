package com.scuola.archiviodischi;

import java.util.HashMap;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        ArchivioDischi ar = DatiArchivioDischi.getArchivio();

        // TODO menu

        HashMap<Autore, Integer> map = ar.conteggioAlbumAutori();
        

        for (Autore a : map.keySet()) {
            Integer numeroAlbum = map.get(a);
            System.out.println(a.toString() + " " + numeroAlbum);
        }

    
        
        for (Entry<Autore, Integer> e : map.entrySet()) {
            Autore a = e.getKey();
            Integer numeroAlbum = e.getValue();
            System.out.println(a.toString() + " " + numeroAlbum);
        }
    }
}
