package edu.gatech.cs2340;

import java.io.Serializable;

public class Player implements Serializable {

    private String playerName;

    private Ship shipOwned;

    private int credits;

    private int skillPilot;

    private int skillFighter;

    private int skillTrader;

    private int skillEngineer;

    public Player(String pN, int sE, int sF, int sP, int sT) {
        playerName = pN;
        shipOwned = Ship.Gnat;
        credits = 1000;
        skillEngineer = sE;
        skillFighter = sF;
        skillPilot = sP;
        skillTrader = sT;
    }

    public String getPlayerName() { return playerName; }

    public Ship getShipOwned() { return shipOwned; }

    public void setShipOwned(Ship shipOwned) { this.shipOwned = shipOwned; }

    public int getCredits() { return credits; }

    public void setCredits(int credits) { this.credits = credits; }

    public int getSkillEngineer() { return skillEngineer; }

    public void setSkillEngineer(int skillEngineer) { this.skillEngineer = skillEngineer; }

    public int getSkillFighter() { return skillFighter; }

    public void setSkillFighter(int skillFighter) { this.skillFighter = skillFighter; }

    public int getSkillPilot() { return skillPilot; }

    public void setSkillPilot(int skillPilot) { this.skillPilot = skillPilot; }

    public int getSkillTrader() { return skillTrader; }

    public void setSkillTrader(int skillTrader) { this.skillTrader = skillTrader; }
}
