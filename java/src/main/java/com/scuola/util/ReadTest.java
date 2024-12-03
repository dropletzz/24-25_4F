package com.scuola.util;

import java.util.Arrays;
import java.util.List;

public class ReadTest {

    private static final List<String> options = Arrays.asList(new String[]{
        "ESCI",
        "FAI QUESTO",
        "FAI QUELLO"
    });

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // string
        String s = Read.string("dammi una stringa: ");

        // integer
        int x = Read.integer("dammi un numero intero: ");

        // integerMin
        int y = Read.integerMin("dammi un numero intero positivo: ", 0);

        // integerBetween
        int z = Read.integerMinMax("la uno, la due o la tre? ", 1, 3);

        // yesOrNo
        String msg = "Ancora?";
        while (Read.yesOrNo(msg, "ok", "basta")) {
            msg += "?";
        }

        // select
        boolean quit = false;
        while (!quit) {
            int selectedOption = Read.select("Scegli un opzione: ", options);
            switch (selectedOption) {
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
    }
}
