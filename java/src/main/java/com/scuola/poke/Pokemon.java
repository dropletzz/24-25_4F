package com.scuola.poke;

import com.scuola.poke.moves.Move;

public class Pokemon {

    public enum Type {
        Normal,
        Fire,
        Water,
        Grass
    }

    private String name;
    private int health;
    private int maxHealth;
    private int attack;
    private int defense;
    private int speed;
    private Type type;
    
    Move[] moves = new Move[4];

    public Pokemon(String name, int maxHealth, int attack, int defense, int speed, Type type) {
        this.name = name;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.type = type;
    }

    // come quello sopra ma assegno anche le mosse
    // e' privato perche' viene usato solo dal metodo this.newCopy()
    private Pokemon(String name, int maxHealth, int attack, int defense, int speed, Type type, Move moves[]) {
        this.name = name;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.type = type;
        this.moves = moves;
    }

    public String getName() {
        return this.name;
    }
    public int getAttack() {
        return this.attack;
    }
    public int getDefense() {
        return this.defense;
    }
    public int getSpeed() {
        return this.speed;
    }
    public Type getType() {
        return this.type;
    }
    public int getHealth() {
        return this.health;
    }
    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void learnMove(Move m, int slot) {
        moves[slot] = m;
    }

    // Questo e' solo un esempio, potete cambiare
    // l'implementazione di questo metodo come vi pare
    // ad esempio tenendo conto delle debolezze che aumentano
    // il danno (fuoco fa piu' danni ai pokemon erba, ecc...)
    public void takeDamage(int damage, Type type) {
        if (damage < this.defense) damage = damage - 2;
        this.health = this.health - damage;
    }

    public Pokemon newCopy() {
        return new Pokemon(name, maxHealth, attack, defense, speed, type, moves);
    }
}
