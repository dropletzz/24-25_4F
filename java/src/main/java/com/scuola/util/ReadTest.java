package com.scuola.util;

import java.util.Arrays;
import java.util.List;

public class ReadTest {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // string
        String s = Read.string("dammi una stringa: ");

        // integer
        int x = Read.integer("dammi un numero intero: ");

        // integerMin
        int y = Read.integerMin("dammi un numero intero positivo: ", 0);

        // integerMinMax
        int z = Read.integerMinMax("la uno, la due o la tre? ", 1, 3);

        // yesOrNo
        String msg = "ancora?";
        while (Read.yesOrNo(msg, "ok", "basta")) msg += "?";

        // select
        List<String> options = Arrays.asList(new String[]{
            "ESCI",
            "FAI QUESTO",
            "FAI QUELLO"
        });

        boolean quit = false;
        while (!quit) {
            int menuOption = Read.select("scegli un'opzione: ", options);
            switch (menuOption) {
                case 0: // ESCI
                    System.out.println("ciao");
                    quit = true;
                    break;
                case 1: // FAI QUESTO
                    System.out.println("questo");
                    break;
                case 2: // FAI QUELLO
                    System.out.println("quello");
                    break;
            }
        }
        
        float num = Read.numberMin("Inserisci un numero intero non minore di 1.5 : \n" , (float) 1.5);
        
    }
}

