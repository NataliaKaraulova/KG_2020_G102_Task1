package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import java.awt.*;

public class Nenuphar implements Drawble {
    private int x, y, w, h;
    private Color c;

    public Nenuphar(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawNenuphar(g, x, y, h, w, c);
    }

    public static void drawNenuphar(Graphics2D g, int x, int y, int h, int w, Color c) {
        g.setColor(c);
        g.fillOval(x, y, h, w);
        g.setColor(Color.BLUE);
        g.fillArc(x+10, y-10, 60, 70, 70, 50);

    }
}