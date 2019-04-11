package edu.gatech.cs2340;

import java.io.Serializable;
import java.util.Random;

public class Universe implements Serializable {
    //private final int xLow;
    //private final int xHigh;
    //private final int yLow;
    //private final int yHigh;
    private int numOfSS;
    private int nameHelp;
    //private static final int xBound = 250;
    //private static final int yBound = 250;
    private static final int nameDivisor = 13;
    private static final int spreader = 50;

    private final SolarSystem[] solarSystems;
    /**
     * Method that creates a Universe
     *
     */
    public Universe() {
        //xHigh = xBound;
        //xLow = 0;
        //yHigh = yBound;
        //yLow = 0;
        numOfSS = 0;
        Random rand = new Random();
        nameHelp = rand.nextInt(nameDivisor);
        solarSystems = new SolarSystem[5];
    }
    /**
     * Method to add a SolarSystem to an existing Universe
     */
    public void addSolarSystem() {
        solarSystems[numOfSS] = new SolarSystem(numOfSS * spreader, nameHelp % nameDivisor);
        numOfSS++;
        nameHelp++;
    }

    /*public int getxHigh() { return xHigh; }

    public int getxLow() { return xLow; }

    public int getyHigh() { return yHigh; }

    public int getyLow() { return yLow; }*/
    /**
     * Getter Method for Solar System
     * @return an array of the SolarSystem
     */
    public SolarSystem[] getSolarSystems() { return solarSystems.clone(); }

    /*private String getSSData(SolarSystem solarSystem) {
        return solarSystem.toString();
    }*/

    /*@Override
    public String toString() {
        return String.format("Universe:\n     "
                + getSSData(solarSystems[0])
                + getSSData(solarSystems[1])
                + getSSData(solarSystems[2])
                + getSSData(solarSystems[3])
                + getSSData(solarSystems[4]));
    }         */
}
