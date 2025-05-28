package com.scuola.ui;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Orologio extends JFrame {
    public Orologio() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new DrawPane(), BorderLayout.CENTER);
        pack();
    }

    public static void main(String[] args) {
        Orologio window = new Orologio();
        window.setVisible(true);
    }
}

class DrawPane extends JComponent {
    private float vectorEndX = 0.25f;
    private float vectorEndY = 0.25f;
    private double angle = 0; // For circular motion example
    private final Timer timer;
    private final int animationDelay = 20; // Milliseconds between frames
    private final float radius = 0.5f; // For circular motion

    public DrawPane() {
        setPreferredSize(new Dimension(640, 640));

        // Create a Timer that fires an event periodically
        timer = new Timer(animationDelay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the state for the next frame of animation
                // Example: Move the end point of the vector in a circle
                angle += Math.PI / 50; // Adjust the divisor for speed
                vectorEndX = radius * (float) Math.cos(angle);
                vectorEndY = radius * (float) Math.sin(angle);


                repaint(); // Trigger a repaint of the component
            }
        });

        // Start the timer
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // use anti-aliasing for smooth lines
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // move origin to center
        g2.translate(getWidth() / 2, getHeight() / 2);

        // scale as you need. Using negative y so that y points upward
        g2.scale(getWidth() / 2, -getHeight() / 2);

        // set color and thickness
        g2.setColor(Color.red);
        g2.setStroke(new BasicStroke(0.001f));

        // draw coordinate lines
        g2.draw(new Line2D.Float(-1f, 0f, 1.0f, 0f));
        g2.draw(new Line2D.Float(0, -1.0f, 0.0f, 1.0f));

        // draw the vector with the updated end points
        g2.draw(new Line2D.Float(0f, 0f, vectorEndX, vectorEndY));
    }
}