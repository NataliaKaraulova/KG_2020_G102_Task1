package ru.vsu.cs.kg2020.g102.karaulova_n_a;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() throws HeadlessException{
        DrawPanel dp = new DrawPanel();
        this.add(dp);
    }
}