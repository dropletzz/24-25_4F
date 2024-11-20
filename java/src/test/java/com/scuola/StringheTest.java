package com.scuola;

import com.scuola.esercizi.risolti.Stringhe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class StringheTest {

    @Test
    void enfatizzaAggiungeIlPuntoEsclamativo() {
        assertEquals(Stringhe.enfatizza("yo"), "yo!");
    }

    @Test
    void enfatizzaAggiungeEnnePuntiEsclamativi() {
        assertEquals(Stringhe.enfatizza("yo", 6), "yo!!!!!!");
    }

    @Test
    void incorniciaAggiungeLaCornice() {
        String s = "#########\n"
                  +"# ciauz #\n"
                  +"#########";
        assertEquals(Stringhe.incornicia("ciauz"), s);
    }

    @Test
    void invertiInverteLaStringa() {
        assertEquals(Stringhe.inverti("ciauz"), "zuaic");
    }

    @Test
    void palindromaRestituisceVero() {
        assertEquals(Stringhe.palindroma("ciaic"), true);
    }

    @Test
    void palindromaRestituisceFalso() {
        assertEquals(Stringhe.palindroma("ciauz"), false);
    }

    @Test
    void accorciaSenzaEllissi() {
        assertEquals(Stringhe.accorcia("ehy come va", 5), "ehy c");
    }

    @Test
    void accorciaConEllissi() {
        assertEquals(Stringhe.accorcia("ehy come va", 5, ".."), "ehy..");
    }

    @Test
    void trovaSemplice() {
        assertEquals(Stringhe.trova("ehy #come# va"), "come");
    }

    @Test
    void trovaConInizioFine() {
        assertEquals(Stringhe.trova("ehy <x>come</x> va", "<x>", "</x>"), "come");
    }
}
