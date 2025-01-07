package com.scuola.poke.moves;

import com.scuola.poke.Pokemon;

public class Ember extends Move {

    public Ember() {
        super("Ember", Pokemon.Type.Fire);
    }

    @Override
    public void apply(Pokemon attacker, Pokemon defender) {
        defender.takeDamage(attacker.getAttack() + 2, this.getType());
    }
}
