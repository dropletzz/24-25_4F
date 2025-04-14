package com.scuola.archiviodischi;

import java.util.Objects;

public class Autore {
    private String nome;

    public Autore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    // i metodi "equals" e "hashCode" vengono usati da HashSet (si veda ArchivioDisci)
    // per decidere se due elementi vanno considerati uguali oppure no
    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Autore) {
            Autore a = (Autore) o;
            // si usa toLowerCase per fare un confronto case-insensitive
            // ad esempio: "Tony Boy" e "Tony boy" verranno considerati uguali
            return a.nome.toLowerCase().equals(this.nome.toLowerCase());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome.toLowerCase());
    }
}
