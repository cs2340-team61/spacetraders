package edu.gatech.cs2340

import java.io.Serializable

/**
 * class for ship's inventory
 */
class ShipInventory : Serializable {
    /**
     * Getter Method for amount of water
     * @return amount of water
     */
    var numWater: Int = 0
        private set
    /**
     * Getter Method for amount of furs
     * @return amount of fur
     */
    var numFurs: Int = 0
        private set
    /**
     * Getter Method for amount of food
     * @return amount of food
     */
    var numFood: Int = 0
        private set
    /**
     * Getter Method for amount of ore
     * @return amount of ore
     */
    var numOre: Int = 0
        private set
    /**
     * Getter Method for amount of games
     * @return amount of games
     */
    var numGames: Int = 0
        private set
    /**
     * Getter Method for amount of firearms
     * @return amount of firearms
     */
    var numFirearms: Int = 0
        private set
    /**
     * Getter Method for amount of medicine
     * @return amount of medicine
     */
    var numMedicine: Int = 0
        private set
    /**
     * Getter Method for amount of machines
     * @return amount of machines
     */
    var numMachines: Int = 0
        private set
    /**
     * Getter Method for amount of narcotics
     * @return amount of narcotics
     */
    var numNarcotics: Int = 0
        private set
    /**
     * Getter Method for amount of robots
     * @return amount of robots
     */
    var numRobots: Int = 0
        private set
    /**
     * getter method to get max cargo
     * @return max
     */
    val maxCargo: Int
    /**
     * getter method to get size
     * @return size
     */
    /**
     * setter method to set size
     * @param size  size
     */
    var size: Int = 0

    /**
     * method that initializes ship's inventory
     */
    init {
        numWater = 0
        numFurs = 0
        numFood = 0
        numOre = 0
        numGames = 0
        numFirearms = 0
        numMedicine = 0
        numMachines = 0
        numNarcotics = 0
        numRobots = 0
        maxCargo = initialMaxCargo
        size = 0
    }

    /**
     * Method to add water to inventory
     * @param add amount to add
     */
    fun addWater(add: Int) {
        numWater += add
    }

    /**
     * Method to add furs to inventory
     * @param add amount to add
     */
    fun addFurs(add: Int) {
        numFurs += add
    }

    /**
     * Method to add food to inventory
     * @param add amount to add
     */
    fun addFood(add: Int) {
        numFood += add
    }

    /**
     * Method to add ore to inventory
     * @param add amount to add
     */
    fun addOre(add: Int) {
        numOre += add
    }

    /**
     * Method to add games to inventory
     * @param add amount to add
     */
    fun addGames(add: Int) {
        numGames += add
    }

    /**
     * Method to add firearms to inventory
     * @param add amount to add
     */
    fun addFirearms(add: Int) {
        numFirearms += add
    }

    /**
     * Method to add medicine to inventory
     * @param add amount to add
     */
    fun addMedicine(add: Int) {
        numMedicine += add
    }

    /**
     * Method to add machines to inventory
     * @param add amount to add
     */
    fun addMachines(add: Int) {
        numMachines += add
    }

    /**
     * Method to add narcotics to inventory
     * @param add amount to add
     */
    fun addNarcotics(add: Int) {
        numNarcotics += add
    }

    /**
     * Method to add robots to inventory
     * @param add amount to add
     */
    fun addRobots(add: Int) {
        numRobots += add
    }

    /**
     * Method to remove water to inventory
     * @param add amount to remove
     */
    fun removeWater(add: Int) {
        numWater -= add
    }

    /**
     * Method to remove furs to inventory
     * @param add amount to remove
     */
    fun removeFurs(add: Int) {
        numFurs -= add
    }

    /**
     * Method to remove food to inventory
     * @param add amount to remove
     */
    fun removeFood(add: Int) {
        numFood -= add
    }

    /**
     * Method to remove ore to inventory
     * @param add amount to remove
     */
    fun removeOre(add: Int) {
        numOre -= add
    }

    /**
     * Method to remove games to inventory
     * @param add amount to remove
     */
    fun removeGames(add: Int) {
        numGames -= add
    }

    /**
     * Method to remove firearms to inventory
     * @param add amount to remove
     */
    fun removeFirearms(add: Int) {
        numFirearms -= add
    }

    /**
     * Method to remove medicine to inventory
     * @param add amount to remove
     */
    fun removeMedicine(add: Int) {
        numMedicine -= add
    }

    /**
     * Method to remove machines to inventory
     * @param add amount to remove
     */
    fun removeMachines(add: Int) {
        numMachines -= add
    }

    /**
     * Method to remove narcotics to inventory
     * @param add amount to remove
     */
    fun removeNarcotics(add: Int) {
        numNarcotics -= add
    }

    /**
     * Method to remove robots to inventory
     * @param add amount to remove
     */
    fun removeRobots(add: Int) {
        numRobots -= add
    }

    companion object {
        private val initialMaxCargo = 15
    }

    //public void setMaxCargo(int maxCargo) { this.maxCargo = maxCargo; }
}
