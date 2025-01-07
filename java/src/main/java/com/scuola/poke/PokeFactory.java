package com.scuola.poke;

import java.util.ArrayList;

import com.scuola.poke.moves.Ember;
import com.scuola.poke.moves.Tackle;

/*
 * Lo scopo di questa classe e' contenere una lista di tutti i
 * pokemon e crearne delle nuove istanze tramite il metodo 'get'
 */

public class PokeFactory {
    private static final ArrayList<Pokemon> pokemonList = initializePokemonList();

    // Dato il nome di un Pokemon ne restituisce una copia
    public static Pokemon get(String name) {
        for (int i = 0; i < pokemonList.size(); i++) {
            Pokemon p = pokemonList.get(i);
            if (name.equals(p.getName())) {
                return p.newCopy(); 
            }
        }
        throw new Error("ERRORE: Nessun pokemon chiamato '%s'".formatted(name));
    }

    // Qui si creano tutti i Pokemon, definendo i loro parametri e le loro mosse
    public static ArrayList<Pokemon> initializePokemonList() {
        ArrayList<Pokemon> l = new ArrayList<>();

        // Crea un pokemon
        Pokemon c = new Pokemon(
            "Charmander", 
            20, // maxHealth
            7, // attack
            5, // defense
            8, // speed
            Pokemon.Type.Fire
        );
        // Assegna le mosse al pokemon
        c.learnMove(new Tackle(), 0);
        c.learnMove(new Ember(), 1);
        // Aggiungi il pokemon alla lista
        l.add(c);

        // Crea un pokemon
        Pokemon r = new Pokemon(
            "Rattata", 
            22, // maxHealth
            5, // attack
            6, // defense
            7, // speed
            Pokemon.Type.Normal
        );
        // Assegna le mosse al pokemon
        c.learnMove(new Tackle(), 0);
        // Aggiungi il pokemon alla lista
        l.add(r);

        return l;
    }
}
