package edu.gatech.cs2340;

import java.util.Random;

public class SolarSystem {
    private int x;
    private int y;

    private String ssName;
    private Planet[] planets = new Planet[3];

    public SolarSystem(int spreader) {
        Random rand = new Random();
        x = (rand.nextInt(3) + 1) * 10 + spreader;
        y = (rand.nextInt(210)) + 20;
        planets[0] = new Planet(x + rand.nextInt(3) + 2, y + rand.nextInt(8) + 2);
        planets[1] = new Planet(x + rand.nextInt(3) - 2, y - rand.nextInt(8) - 2);
        planets[2] = new Planet(x - rand.nextInt(3) - 2, y + rand.nextInt(10) - 5);
    }

    public int getX() { return x; }

    public int getY() { return y; }

    public Planet[] getPlanets() { return planets; }

    public String getSsName() { return ssName; }
}
