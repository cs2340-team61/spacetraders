package edu.gatech.cs2340

import java.io.Serializable
import java.util.Random

/**
 * Class for Universe creation
 */
class Universe : Serializable {
    //private final int xLow;
    //private final int xHigh;
    //private final int yLow;
    //private final int yHigh;
    private var numOfSS: Int = 0
    private var nameHelp: Int = 0

    private val solarSystems: Array<SolarSystem?>

    /**
     * Method that creates a Universe
     *
     */
    init {
        //xHigh = xBound;
        //xLow = 0;
        //yHigh = yBound;
        //yLow = 0;
        numOfSS = 0
        val rand = Random()
        nameHelp = rand.nextInt(nameDivisor)
        solarSystems = arrayOfNulls(5)
    }

    /**
     * Method to add a SolarSystem to an existing Universe
     */
    fun addSolarSystem() {
        solarSystems[numOfSS] = SolarSystem(numOfSS * spreader, nameHelp % nameDivisor)
        numOfSS++
        nameHelp++
    }

    /*public int getxHigh() { return xHigh; }

    public int getxLow() { return xLow; }

    public int getyHigh() { return yHigh; }

    public int getyLow() { return yLow; }*/
    /**
     * Getter Method for Solar System
     * @return an array of the SolarSystem
     */
    fun getSolarSystems(): Array<SolarSystem?> {
        return solarSystems.clone()
    }

    companion object {
        //private static final int xBound = 250;
        //private static final int yBound = 250;
        private val nameDivisor = 13
        private val spreader = 50
    }

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
