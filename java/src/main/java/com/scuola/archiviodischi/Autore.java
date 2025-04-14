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

    // i metodi "equals" e "hashCode" vengono usati da HashSet (si veda ArchivioDischi)
    // per decidere se due elementi sono da considerarsi uguali oppure no
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Autore a = (Autore) o;
        // si usa toLowerCase per fare un confronto case-insensitive
        // ad esempio: "Tony Boy" e "tony boy" verranno considerati uguali
        return Objects.equals(this.nome.toLowerCase(), a.nome.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome.toLowerCase());
    }
}
