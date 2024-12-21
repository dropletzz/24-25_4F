package com.scuola.poke.moves;

import com.scuola.poke.Pokemon;
import com.scuola.poke.Pokemon.Type;

// CLASSE ASTRATTA => non puo' essere istanziata con new
// le mosse "concrete" sono figlie di questa classe
public abstract class Move {

    private final String name;
    private final Type type;

    public Move(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    // METODO ASTRATTO => l'implementazione di questo metodo
    // e' lasciata alle classi figlie (vedi ad esempio Ember e Tackle)
    public abstract void apply(Pokemon attacker, Pokemon defender);
}
