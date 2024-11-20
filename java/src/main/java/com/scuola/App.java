package com.scuola;

import com.scuola.esercizi.Stringhe;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        String s1 = Stringhe.accorcia("Ciao tt bn?", 20); // =>  "Ciao tt bn?"
        String s2 = Stringhe.accorcia("Ciao tt bn?", 6); // => "Cia..."
        System.out.println(s1);
        System.out.println(s2);

        Stringhe.incornicia("Ciao tt bn?");
        /*  ###############
         *  # Ciao tt bn? #
         *  ###############
         */ 

         Stringhe.incornicia("hey");
        /*  #######
         *  # hey #
         *  #######
         */ 
    }
}