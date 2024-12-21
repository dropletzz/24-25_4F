package com.scuola.poke.moves;

import com.scuola.poke.Pokemon;

public class Tackle extends Move {

    public Tackle() {
        super("Tackle", Pokemon.Type.Normal);
    }

    @Override
    public void apply(Pokemon attacker, Pokemon defender) {
        defender.takeDamage(attacker.getAttack(), super.getType());
    }
}
