package com.scuola.poke;

import java.util.ArrayList;

import com.scuola.poke.moves.Ember;
import com.scuola.poke.moves.Tackle;

public class PokeFactory {
    private static final ArrayList<Pokemon> pokemonList = initializePokemonList();

    public static Pokemon get(String name) {
        for (int i = 0; i < pokemonList.size(); i++) {
            Pokemon p = pokemonList.get(i);
            if (name.equals(p.getName())) {
                return p.newCopy(); 
            }
        }
        throw new Error("ERRORE: Nessun pokemon chiamato '%s'".formatted(name));
    }

    public static ArrayList<Pokemon> initializePokemonList() {
        ArrayList<Pokemon> l = new ArrayList<>();

        Pokemon c = new Pokemon(
            "Charmander", 
            20, // maxHealth
            7, // attack
            5, // defense
            8, // speed
            Pokemon.Type.Fire
        );
        c.learnMove(new Tackle(), 0);
        c.learnMove(new Ember(), 1);
        l.add(c);

        Pokemon r = new Pokemon(
            "Rattata", 
            22, // maxHealth
            5, // attack
            6, // defense
            7, // speed
            Pokemon.Type.Normal
        );
        c.learnMove(new Tackle(), 0);
        l.add(r);

        return l;
    }

}
