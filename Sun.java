package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import java.awt.*;

public class Sun implements Drawble {
    private int x, y, r, R, n;
    private Color c;

    public Sun(int x, int y, int r, int r1, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawSun(g, x, y, r, R, n, c);}

    public static void drawSun(Graphics2D g, int x, int y, int r, int R, int n, Color c) {
        g.setColor(c);
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double alpha = da * i;
            double x1 = r * Math.cos(alpha);
            double y1 = r * Math.sin(alpha);
            double x2 = R * Math.cos(alpha);
            double y2 = R * Math.sin(alpha);

            g.drawLine(x + (int) x1, y + (int) y1, x + (int) x2, y + (int) y2);
        }
    }

}