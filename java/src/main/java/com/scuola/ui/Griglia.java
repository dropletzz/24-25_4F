package com.scuola.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Griglia extends JFrame {
    public Griglia() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(640, 640));
        add(new Pannello());
        pack();
    }

    public static void main(String[] args) {
        Griglia f = new Griglia();
        f.setVisible(true);
    }
}

class Pannello extends JComponent {
    public static int DIMENSIONE = 20;

    public Pannello() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        
        int latoGriglia = Math.min(getWidth(), getHeight());
        int lato = latoGriglia / DIMENSIONE;

        for (int r = 0; r < DIMENSIONE; r++) { // righe
            for (int c = 0; c < DIMENSIONE; c++) { // colonne
                g2.drawRect(c*lato, r*lato, lato, lato);
            }
        }
    }
}