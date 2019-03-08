package edu.gatech.cs2340;

public class Game {
    private Difficulty gameDiff;
    private Player player;
    private Universe universe;
    SolarSystem[] sols;
    Planet[] plans = new Planet[15];
    private Planet playerLocation;

    public Game() {

    }

    public void addS() {
        universe.addSolarSystem();
        universe.addSolarSystem();
        universe.addSolarSystem();
        universe.addSolarSystem();
        universe.addSolarSystem();

        sols = universe.getSolarSystems();
        for (int j = 0; j < 5; j++) {
            Planet[] planets = sols[j].getPlanets();
            for (int i = 0; i < 3; i++) {
                plans[i] = planets[i];
            }
        }

        playerLocation = plans[0];
    }

    public void setGameDiff(Difficulty diff) { gameDiff = diff; }

    public Difficulty getGameDiff() { return gameDiff; }

    public void setUniverse(Universe universe) { this.universe = universe; }

    public void setPlayer(Player player) { this.player = player; }

    public Universe getUniverse() { return universe; }

    public Player getPlayer() { return player; }

    public Planet getPlayerLocation() { return playerLocation; }

    public void setPlayerLocation(Planet playerLocation) { this.playerLocation = playerLocation; }
}
