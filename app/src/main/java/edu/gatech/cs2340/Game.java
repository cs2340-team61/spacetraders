package edu.gatech.cs2340;

public class Game {
    private Difficulty gameDiff;
    private Player player;

    public Game(Difficulty gameDiff, Player player) {
        this.gameDiff = gameDiff;
        this.player = player;
    }

    public void setGameDiff(Difficulty diff) { gameDiff = diff; }

    public Difficulty getGameDiff() { return gameDiff; }

    public Player getPlayer() { return player; }
}
