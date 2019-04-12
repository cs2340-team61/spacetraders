package edu.gatech.cs2340;

import android.support.annotation.NonNull;

import java.io.Serializable;
/**
 * Class to create Player
 */
public class Player implements Serializable {

    private final String playerName;

    private final Ship shipOwned;

    //private ShipInventory shipInventory;

    private int credits;

    private final int skillEngineer;

    private final int skillPilot;

    private final int skillFighter;

    private final int skillTrader;
    /**
     * Method that creates Player
     * @param pN player name
     * @param sE skill points
     * @param sF skill points
     * @param sP skill points
     * @param sT skill points
     */
    public Player(String pN, int sE, int sP, int sF, int sT) {
        playerName = pN;
        shipOwned = Ship.Gnat;
        credits = 1000;
        skillEngineer = sE;
        skillFighter = sF;
        skillPilot = sP;
        skillTrader = sT;
    }
    /**
     * Getter Method for player name
     * @return player's name
     */
    public String getPlayerName() { return playerName; }

    //Ship getShipOwned() { return shipOwned; }

    String getShipString() {
        return shipOwned.getShp();
    }

    //public void setShipOwned(Ship shipOwned) { this.shipOwned = shipOwned; }

    int getCredits() { return credits; }

    void setCredits(int credits) { this.credits = credits; }

    int getSkillEngineer() { return skillEngineer; }

    //public void setSkillEngineer(int skillEngineer) { this.skillEngineer = skillEngineer; }

    int getSkillFighter() { return skillFighter; }

    //public void setSkillFighter(int skillFighter) { this.skillFighter = skillFighter; }

    int getSkillPilot() { return skillPilot; }

    //public void setSkillPilot(int skillPilot) { this.skillPilot = skillPilot; }

    int getSkillTrader() { return skillTrader; }

    //public void setSkillTrader(int skillTrader) { this.skillTrader = skillTrader; }

    //public ShipInventory getShipInventory() { return shipInventory; }

    @NonNull
    @Override
    public String toString() {
        return String.format("\nPlayer Name: %s, \nShip: %s, \ncredits: %d, \nEngineer Skill: %s," +
                        " \nPilot Skill: %s, \nFighter Skill: %s, \nTrader Skill: %s", playerName,
                shipOwned, credits, skillEngineer, skillPilot, skillFighter, skillTrader);
    }
}
