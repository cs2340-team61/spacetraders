package edu.gatech.cs2340;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Planet {
    private int xPlanet;
    private int yPlanet;
    private String planetName;
    private String techLevel;
    private String resources;

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
        xPlanet = x;
        yPlanet = y;
        Random rand = new Random();
        techLevel = techLevels[rand.nextInt(8)];
        resources = resourceLevels[rand.nextInt(2) * rand.nextInt(13)];
        planetName = planetNames[rand.nextInt(planetNames.length + 1)];
    }
}
