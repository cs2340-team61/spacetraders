package edu.gatech.cs2340

import java.io.Serializable

/**
 * Class to create Player
 */
class Player
/**
 * Method that creates Player
 * @param pN player name
 * @param sE skill points
 * @param sF skill points
 * @param sP skill points
 * @param sT skill points
 */
(
        /**
         * Getter Method for player name
         * @return player's name
         */
        val playerName: String, val skillEngineer: Int,
        //public void setSkillFighter(int skillFighter) { this.skillFighter = skillFighter; }

        val skillPilot: Int,
        //public void setSkillEngineer(int skillEngineer) { this.skillEngineer = skillEngineer; }

        val skillFighter: Int,
        //public void setSkillPilot(int skillPilot) { this.skillPilot = skillPilot; }

        val skillTrader: Int) : Serializable {

    private val shipOwned: Ship

    //private ShipInventory shipInventory;

    //public void setShipOwned(Ship shipOwned) { this.shipOwned = shipOwned; }

    var credits: Int = 0

    //Ship getShipOwned() { return shipOwned; }

    val shipString: String
        get() = shipOwned.shp

    init {
        shipOwned = Ship.Gnat
        credits = 1000
    }

    //public void setSkillTrader(int skillTrader) { this.skillTrader = skillTrader; }

    //public ShipInventory getShipInventory() { return shipInventory; }

    override fun toString(): String {
        return String.format("\nPlayer Name: %s, \nShip: %s, \ncredits: %d, \nEngineer Skill: %s," + " \nPilot Skill: %s, \nFighter Skill: %s, \nTrader Skill: %s", playerName,
                shipOwned, credits, skillEngineer, skillPilot, skillFighter, skillTrader)
    }
}
