package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import java.awt.*;

public class Swamp implements Drawble{
    private int x, y;
    private Color c;

    public Swamp(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawSwamp(g, x, y, c);
    }
    public static void drawSwamp(Graphics2D g, int x, int y,  Color c){
        g.setColor(c);
        g.fillOval(x, y, x +800, y+300);

    }
}