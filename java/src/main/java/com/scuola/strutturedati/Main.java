package com.scuola.strutturedati;

public class Main {

    public static void main(String[] args) {
        Coda<Integer> l = new ListaConcatenata<>();
        l.pushBack(37);
        l.pushBack(21);
        l.pushBack(88);
        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());

        /*
         * 
        Pila p = new ListaConcatenata();
        p.push(37);
        p.push(21);
        p.push(88);
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
         */
    }
}
