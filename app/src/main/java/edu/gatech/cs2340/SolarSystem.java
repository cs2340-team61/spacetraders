package edu.gatech.cs2340;

import java.io.Serializable;
import java.util.Random;

public class SolarSystem implements Serializable {
    private static final int yBound = 210;
    private static final int boundPlus = 20;

    private final String ssName;
    private final Planet[] planets = new Planet[3];

    public SolarSystem(int spreader, int nameHelp) {
        Random rand = new Random();
        int x = ((rand.nextInt(3) + 1) * 10) + spreader;
        int y = (rand.nextInt(yBound)) + boundPlus;
        planets[0] = new Planet(x + rand.nextInt(3) + 2, y + rand.nextInt(8) + 2);
        planets[1] = new Planet((x + rand.nextInt(3)) - 2, y - rand.nextInt(8) - 2);
        planets[2] = new Planet(x - rand.nextInt(3) - 2, (y + rand.nextInt(10)) - 5);
        String[] ssNames = {
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
        if((nameHelp < 0) || (nameHelp > ssNames.length))
        {
            ssName = "";
        } else {
            ssName = ssNames[nameHelp];
        }
    }

    /*public int getX() { return x; }

    public int getY() { return y; }*/

    public Planet[] getPlanets() { return planets.clone(); }

    public String getSsName() { return ssName; }

    /*private String getPlanetData(int planet) {
        return planets[planet].toString();
    }*/

    /*@Override
    public String toString() {
        return String.format("\n\nSolar System Name %s \nX center: %d \nY center: %d \nPlanets: " +
                getPlanetData(0) + getPlanetData(1) + getPlanetData(2), ssName, x, y);
    }*/
}
