package edu.gatech.cs2340;

public class Game {
    private Difficulty gameDiff;
    private Player player;
    private Universe universe;

    public Game(Difficulty gameDiff, Player player, Universe universe) {
        this.gameDiff = gameDiff;
        this.player = player;
        this.universe = universe;
        universe.addSolarSystem();
        universe.addSolarSystem();
        universe.addSolarSystem();
        universe.addSolarSystem();
        universe.addSolarSystem();
    }

    public void setGameDiff(Difficulty diff) { gameDiff = diff; }

    public Difficulty getGameDiff() { return gameDiff; }

    public Universe getUniverse() { return universe; }

    public Player getPlayer() { return player; }
}
