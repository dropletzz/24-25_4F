package com.scuola.strutturedati;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

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
