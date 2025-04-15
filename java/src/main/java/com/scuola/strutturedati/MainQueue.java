/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scuola.strutturedati;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DOCENTE
 */
public class MainQueue {
    
    public static void main(String[] args) {
        Queue<String> coda = new LinkedList<>();
        coda.add("Uno");
        coda.add("Due");
        System.out.println(coda.poll());
        coda.add("Tre");
        coda.add("Quattro");
        System.out.println(coda.peek());
        while (!coda.isEmpty()) System.out.println(coda.poll());
    }
}
