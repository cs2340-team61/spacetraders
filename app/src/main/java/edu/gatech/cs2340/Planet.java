package edu.gatech.cs2340;

import android.service.notification.NotificationListenerService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Planet implements Serializable {
    private int xPlanet;
    private int yPlanet;
    private String planetName;
    private String techLevel;
    private String resources;
    private ArrayList<String> names;

    private String[] planetNames = {
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

    private String[] techLevels = {
         "Pre-Agriculture",
         "Agriculture",
         "Medieval",
         "Renaissance",
         "Early Industrial",
         "Industrial",
         "Post-Industrial",
         "Hi-Tech"
    };

    private String[] resourceLevels = {
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


    public Planet(int x, int y) {
        if (x >= 0 && y >= 0){
            xPlanet = x;
            yPlanet = y;
            Random rand = new Random();
            techLevel = techLevels[rand.nextInt(8)];
            resources = resourceLevels[rand.nextInt(2) * rand.nextInt(13)];
            planetName = planetNames[rand.nextInt(53)];
        } else {
            throw new IndexOutOfBoundsException("x and y cannot be negative");
        }
    }

    public void createPlanet(int x, int y) {
        if (x >= 0 && y >= 0){
            xPlanet = x;
            yPlanet = y;
            Random rand = new Random();
            techLevel = techLevels[rand.nextInt(8)];
            resources = resourceLevels[rand.nextInt(2) * rand.nextInt(13)];
        } else {
            throw new IndexOutOfBoundsException("x and y cannot be negative");
        }

    }
    public int getxPlanet() { return xPlanet; }

    public int getyPlanet() { return yPlanet; }

    public String getPlanetName() { return planetName; }

    public String getResources() { return resources; }

    public String getTechLevel() { return techLevel; }

    @Override
    public String toString() {
        return String.format("\nPlanet name: %s \nX: %d \nY: %d \nResource: %s \nTech Level: %s",
                planetName, xPlanet, yPlanet, resources, techLevel );
    }
}
