package com.scuola.liste;
import java.util.ArrayList;

public class ProvaListe {

    public static void main(String[] args) {
        ArrayList<String> v = new ArrayList<String>();

        // add aggiunge elementi in coda
        v.add("primo");
        v.add("secondo");
        v.add("terzo");

        // ciclo sugli elementi del vettore
        for (int i = 0; i < v.size(); i++) {
            // get estrae l'i-esimo elemento dal vettore
            String elemento = v.get(i);
            System.out.println(elemento);
        }

        // uguale al ciclo sopra ma senza la variabile i
        for (String elemento : v) {
            System.out.println(elemento);
        }

        // remove elimina l'elemento alla posizione data
        System.out.println("Prima del remove: " + v);
        v.remove(1);
        System.out.println("Dopo il remove: " + v);

        ArrayList<Integer> v2 = new ArrayList<Integer>();
        v2.add(42);
        v2.add(37);
        v2.add(-12);
        v2.add(124);

        // controllo se un vector contiene un elemento
        System.out.println("v2 = " + v2);
        System.out.println("v2 contiene il -12? " + v2.contains(-12));
        System.out.println("v2 contiene il 32? " + v2.contains(32));

        System.out.println("posizione del 42 in v2: " + v2.indexOf(42));
        System.out.println("posizione del 12 in v2: " + v2.indexOf(12));


        // sostituisce l'elemento alla posizione 3 con 89
        v2.set(3, 89);
        System.out.println("v2 dopo set(3, 89): " + v2);

        // differenza tra == ed equals:
        // == funziona solo per i tipi primitivi, non per gli oggetti
        // per confrontare oggetti tra loro devo usare equals
        // sulle mie classi il metodo equals v definito (altrimenti si comporta come ==)
               
        Foo a = new Foo("due");
        Foo b = new Foo("due");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        ArrayList<Foo> list = new ArrayList<Foo>(3);
        list.add(new Foo("uno"));
        list.add(new Foo("due"));
        list.add(new Foo("tre"));

        System.out.println(list);
        System.out.println("Contiene due? " + list.contains(new Foo("due")));

    }
}
