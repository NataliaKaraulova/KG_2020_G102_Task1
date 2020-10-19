package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import java.awt.*;

public class Cloud implements Drawble {
    private int x, y, r1, r2, n;
    private Color c;

    public Cloud(int x, int y, int r1, int r2, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r1 = r1;
        this.r2 = r2;
        this.n = n;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawCloud(g, x, y, r1, r2, n, c);
    }

    public static void drawCloud(Graphics2D g, int x, int y, int r1, int r2, int n, Color c) {
        g.setColor(c);
        g.fillOval(x, y, r1, r2);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double alpha = da * i;
            double x1 = r1 * Math.cos(alpha);
            double y1 = r1 * Math.sin(alpha);
            g.fillOval(x + (int) x1 / 2, y + (int) y1 / 2 , r1, r2);
        }
    }
}


        /*g.setColor(c);

        g.fillOval(x, y, w, h);
        g.fillOval(x+50, y, w, h);
        g.fillOval(x+23, y-15, w, h);
        g.fillOval(x+20, y+20, w, h);*/
