package edu.gatech.cs2340;

import android.media.Image;

import java.util.Random;

public class SolarSystem {
    private int x;
    private int y;

    private String[] ssNames = {
            "Milky Way",
            "Iridescent",
            "Locus Sil",
            "Azurite 655",
            "Kalitrop S-6",
            "BG-786",
            "Lycan System",
            "Crecent",
            "ZFG-987",
            "Crylic",
            "Richter",
            "Kaisic",
            "Deluvar",
            "Hozin",
            "Jello",
            "Mystery",
            "Illicient",
            "Affluent"

    };

    private String ssName;
    private Planet[] planets = new Planet[3];

    public SolarSystem(int spreader, int nameHelp) {
        Random rand = new Random();
        x = (rand.nextInt(3) + 1) * 10 + spreader;
        y = (rand.nextInt(210)) + 20;
        planets[0] = new Planet(x + rand.nextInt(3) + 2, y + rand.nextInt(8) + 2);
        planets[1] = new Planet(x + rand.nextInt(3) - 2, y - rand.nextInt(8) - 2);
        planets[2] = new Planet(x - rand.nextInt(3) - 2, y + rand.nextInt(10) - 5);
        ssName = ssNames[nameHelp];
    }

    public int getX() { return x; }

    public int getY() { return y; }

    public Planet[] getPlanets() { return planets; }

    public String getSsName() { return ssName; }

    @Override
    public String toString() {
        return String.format("\n\nSolar System Name %s \nX center: %d \nY center: %d \nPlanets:      " +
                planets[0].toString() + planets[1].toString() + planets[2].toString(), ssName, x, y);
    }
}
