package edu.gatech.cs2340;

import java.io.Serializable;
import java.util.Random;
/**
 * Planet Class for creating Planets
 */
public class Planet implements Serializable {
    private int xPlanet;
    private int yPlanet;
    private final String planetName;
    private String techLevel;
    private String resources;
    private static final int randBound13 = 13;
    private static final int randBound53 = 53;

    private final String[] techLevels = {
         "Pre-Agriculture",
         "Agriculture",
         "Medieval",
         "Renaissance",
         "Early Industrial",
         "Industrial",
         "Post-Industrial",
         "Hi-Tech"
    };

    private final String[] resourceLevels = {
         "No Special Resources",
         "Mineral Rich",
         "Mineral Poor",
         "Desert",
         "Lots of Water",
         "Rich Soil",
         "Poor Soil",
         "Rich Fauna",
         "Lifeless",
         "Weird Mushrooms",
         "Lots of Herbs",
         "Artistic",
         "Warlike",
    };

    /**
     * Method to create planet with x and y coordinate
     * @param x  Planet's x location
     * @param y Planet's y location
     */
    public Planet(int x, int y) {
        if ((x >= 0) && (y >= 0)){
            xPlanet = x;
            yPlanet = y;
            Random rand = new Random();
            techLevel = techLevels[rand.nextInt(8)];
            resources = resourceLevels[rand.nextInt(2) * rand.nextInt(randBound13)];
            String[] planetNames = {
                    "Earth",
                    "Mercury",
                    "Venus",
                    "Mars",
                    "Jupiter",
                    "Saturn",
                    "Uranus",
                    "Neptune",
                    "Pluto",
                    "Acamar",
                    "Adahn",
                    "Aldea",
                    "Andevian",
                    "Antedi",
                    "Balosnee",
                    "Baratas",
                    "Brax",
                    "Bretel",
                    "Calondia",
                    "Campor",
                    "Capelle",
                    "Carzon",
                    "Castor",
                    "Cestus",
                    "Cheron",
                    "Courteney",
                    "Daled",
                    "Damast",
                    "Davlos",
                    "Deneb",
                    "Deneva",
                    "Devidia",
                    "Draylon",
                    "Drema",
                    "Endor",
                    "Esmee",
                    "Exo",
                    "Flight",
                    "Helios",
                    "Zeitnot",
                    "Zggrasdil",
                    "Zylia",
                    "Tusil",
                    "Rhode",
                    "Photos",
                    "Lima",
                    "Nendo",
                    "Portia",
                    "Onfleek",
                    "Calitrops",
                    "Sylus",
                    "Querko",
                    "Ulvanus",
                    "Orang"

            };
            planetName = planetNames[rand.nextInt(randBound53)];
        } else {
            throw new IndexOutOfBoundsException("x and y cannot be negative");
        }
    }
    /**
     * Method to create planet with x and y coordinate
     * @param x  Planet's x location
     * @param y Planet's y location
     */
    public void createPlanet(int x, int y) {
        if ((x >= 0) && (y >= 0)){
            xPlanet = x;
            yPlanet = y;
            Random rand = new Random();
            techLevel = techLevels[rand.nextInt(8)];
            resources = resourceLevels[rand.nextInt(2) * rand.nextInt(randBound13)];
        } else {
            throw new IndexOutOfBoundsException("x and y cannot be negative");
        }

    }
    /**
     * Getter Method for Planet's x value
     * @return Planet's x location
     */
    public int getxPlanet() { return xPlanet; }
    /**
     * Getter Method for Planet's y value
     * @return Planet's y location
     */
    public int getyPlanet() { return yPlanet; }
    /**
     * Getter Method for Planet's name
     * @return Planet's name
     */
    public String getPlanetName() { return planetName; }
    /**
     * Getter Method for Planet's Resource level
     * @return Planet's resource level
     */
    public String getResources() { return resources; }
    /**
     * Getter Method for Planet's tech level
     * @return Planet's tech level
     */
    public String getTechLevel() { return techLevel; }

    /*@Override
    public String toString() {
        return String.format("\nPlanet name: %s \nX: %d \nY: %d \nResource: %s \nTech Level: %s",
                planetName, xPlanet, yPlanet, resources, techLevel );
    }*/
}
