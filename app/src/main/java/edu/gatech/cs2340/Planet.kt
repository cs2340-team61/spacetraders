package edu.gatech.cs2340

import java.io.Serializable
import java.util.Random

/**
 * Planet Class for creating Planets
 */
class Planet
/**
 * Method to create planet with x and y coordinate
 * @param x  Planet's x location
 * @param y Planet's y location
 */
(x: Int, y: Int) : Serializable {
    private var xPlanet: Int = 0
    private var yPlanet: Int = 0
    /**
     * Getter Method for Planet's name
     * @return Planet's name
     */
    val planetName: String
    /**
     * Getter Method for Planet's tech level
     * @return Planet's tech level
     */
    var techLevel: String? = null
        private set
    /**
     * Getter Method for Planet's Resource level
     * @return Planet's resource level
     */
    var resources: String? = null
        private set

    private val techLevels = arrayOf("Pre-Agriculture", "Agriculture", "Medieval", "Renaissance", "Early Industrial", "Industrial", "Post-Industrial", "Hi-Tech")

    private val resourceLevels = arrayOf("No Special Resources", "Mineral Rich", "Mineral Poor", "Desert", "Lots of Water", "Rich Soil", "Poor Soil", "Rich Fauna", "Lifeless", "Weird Mushrooms", "Lots of Herbs", "Artistic", "Warlike")

    init {
        if (x >= 0 && y >= 0) {
            xPlanet = x
            yPlanet = y
            val rand = Random()
            techLevel = techLevels[rand.nextInt(8)]
            resources = resourceLevels[rand.nextInt(2) * rand.nextInt(randBound13)]
            val planetNames = arrayOf("Earth", "Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto", "Acamar", "Adahn", "Aldea", "Andevian", "Antedi", "Balosnee", "Baratas", "Brax", "Bretel", "Calondia", "Campor", "Capelle", "Carzon", "Castor", "Cestus", "Cheron", "Courteney", "Daled", "Damast", "Davlos", "Deneb", "Deneva", "Devidia", "Draylon", "Drema", "Endor", "Esmee", "Exo", "Flight", "Helios", "Zeitnot", "Zggrasdil", "Zylia", "Tusil", "Rhode", "Photos", "Lima", "Nendo", "Portia", "Onfleek", "Calitrops", "Sylus", "Querko", "Ulvanus", "Orang")
            planetName = planetNames[rand.nextInt(randBound53)]
        } else {
            throw IndexOutOfBoundsException("x and y cannot be negative")
        }
    }

    /**
     * Method to create planet with x and y coordinate
     * @param x  Planet's x location
     * @param y Planet's y location
     */
    fun createPlanet(x: Int, y: Int) {
        if (x >= 0 && y >= 0) {
            xPlanet = x
            yPlanet = y
            val rand = Random()
            techLevel = techLevels[rand.nextInt(8)]
            resources = resourceLevels[rand.nextInt(2) * rand.nextInt(randBound13)]
        } else {
            throw IndexOutOfBoundsException("x and y cannot be negative")
        }

    }

    /**
     * Getter Method for Planet's x value
     * @return Planet's x location
     */
    fun getxPlanet(): Int {
        return xPlanet
    }

    /**
     * Getter Method for Planet's y value
     * @return Planet's y location
     */
    fun getyPlanet(): Int {
        return yPlanet
    }

    companion object {
        private val randBound13 = 13
        private val randBound53 = 53
    }

    /*@Override
    public String toString() {
        return String.format("\nPlanet name: %s \nX: %d \nY: %d \nResource: %s \nTech Level: %s",
                planetName, xPlanet, yPlanet, resources, techLevel );
    }*/
}
