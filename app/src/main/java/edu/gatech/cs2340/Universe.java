package edu.gatech.cs2340;

public class Universe {
    private int xLow;
    private int xHigh;
    private int yLow;
    private int yHigh;
    private int numOfSS;

    private SolarSystem[] solarSystems;

    public Universe() {
        xHigh = 250;
        xLow = 0;
        yHigh = 250;
        yLow = 0;
        numOfSS = 0;
        solarSystems = new SolarSystem[5];
    }

    public void addSolarSystem() {
        solarSystems[numOfSS] = new SolarSystem(numOfSS * 50);
        numOfSS++;
    }

    public int getxHigh() { return xHigh; }

    public int getxLow() { return xLow; }

    public int getyHigh() { return yHigh; }

    public int getyLow() { return yLow; }

    public SolarSystem[] getSolarSystems() { return solarSystems; }

    @Override
    public String toString() {
        return String.format("Universe:\n     "
                + solarSystems[0].toString()
                + solarSystems[1].toString()
                + solarSystems[2].toString()
                + solarSystems[3].toString()
                + solarSystems[4].toString());
    }
}