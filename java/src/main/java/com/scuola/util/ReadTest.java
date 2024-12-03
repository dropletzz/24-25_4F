package com.scuola.util;

import java.util.ArrayList;
import java.util.Arrays;

public class ReadTest {

    public static void main(String[] args) {

        // array di opzioni
        String[] optionsArray = { "ESCI", "FAI QUESTO", "FAI QUELLO" };

        // converto array in un ArrayList
        ArrayList<String> options = new ArrayList<>(
            Arrays.asList(optionsArray)
        );

        int selectedOption = Read.select("Scegli un opzione: ", options);

        switch (selectedOption) {
            case 0: // ESCI
            break;
            case 1: // FAI QUESTO
            break;
            case 2: // FAI QUELLo
            break;
        }
    }
}
