package com.scuola.util;

public class ReadTest {

    public static void main(String[] args) {
        int x = Read.integerMin("dammi una numero >= 4: ", 4);
        int y = Read.integerMax("dammi una numero <= 12: ", 12);
        int z = Read.integerMinMax("dammi una numero compreso tra 5 e 10: ", 5, 10);
        
    }
}
