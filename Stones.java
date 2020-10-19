package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import java.awt.*;

public class Stones implements Drawble {
    private int x, y, w, h;
    private Color c;

    public Stones(int x, int y, int h, int w, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
        this.h = h;
        this.w = w;
    }

    @Override
    public void draw(Graphics2D g) {
        drawStones(g, x, y, h, w, c);
    }

    public static void drawStones(Graphics2D g, int x, int y, int h, int w, Color c) {
        g.setColor(c);
        g.fillOval(x+50, y+30, h, w);
        g.fillOval(x+110, y-20, h, w);
        g.fillOval(x+20, y-10, h, w);
        g.setColor(Color.ORANGE);
        g.fillOval(x+45, y, h-73, w-33);
        g.fillOval(x+55, y+15, h-73, w-33);
        g.fillOval(x+65, y+5, h-73, w-33);

    }
}