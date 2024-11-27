package com.scuola.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/*
 * Read e' una classe di utilita' che semplifica la lettura di valori da linea di comando.
 * La sua filosofia e' quella di continuare a chiedere input all'utente fino a quando
 * l'input non e' correttamente formattato (ad esempio, se mi aspetto un numero e
 * l'utente inserisce lettere, continuero' a chiedere nuovi input fino a quando viene inserito un numero)
 */

public final class Read {

    private static BufferedReader in = new BufferedReader(
        new InputStreamReader(System.in)
    );

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) restituisci la stringa appena letta
     */
    public static String string(String message) {
        // TODO
        return "";
    }

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) prova a convertire la stringa in un intero (parsing)
     * 3) se la conversione avviene con successo, restituisci il numero intero
     * 4) in caso contrario, stampa un messaggio di errore e ritorna al punto 0
     */
    public static int integer(String message) {
        // TODO
        return 0;
    }

    /* Leggi in input un numero intero che deve essere >= min */
    public static int integerMin(String message, int min) {
        // TODO
        return 0;
    }

    /* Leggi in input un numero intero che deve essere <= max */
    public static int integerMax(String message, int max) {
        // TODO
        return 0;
    }

    /* Leggi in input un numero intero che deve essere compreso tra max e min (estremi inclusi) */
    public static int integerMinMax(String message, int min, int max) {
        // TODO
        return 0;
    }

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) se la stringa letta e' uguale al contenuto della variabile yes, restituisci true
     * 3) se la stringa letta e' uguale al contenuto della variabile no, restituisci false
     * 4) in caso contrario, stampa un messaggio di errore e torna al punto 0
     */
    public static boolean yesOrNo(String message, String yes, String no) {
        // TODO
        return false;
    }

    /*
     * Permette all'utente di selezionare una delle opzioni (passate come ArrayList)
     * e restituisce l'indice corrispondente all'opzione selezionata
     */
    public static int select(String message, ArrayList<String> options) {
        // TODO
        return -1;
    }

    /*
     * QUA FINISCONO GLI ESERCIZI INTERESSANTI:
     * il resto dei metodi sono utili ma la loro implementazione
     * e' molto simile ad altri gia' implementati e quindi non richiesta
    */


    /* Leggi in input una stringa di lunghezza >= minLength */
    public static String stringMin(String message, int minLength) {
        // TODO
        return "";
    }

    /* Leggi in input una stringa di lunghezza <= maxLength */
    public static String stringMax(String message, int maxLength) {
        // TODO
        return "";
    }

    /* Leggi in input una stringa di lunghezza compresa tra minLenght e  maxLength (estremi inclusi) */
    public static String stringMinMax(String message, int minLength, int maxLength) {
        // TODO
        return "";
    }

    /* Leggi in input un numero con la virgola */
    public static float number(String message) {
        // TODO
        return 0;
    }

    /* Leggi in input un numero con la virgola che deve essere >= min */
    public static float numberMin(String message, float min) {
        // TODO
        return 0;
    }

    /* Leggi in input un numero con la virgola che deve essere <= max */
    public static float numberMax(String message, float max) {
        // TODO
        return 0;
    }

    /* Leggi in input un numero con la virgola che deve essere compreso tra max e min (estremi inclusi) */
    public static float numberMinMax(String message, float min, float max) {
        // TODO
        return 0;
    }
}
