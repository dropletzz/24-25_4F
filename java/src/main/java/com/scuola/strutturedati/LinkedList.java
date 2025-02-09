package com.scuola.strutturedati;

public class LinkedList<T> implements Deque<T> {

    private class Node {
        T value = null;
        Node next = null;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head = null;
    // TODO mantenere anche un riferimento alla coda
    // private Node tail = null;

    // aggiunge un elemento in testa
    @Override
    public void push(T v) {
        this.head = new Node(v, this.head);
    }

    // rimuove l'elemento in testa e lo restituisce
    @Override
    public T pop() {
        T val = this.head.value;
        this.head = this.head.next;
        return val;
    }


    // aggiunge un elemento in coda
    @Override
    public void pushBack(T v) {
        if (this.head == null) this.head = new Node(v, null);
        else {
            Node tail = this.head;
            while (tail.next != null) tail = tail.next;
            // adesso in tail ho l'ultmo nodo della lista
            tail.next = new Node(v, null);
        }
    }

    @Override
    public T popBack() {
        if (this.head == null) return null;
        Node tail = this.head;
        Node prev = null;
        while (tail.next != null) {
            prev = tail;
            tail = tail.next;
        }
        if (prev == null) this.head = null;
        else              prev.next = null;

        return tail.value;
    }
}
