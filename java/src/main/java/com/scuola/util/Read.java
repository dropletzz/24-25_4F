package com.scuola.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


/*
 * Read e' una classe di utilita' che semplifica la lettura di valori da linea di comando.
 * La sua filosofia e' quella di continuare a chiedere input all'utente fino a quando
 * l'input non e' correttamente formattato (ad esempio, se mi aspetto un numero e
 * l'utente inserisce lettere, continuero' a chiedere nuovi input fino a quando viene inserito un numero)
 */
public final class Read {

    private static final BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in)
    );

    private static final String STDIN_ERROR = "ERROR: could not read from stdin";
    private static final String INTPARSE_ERROR = "! Input can't be parsed to integer";
    private static final String LESSTHAN_ERROR = "! Should be less than %s";
    private static final String MORETHAN_ERROR = "! Should be more than %s";
    private static final String BETWEEN_ERROR = "! Should be between %s and %s";
    private static final String YESORNO_ERROR = "! Write '%s' or '%s'";
    private static final String SELECT_OPTION = "[%s] %s";

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) restituisci la stringa appena letta
     */
    public static String string(String message) {
        System.out.print(message);
        String input = null;
        try {
            input = in.readLine();
        } catch (IOException e) {
            System.out.println(STDIN_ERROR);
            System.exit(1);
        }
        return input;
    }

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) prova a convertire la stringa in un intero (parsing)
     * 3) se la conversione avviene con successo, restituisci il numero intero
     * 4) in caso contrario, stampa un messaggio di errore e ritorna al punto 0
     */
    public static int integer(String message) {
        int input = 0;
        boolean error;
        do {
            // leggo in input una stringa
            String s = Read.string(message);
            try {
                // provo a convertire l'input in un intero
                input = Integer.parseInt(s);
                error = false;
            } catch (NumberFormatException e) {
                System.out.println(INTPARSE_ERROR);
                error = true;
            }
        } while (error);

        return input;
    }

    /* Leggi in input un numero intero che deve essere >= min */
    public static int integerMin(String message, int min) {
        int input = 0;
        boolean error;
        do {
            // leggo in input una stringa
            String s = Read.string(message);
            try {
                // provo a convertire l'input in un intero
                input = Integer.parseInt(s);
                error = !(input >= min);
                // equivalente a questo:
                // if (input >= min) {
                //     error = false;
                // } else {
                //     error = true;
                // }
                if (error) System.out.println(MORETHAN_ERROR.formatted(min));
            } catch (NumberFormatException e) {
                System.out.println(INTPARSE_ERROR);
                error = true;
            }
        } while (error);

        return input;
    }

    /* Leggi in input un numero intero che deve essere <= max */
    public static int integerMax(String message, int max) {
        int input = 0;
        boolean error;
        do {
            String s = Read.string(message);
            try {
                input = Integer.parseInt(s);
                error = !(input <= max);
                if (error) System.out.println(LESSTHAN_ERROR.formatted(max));
            } catch (NumberFormatException e) {
                System.out.println(INTPARSE_ERROR);
                error = true;
            }
        } while (error);

        return input;
    }

    /* Leggi in input un numero intero che deve essere compreso tra max e min (estremi inclusi) */
    public static int integerMinMax(String message, int min, int max) {
        int input = 0;
        boolean error;
        do {
            String s = Read.string(message);
            try {
                input = Integer.parseInt(s);
                error = !(input >= min && input <= max);
                if (error) System.out.println(BETWEEN_ERROR.formatted(min, max));
            } catch (NumberFormatException e) {
                System.out.println(INTPARSE_ERROR);
                error = true;
            }
        } while (error);

        return input;
    }

    /*
     * 0) stampa in output il messaggio
     * 1) leggi una stringa dall'input
     * 2) se la stringa letta e' uguale al contenuto della variabile yes, restituisci true
     * 3) se la stringa letta e' uguale al contenuto della variabile no, restituisci false
     * 4) in caso contrario, stampa un messaggio di errore e torna al punto 0
     */

    public static boolean yesOrNo(String message, String yes, String no) {
        boolean input = false;
        boolean error;
        do {
            String s = Read.string(message + "(%s/%s)".formatted(yes, no));
            if (s.equals(yes)) {
                input = true;
                error = false;
            } else if (s.equals(no)) {
                input = false;
                error = false;
            } else {
                error = true;
                System.out.println(YESORNO_ERROR.formatted(yes, no));
            }
        } while (error);

        return input;
    }

    // alternativa piu' breve
    // public static boolean yesOrNo(String message, String yes, String no) {
    //     String s = null;
    //     do {
    //         if (s != null) {
    //             System.out.println(String.format(YESORNO_ERROR, yes, no));
    //         }
    //         s = Read.string(message);
    //     } while (!(s.equals(yes) || s.equals(no)));

    //     return s.equals(yes);
    // }

    /*
     * Permette all'utente di selezionare una delle opzioni (passate come ArrayList)
     * e restituisce l'indice corrispondente all'opzione selezionata
     */
    public static int select(String message, List<String> options) {
        for (int i = 0; i < options.size(); i++) {
            System.out.println(
                String.format(SELECT_OPTION, i, options.get(i))
            );
        }

        int input = Read.integerMinMax(message, 0, options.size() - 1);
        
        return input;
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
