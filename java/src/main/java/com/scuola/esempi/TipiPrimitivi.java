package com.scuola.esempi;

public class TipiPrimitivi {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // NUMERI INTERI 
        int x = 23;
        int xNeg = -x; // possono essere anche negativi

        // operazioni fra interi restituiscono un intero
        // il risultato viene arrotondato per difetto
        int y = x / 3; // sarebbe 7.666 ma risulta 7


        // NUMERI CON LA VIRGOLA
        double z = 1.337;
        double a = x / 3; // => 7
        // il risultato e' comunque arrotondato a 7, perche'??
        // sia x che 3 sono interi, quindi prima viene fatta la divisione
        // tra interi, poi il risultato viene convertito in un double

        double b = x / 3.0; // 7.666

        // BOOLEANI (vero/falso)
        boolean maggiorenne = true;
        boolean minorenne = !maggiorenne; // => false

        // CHAR
        char alfa = 'A'; // un singolo carattere
        char alfa2 = 65; // in ASCII 65 rappresenta il carattere 'A'
        assert alfa == alfa2; // => vero
    }
}
