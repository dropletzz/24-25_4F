package com.scuola.forza4;
import com.scuola.util.Read;

public class Forza4 {

    private enum Cella {
        VUOTA,
        ROSSA,
        BLU
    }

    private enum Giocatore {
        ROSSO,
        BLU
    }

    private static final int RIGHE = 6;
    private static final int COLONNE = 7;
    private static final Cella[][] griglia = new Cella[RIGHE][COLONNE];

    public static void main() {
        inizializzaGriglia(); // DA IMPLEMENTARE

        Giocatore turno = Giocatore.ROSSO;
        Giocatore vincitore = controllaVittoria();

        while (vincitore == null) {
            stampaGriglia(); // DA IMPLEMENTARE

            if (turno.equals(Giocatore.ROSSO)) {
                System.out.println("Turno del rosso");
            } else {
                System.out.println("Turno del blu");
            }

            int colonna = Read.integerMinMax("In che colonna vuoi inserire il gettone? ", 1, COLONNE);
            inserisciGettone(colonna, turno); // DA IMPLEMENTARE

            // controlliamo se ha vinto qualcuno
            vincitore = controllaVittoria(); // DA IMPLEMENTARE
            
            // passa il turno all'altro giocatore
            if (turno.equals(Giocatore.ROSSO)) {
                turno = Giocatore.BLU;
            } else {
                turno = Giocatore.ROSSO;
            }
        }

        if (vincitore.equals(Giocatore.ROSSO)) {
            System.out.println("Ha vinto il rosso!");
        } else {
            System.out.println("Ha vinto il blu!");
        }
    }

    private static void inizializzaGriglia() {
        // assegna Cella.VUOTO a tutte le celle della griglia
    }

    private static void stampaGriglia() {
        // stampa la griglia
    }

    private static void inserisciGettone(int col, Giocatore g) {
        // modifica la griglia aggiungendo un gettone nella posizione appropriata
    }

    private static Giocatore controllaVittoria() {
        // Questa funzione restituisce:
        // > null se non c'e' un vincitore
        // > Giocatore.ROSSO se ha vinto il rosso
        // > Giocatore.BLU se ha vinto il blu
        return null;
    }
}
