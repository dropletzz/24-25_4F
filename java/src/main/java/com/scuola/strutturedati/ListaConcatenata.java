
package com.scuola.strutturedati;

public class ListaConcatenata<T> {

	private class Node {
    	T value = null;
    	Node next = null;

    	public Node(T value, Node next) {
        	this.value = value;
        	this.next = next;
    	}
	}

	private Node head = null;
	// IDEA: provare a tenere anche un riferimento all'ultimo elemento?
	// private Node tail = null;
    

	public void add(int i, T v) {
    	if (this.head == null && i > 0) throw new IndexOutOfBoundsException();  
    	if (i < 0) throw new IndexOutOfBoundsException();
   	 
    	if (i == 0) { // aggiunta in testa
        	this.push(v);
        	return;
    	}
   	 
    	Node n = this.head;
    	for (int x = 0; x < i-1; x++) {
        	n = n.next;
        	if (n == null) throw new IndexOutOfBoundsException();
    	}
    	// adesso n contine il nodo alla posizione i-1
    	Node nuovo = new Node(v, n.next);
    	n.next = nuovo;
	}

	public T del(int i) {
    	if (this.head == null) throw new IndexOutOfBoundsException();  
    	if (i < 0) throw new IndexOutOfBoundsException();
   	 
    	// rimuovo il primo elemento
    	if (i == 0) return this.pop();
 
    	Node n = this.head;
    	for (int x = 0; x < i-1; x++) {
        	n = n.next;
        	if (n == null) throw new IndexOutOfBoundsException();
    	}
    	// adesso n contine il nodo alla posizione i-1
    	Node daCancellare = n.next;
    	if (daCancellare == null) throw new IndexOutOfBoundsException();
    	n.next = daCancellare.next;
   	 
    	return daCancellare.value;
	}

	public T get(int i) {
    	// TODO
    	return null;
	}

	public int size() {
        // TODO
    	return 0;
	}

	public void stampa() {
    	Node n = this.head;
    	while (n != null) {
        	System.out.println(n.value);
        	n = n.next;
    	}
	}

	/////////////////////////////////////
	// FINE DEI METODI DA IMPLEMENTARE //
	/////////////////////////////////////


	// aggiunge un elemento in testa
	public void push(T v) {
    	this.head = new Node(v, this.head);
	}

	// rimuove l'elemento in testa e lo restituisce
	public T pop() {
    	if (this.head == null) return null; // TODO gestione errori

    	T val = this.head.value;
    	this.head = this.head.next;
    	return val;
	}


	// aggiunge un elemento in coda
	public void pushBack(T v) {
    	if (this.head == null) this.head = new Node(v, null);
    	else {
        	Node tail = this.head;
        	while (tail.next != null) tail = tail.next;
        	// adesso in tail ho l'ultmo nodo della lista
        	tail.next = new Node(v, null);
    	}
	}

	public T popBack() {
    	if (this.head == null) return null; // TODO gestione errori

    	Node tail = this.head;
    	Node prev = null;
    	while (tail.next != null) {
        	prev = tail;
        	tail = tail.next;
    	}
    	if (prev == null) this.head = null;
    	else          	prev.next = null;

    	return tail.value;
	}
}


