package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import java.awt.*;

public class Frog implements Drawble {
    private int x, y, w, h;
    private Color c;

    public Frog(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
    }


    @Override
    public void draw(Graphics2D g) {
        drawFrog(g, x, y, w, h, c);
    }

    public static void drawFrog(Graphics2D g, int x, int y, int w, int h,  Color c) {
        g.setColor(c);
        g.fillOval(x +120, y +15, w, h-15);
        g.fillOval(x, y, w+100, h+100);
        g.fillOval(x+25, y-80, w+50, h+50);
        g.fillOval(x + 30, y -100, w, h);
        g.fillOval(x + 70, y -100, w, h);
        g.fillOval(x -20, y +15, w, h-15);
        g.fillOval(x-10 , y +125,  w+30, h);
        g.fillOval(x + 80, y + 125, w+30, h);
        g.setColor(Color.WHITE);
        g.fillOval(x + 40, y -90, w-15, h-15);
        g.fillOval(x + 75, y -90, w-15, h-15);
        g.setColor(Color.BLACK);
        g.fillOval(x + 50, y -85, w-30, h-30);
        g.fillOval(x + 80, y -85, w-30, h-30);
        g.drawArc(x+50, y-50, 50, 50, 200, 150);
        g.setColor(Color.YELLOW);
        g.fillOval(x+25, y+20, w+50, h+50);
    }
}
