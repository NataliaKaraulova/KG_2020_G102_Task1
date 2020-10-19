package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import java.awt.*;

    public class Sky implements Drawble{
        private int x, y, w, h;
        private Color c;

        public Sky(int x, int y, int w, int h, Color c) {
            this.x = x;
            this.y = y;
            this.h = h;
            this.w = w;
            this.c = c;
        }

        @Override
        public void draw(Graphics2D g) {
            drawSky(g, x, y, w, h, c);
        }
        public static void drawSky(Graphics2D g, int x, int y, int w, int h, Color c){
            g.setColor(c);
            g.fillRect(x, y, w, h);
            }
        }


