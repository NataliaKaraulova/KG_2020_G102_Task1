package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import java.awt.*;

public class Land implements Drawble{
    private int x, y, w, h;
    private Color c;

    public Land(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawLand(g, x, y, w, h, c);
    }
    public static void drawLand(Graphics2D g, int x, int y, int w, int h, Color c){
        g.setColor(c);
        g.fillRect(x, y, w, h);
        g.setColor(Color.BLACK);
        g.drawString("Поспали, теперь можно и поесть...", 10, 600);
        g.drawString("Поели, теперь можно и поспать...", 1050, 600);
    }
}
