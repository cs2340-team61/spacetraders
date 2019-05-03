package edu.gatech.cs2340

import java.io.Serializable
import java.util.Random

/**
 * Class for Solar System creation
 */
class SolarSystem
/**
 * Method that creates a solarsystem
 * @param nameHelp value to choose name
 * @param spreader value to change the x and y values
 */
(spreader: Int, nameHelp: Int) : Serializable {

    /**
     * getter Method for solar system name
     * @return name of solar system
     */
    val ssName: String
    private val planets = arrayOfNulls<Planet>(3)

    init {
        val rand = Random()
        val x = (rand.nextInt(3) + 1) * 10 + spreader
        val y = rand.nextInt(yBound) + boundPlus
        planets[0] = Planet(x + rand.nextInt(3) + 2, y + rand.nextInt(8) + 2)
        planets[1] = Planet(x + rand.nextInt(3) - 2, y - rand.nextInt(8) - 2)
        planets[2] = Planet(x - rand.nextInt(3) - 2, y + rand.nextInt(10) - 5)
        val ssNames = arrayOf("Milky Way", "Iridescent", "Locus Sil", "Azurite 655", "Kalitrop S-6", "BG-786", "Lycan System", "Crecent", "ZFG-987", "Crylic", "Richter", "Kaisic", "Deluvar", "Hozin", "Jello", "Mystery", "Illicient", "Affluent")
        if (nameHelp < 0 || nameHelp > ssNames.size) {
            ssName = ""
        } else {
            ssName = ssNames[nameHelp]
        }
    }

    /*public int getX() { return x; }

    public int getY() { return y; }*/
    /**
     * Getter Method for planets
     * @return an array of planets in the solar system
     */
    fun getPlanets(): Array<Planet?> {
        return planets.clone()
    }

    companion object {
        private val yBound = 210
        private val boundPlus = 20
    }

    /*private String getPlanetData(int planet) {
        return planets[planet].toString();
    }*/

    /*@Override
    public String toString() {
        return String.format("\n\nSolar System Name %s \nX center: %d \nY center: %d \nPlanets: " +
                getPlanetData(0) + getPlanetData(1) + getPlanetData(2), ssName, x, y);
    }*/
}
