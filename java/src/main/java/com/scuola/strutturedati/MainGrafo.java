package com.scuola.strutturedati;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainGrafo {
    public static void main(String[] args) {
        Grafo<String> t = costruisciAlbero();

        System.out.println("BREATH FIRST: \n");
        visitaBreathFirst(t);

        System.out.println("\n\n--------------\n\n");

        System.out.println("DEPTH FIRST: \n");
        visitaDepthFirst(t);
    }

    private static void visitaBreathFirst(Grafo<String> t) {
        Queue<Grafo<String>.Vertice> daVisitare = new LinkedList<>();
        daVisitare.add(t.getRadice());

        while (!daVisitare.isEmpty()) {
            Grafo<String>.Vertice v = daVisitare.remove();
            System.out.println(v.getValore());
            for (Grafo<String>.Vertice figlio : v.getCollegati()) {
                daVisitare.add(figlio);
            }
        }
    }

    private static void visitaDepthFirst(Grafo<String> t) {
        Stack<Grafo<String>.Vertice> daVisitare = new Stack<>();
        daVisitare.push(t.getRadice());

        while (!daVisitare.isEmpty()) {
            Grafo<String>.Vertice v = daVisitare.pop();
            System.out.println(v.getValore());
            for (Grafo<String>.Vertice figlio : v.getCollegati()) {
                daVisitare.push(figlio);
            }
        }
    }

    private static Grafo<String> costruisciAlbero() {
        Grafo<String> g = new Grafo<>();

        Grafo<String>.Vertice radice = g.creaVertice("Terra")
        .collega(g.creaVertice("Europa")
            .collega(g.creaVertice("Italia")
                    .collega(g.creaVertice("Lazio"))
                    .collega(g.creaVertice("Marche"))
                    .collega(g.creaVertice("Lombardia")
                        .collega(g.creaVertice("Milano"))
                        .collega(g.creaVertice("Brescia"))
                        .collega(g.creaVertice("Bergamo"))
                    )
                    .collega(g.creaVertice("Campania"))
            )
            .collega(g.creaVertice("Francia"))
            .collega(g.creaVertice("Germania"))
        )
        .collega(g.creaVertice("Asia")
            .collega(g.creaVertice("Cina"))
            .collega(g.creaVertice("Russia"))
            .collega(g.creaVertice("India"))
        )
        .collega(g.creaVertice("Africa"))
        .collega(g.creaVertice("Oceania"))
        .collega(g.creaVertice("America")
            .collega(g.creaVertice("Messico"))
            .collega(g.creaVertice("Stati Uniti"))
            .collega(g.creaVertice("Brasile"))
            .collega(g.creaVertice("Peru'"))
        );

        g.setRadice(radice);

        return g;
    }
}
