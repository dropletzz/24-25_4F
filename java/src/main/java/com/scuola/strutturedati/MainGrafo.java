package com.scuola.strutturedati;

public class MainGrafo {
    public static void main(String[] args) {
        Grafo<String> t = costruisciAlbero();
        // 1) Stampa tutti i vertici di t con Depth-first
        // 2) Stampa tutti i vertici di t con Breath-first
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
