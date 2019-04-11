package edu.gatech.cs2340;

import java.io.Serializable;

 class ShipInventory implements Serializable {
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

    ShipInventory() {
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

    int getNumWater() { return numWater; }

    int getNumFurs() { return numFurs; }

    int getNumFood() { return numFood; }

    int getNumOre() { return numOre; }

    int getNumGames() { return numGames; }

    int getNumFirearms() { return numFirearms; }

    int getNumMedicine() { return numMedicine; }

    int getNumMachines() { return numMachines; }

    int getNumNarcotics() { return numNarcotics; }

    int getNumRobots() { return numRobots; }

    void addWater(int add) {
        numWater += add;
    }

    void addFurs(int add) {
        numFurs += add;
    }

    void addFood(int add) {
        numFood += add;
    }

    void addOre(int add) {
        numOre += add;
    }

    void addGames(int add) {
        numGames += add;
    }

    void addFirearms(int add) {
        numFirearms += add;
    }

    void addMedicine(int add) {
        numMedicine += add;
    }

    void addMachines(int add) {
        numMachines += add;
    }

    void addNarcotics(int add) {
        numNarcotics += add;
    }

    void addRobots(int add) {
        numRobots += add;
    }

    void removeWater(int add) {
        numWater -= add;
    }

    void removeFurs(int add) {
        numFurs -= add;
    }

    void removeFood(int add) {
        numFood -= add;
    }

    void removeOre(int add) {
        numOre -= add;
    }

    void removeGames(int add) {
        numGames -= add;
    }

    void removeFirearms(int add) {
        numFirearms -= add;
    }

    void removeMedicine(int add) {
        numMedicine -= add;
    }

    void removeMachines(int add) {
        numMachines -= add;
    }

    void removeNarcotics(int add) {
        numNarcotics -= add;
    }

    void removeRobots(int add) {
        numRobots -= add;
    }

    int getMaxCargo() { return maxCargo; }

    int getSize() { return size; }

    void setSize(int size) { this.size = size; }

    //public void setMaxCargo(int maxCargo) { this.maxCargo = maxCargo; }
}
