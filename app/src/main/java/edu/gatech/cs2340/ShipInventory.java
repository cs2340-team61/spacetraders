package edu.gatech.cs2340;

import java.io.Serializable;
/**
 * class for ship's inventory
 */
public class ShipInventory implements Serializable {
    private int numWater;
    private int numFurs;
    private int numFood;
    private int numOre;
    private int numGames;
    private int numFirearms;
    private int numMedicine;
    private int numMachines;
    private int numNarcotics;
    private int numRobots;
    private final int maxCargo;
    private int size;
    private static final int initialMaxCargo = 15;
    /**
     * method that initializes ship's inventory
     */
    public ShipInventory() {
        numWater = 0;
        numFurs = 0;
        numFood = 0;
        numOre = 0;
        numGames = 0;
        numFirearms = 0;
        numMedicine = 0;
        numMachines = 0;
        numNarcotics = 0;
        numRobots = 0;
        maxCargo = initialMaxCargo;
        size = 0;
    }
    /**
     * Getter Method for amount of water
     * @return amount of water
     */
    public int getNumWater() { return numWater; }
    /**
     * Getter Method for amount of furs
     * @return amount of fur
     */
    public int getNumFurs() { return numFurs; }
    /**
     * Getter Method for amount of food
     * @return amount of food
     */
    public int getNumFood() { return numFood; }
    /**
     * Getter Method for amount of ore
     * @return amount of ore
     */
    public int getNumOre() { return numOre; }
    /**
     * Getter Method for amount of games
     * @return amount of games
     */
    public int getNumGames() { return numGames; }
    /**
     * Getter Method for amount of firearms
     * @return amount of firearms
     */
    public int getNumFirearms() { return numFirearms; }
    /**
     * Getter Method for amount of medicine
     * @return amount of medicine
     */
    public int getNumMedicine() { return numMedicine; }
    /**
     * Getter Method for amount of machines
     * @return amount of machines
     */
    public int getNumMachines() { return numMachines; }
    /**
     * Getter Method for amount of narcotics
     * @return amount of narcotics
     */
    public int getNumNarcotics() { return numNarcotics; }
    /**
     * Getter Method for amount of robots
     * @return amount of robots
     */
    public int getNumRobots() { return numRobots; }
    /**
     * Method to add water to inventory
     * @param add amount to add
     */
    public void addWater(int add) {
        numWater += add;
    }
    /**
     * Method to add furs to inventory
     * @param add amount to add
     */
    public void addFurs(int add) {
        numFurs += add;
    }
    /**
     * Method to add food to inventory
     * @param add amount to add
     */
    public void addFood(int add) {
        numFood += add;
    }
    /**
     * Method to add ore to inventory
     * @param add amount to add
     */
    public void addOre(int add) {
        numOre += add;
    }
    /**
     * Method to add games to inventory
     * @param add amount to add
     */
    public void addGames(int add) {
        numGames += add;
    }
    /**
     * Method to add firearms to inventory
     * @param add amount to add
     */
    public void addFirearms(int add) {
        numFirearms += add;
    }
    /**
     * Method to add medicine to inventory
     * @param add amount to add
     */
    public void addMedicine(int add) {
        numMedicine += add;
    }
    /**
     * Method to add machines to inventory
     * @param add amount to add
     */
    public void addMachines(int add) {
        numMachines += add;
    }
    /**
     * Method to add narcotics to inventory
     * @param add amount to add
     */
    public void addNarcotics(int add) {
        numNarcotics += add;
    }
    /**
     * Method to add robots to inventory
     * @param add amount to add
     */
    public void addRobots(int add) {
        numRobots += add;
    }
    /**
     * Method to remove water to inventory
     * @param add amount to remove
     */
    public void removeWater(int add) {
        numWater -= add;
    }
    /**
     * Method to remove furs to inventory
     * @param add amount to remove
     */
    public void removeFurs(int add) {
        numFurs -= add;
    }
    /**
     * Method to remove food to inventory
     * @param add amount to remove
     */
    public void removeFood(int add) {
        numFood -= add;
    }
    /**
     * Method to remove ore to inventory
     * @param add amount to remove
     */
    public void removeOre(int add) {
        numOre -= add;
    }
    /**
     * Method to remove games to inventory
     * @param add amount to remove
     */
    public void removeGames(int add) {
        numGames -= add;
    }
    /**
     * Method to remove firearms to inventory
     * @param add amount to remove
     */
    public void removeFirearms(int add) {
        numFirearms -= add;
    }
    /**
     * Method to remove medicine to inventory
     * @param add amount to remove
     */
    public void removeMedicine(int add) {
        numMedicine -= add;
    }
    /**
     * Method to remove machines to inventory
     * @param add amount to remove
     */
    public void removeMachines(int add) {
        numMachines -= add;
    }
    /**
     * Method to remove narcotics to inventory
     * @param add amount to remove
     */
    public void removeNarcotics(int add) {
        numNarcotics -= add;
    }
    /**
     * Method to remove robots to inventory
     * @param add amount to remove
     */
    public void removeRobots(int add) {
        numRobots -= add;
    }
    /**
     * getter method to get max cargo
     * @return max
     */
    public int getMaxCargo() { return maxCargo; }
    /**
     * getter method to get size
     * @return size
     */
    public int getSize() { return size; }
    /**
     * setter method to set size
     * @param size  size
     */
    public void setSize(int size) { this.size = size; }

    //public void setMaxCargo(int maxCargo) { this.maxCargo = maxCargo; }
}
