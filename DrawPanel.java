package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private Sky sk = new Sky(0, 0, 1600, 800, Color.CYAN);
    private Sun s = new Sun(1100, 60, 30, 50, 20, Color.ORANGE);
    private Land l = new Land(0, 150, 1600, 800, Color.GREEN);
    private Swamp sw = new Swamp(150, 200, Color.BLUE);
    private Stones st1 = new Stones(100, 250, 80, 40, Color.YELLOW);
    private Stones st2 = new Stones(1000, 250, 80, 40, Color.YELLOW);
    private Cloud cl1 = new Cloud(100, 60, 50, 50, 5, Color.WHITE);
    private Cloud cl2 = new Cloud(350, 40, 50, 50, 5, Color.WHITE);
    private Cloud cl3 = new Cloud(650, 50, 50, 50, 5, Color.WHITE);
    private Frog fr1 = new Frog(400, 350, 50, 50, Color.green);
    private Frog fr2 = new Frog(700, 350, 45, 45, Color.green);
    private Nenuphar nen1 = new Nenuphar(900, 400, 50, 80, Color.GREEN);
    private Nenuphar nen2 = new Nenuphar(200, 400, 50, 80, Color.GREEN);
    private Nenuphar nen3 = new Nenuphar(600, 550, 50, 80, Color.GREEN);
    private Nenuphar nen4 = new Nenuphar(600, 250, 50, 80, Color.GREEN);
    private Nenuphar nen5 = new Nenuphar(350, 600, 50, 80, Color.GREEN);
    private Nenuphar nen6 = new Nenuphar(800, 600, 50, 80, Color.GREEN);


    @Override
    public void print(Graphics g) {
        super.print(g);
    }

    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        sk.draw(gr);
        l.draw(gr);
        s.draw(gr);
        sw.draw(gr);
        st1.draw(gr);
        st2.draw(gr);
        cl1.draw(gr);
        cl2.draw(gr);
        cl3.draw(gr);
        fr1.draw(gr);
        fr2.draw(gr);
        nen1.draw(gr);
        nen2.draw(gr);
        nen3.draw(gr);
        nen4.draw(gr);
        nen5.draw(gr);
        nen6.draw(gr);
    }
}