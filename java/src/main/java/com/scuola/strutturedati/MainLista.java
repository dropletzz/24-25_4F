package com.scuola.strutturedati;

public class MainLista {

    public static void main(String[] args) {
        ListaConcatenata<String> saluti = new ListaConcatenata<>();
        saluti.add(0, "Ciao");
        saluti.add(1, "Hey");
        saluti.add(2, "Yo");

        for (int i=0; i<saluti.size(); i++)
            System.out.println(saluti.get(i));

        
        ListaConcatenata<Integer> l = new ListaConcatenata<>();
        l.pushBack(7); // [ 7 ]
        l.pushBack(3); // [ 7, 3 ]
        l.pushBack(1); // [ 7, 3, 1 ]
        l.push(19);    // [ 19, 7, 3, 1 ]

        System.out.println(l.pop());     // 19
        System.out.println(l.popBack()); // 1
        System.out.println(l.popBack()); // 3
        System.out.println(l.pop());     // 7
    }
}
