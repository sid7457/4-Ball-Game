package org.example;

import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 600;
    public static final int CENTER = 15;
    private static int ballA = 0;
    private static int ballB = 0;
    private static int ballC = 0;
    private static int ballD = 0;
    private static int ballE = 0;

    public static void main(String[] args) {
        PApplet.main("org.example.TryProcessing");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        ellipse(ballA += 1, HEIGHT / 6, CENTER, CENTER);
        ellipse(ballB += 2, HEIGHT * 2 / 6, CENTER, CENTER);
        ellipse(ballC += 3, HEIGHT * 3 / 6, CENTER, CENTER);
        ellipse(ballD += 4, HEIGHT * 4 / 6, CENTER, CENTER);
        ellipse(ballE += 5, HEIGHT * 5 / 6, CENTER, CENTER);
    }
}