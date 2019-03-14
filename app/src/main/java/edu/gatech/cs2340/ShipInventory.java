package edu.gatech.cs2340;

public class ShipInventory {
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
    private int maxCargo;

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
        maxCargo = 50;
    }

    public int getNumWater() { return numWater; }

    public int getNumFurs() { return numFurs; }

    public int getNumFood() { return numFood; }

    public int getNumOre() { return numOre; }

    public int getNumGames() { return numGames; }

    public int getNumFirearms() { return numFirearms; }

    public int getNumMedicine() { return numMedicine; }

    public int getNumMachines() { return numMachines; }

    public int getNumNarcotics() { return numNarcotics; }

    public int getNumRobots() { return numRobots; }

    public void addWater(int add) {
        numWater += add;
    }

    public void addFurs(int add) {
        numFurs += add;
    }

    public void addFood(int add) {
        numFood += add;
    }

    public void addOre(int add) {
        numOre += add;
    }

    public void addGames(int add) {
        numGames += add;
    }

    public void addFirearms(int add) {
        numFirearms += add;
    }

    public void addMedicine(int add) {
        numMedicine += add;
    }

    public void addMachines(int add) {
        numMachines += add;
    }

    public void addNarcotics(int add) {
        numNarcotics += add;
    }

    public void addRobots(int add) {
        numRobots += add;
    }

    public void removeWater(int add) {
        numWater -= add;
    }

    public void removeFurs(int add) {
        numFurs -= add;
    }

    public void removeFood(int add) {
        numFood -= add;
    }

    public void removeOre(int add) {
        numOre -= add;
    }

    public void removeGames(int add) {
        numGames -= add;
    }

    public void removeFirearms(int add) {
        numFirearms -= add;
    }

    public void removeMedicine(int add) {
        numMedicine -= add;
    }

    public void removeMachines(int add) {
        numMachines -= add;
    }

    public void removeNarcotics(int add) {
        numNarcotics -= add;
    }

    public void removeRobots(int add) {
        numRobots -= add;
    }

    public int getMaxCargo() { return maxCargo; }

    public void setMaxCargo(int maxCargo) { this.maxCargo = maxCargo; }
}
