package com.scuola.esercizi.risolti;

public class Stringhe {
    /*
     * Aggiungi un punto esclamativo in fondo ad s
     * 
     * Ad esempio:
     * Stringhe.enfatizza("che bello");
     * ritorna: "che bello!"
     */
    public static String enfatizza(String s) {
        return s + "!";
    }

    /*
     * Aggiungi n punti esclamativi in fondo ad s
     * 
     * Ad esempio:
     * Stringhe.enfatizza("che bello", 4);
     * ritorna: "che bello!!!!"
     */
    public static String enfatizza(String s, int n) {
        String res = s;
        for (int i = 0; i < n; i++) {
            res = res + "!";
        }
        return res;
    }

    /*
     * Ritorna la stringa s incorniciata dal carattere #
     * 
     * Ad esempio:
     * Stringhe.incornicia("Ciao tt bn?");
     * ritorna:
     * ###############
     * # Ciao tt bn? #
     * ###############
     */
    public static String incornicia(String s) { //
        String res = "";
        for (int i = 0; i < s.length() + 4; i++) {
            res = res + "#";
        }
        res = res + "\n# " + s + " #\n";
        for (int i = 0; i < s.length() + 4; i++) {
            res = res + "#";
        }
        return res;
    }

    /*
     * Inverti l'ordine dei caratteri di s
     * 
     * Ad esempio:
     * Stringhe.inverti("miao bau");
     * ritorna: "uab oaim"
     */
    public static String inverti(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res = res + s.charAt(i);
        }
        return res;
    }

    /*
     * Ritorna true se la stringa e' palindroma, altrimenti ritorna false.
     * Una stringa e' palindroma se e' identica quando viene letta al contrario.
     * 
     * Ad esempio:
     * Stringhe.palindroma("oroNero");
     * ritorna: false
     * Stringhe.palindroma("oroNoro");
     * ritorna: true
     */
    public static boolean palindroma(String s) {
        return s.equals(Stringhe.inverti(s));
    }

    /*
     * Se s e' piu corta di maxL caratteri ritorna s,
     * altrimenti accorcia la stringa s tagliando la parte
     * finale in modo che sia lunga esattamente maxL caratteri
     * 
     * Ad esempio:
     * Stringhe.accorcia("Ciao tt bn?", 6);
     * ritorna: "Ciao t"
     * 
     * Consigli: usare il metodo substring della classe String
     */
    public static String accorcia(String s, int maxL) {
        return s.substring(0, maxL);
    }

    /*
     * Se s e' piu corta di maxL caratteri ritorna s,
     * altrimenti accorcia la stringa s tagliando la parte
     * finale ed aggiungendo in fondo la stringa ellissi.
     * La stringa accorciata deve essere lunga esattamente
     * maxL caratteri compresa l'ellissi aggiunta in fondo.
     * 
     * Ad esempio:
     * Stringhe.accorcia("Ciao tt bn?", 6, "...");
     * ritorna: "Cia..."     *
     * Stringhe.accorcia("Ciao tt bn?", 3, "-");
     * ritorna: "Ci-"
     * 
     * Consigli: usare il metodo substring della classe String
     */
    public static String accorcia(String s, int maxL, String ellissi) {
        if (s.length() > maxL) {
            String accorciata = s.substring(0, maxL - ellissi.length());
            return accorciata + ellissi;
        }
        return s;
    }


    /*
     * Trova nella stringa s la parte contenuta
     * tra due caratteri # e restituiscila.
     * 
     * Ad esempio:
     * Stringhe.trova("questo quello #e anche quell# altro");
     * ritorna: "e anche quell"
     * 
     * Consigli: usare i metodi indexOf e substring della classe String
     */
    public static String trova(String s) {
        int indiceInizio = s.indexOf("#");
        String res = s.substring(indiceInizio + 1);
        int indiceFine = res.indexOf("#");
        return res.substring(0, indiceFine);
    }

    /*
     * Trova nella stringa s la parte contenuta tra i due 
     * delimitatori inizio e fine, quindi restituiscila.
     * 
     * Ad esempio:
     * Stringhe.trova("pippo <b>pluto</b> paperino", "<b>", "</b>");
     * ritorna: "pluto"
     * 
     * Consigli: usare i metodi indexOf e substring della classe String
     */
    public static String trova(String s, String inizio, String fine) {
        int indiceInizio = s.indexOf(inizio);
        String res = s.substring(indiceInizio + inizio.length());
        int indiceFine = res.indexOf(fine);
        return res.substring(0, indiceFine);
    }
}
