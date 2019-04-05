package edu.gatech.cs2340;

import java.io.Serializable;

public class Game implements Serializable {
    private Difficulty gameDiff;
    private Player player;
    private Universe universe;
    private SolarSystem[] sols;
    private Planet[] plans = new Planet[15];
    private Planet playerLocation;
    private Marketplace water;
    private Marketplace furs;
    private Marketplace food;
    private Marketplace ore;
    private Marketplace games;
    private Marketplace firearms;
    private Marketplace medicine;
    private Marketplace machines;
    private Marketplace narcotics;
    private Marketplace robots;
    private int waterPrice;
    private int fursPrice;
    private int foodPrice;
    private int orePrice;
    private int gamesPrice;
    private int firearmsPrice;
    private int medicinePrice;
    private int machinesPrice;
    private int narcoticsPrice;
    private int robotsPrice;
    private ShipInventory inventory;
    private Travel travel;
    private ShipStats shipStats;
    private RandomEvent rE;

    public Game() {
        travel = new Travel();
        shipStats = new ShipStats();
        rE = new RandomEvent();
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

    public void createMarketGoods() {
        water = new Marketplace();
        furs = new Marketplace();
        food = new Marketplace();
        ore = new Marketplace();
        games = new Marketplace();
        firearms = new Marketplace();
        medicine = new Marketplace();
        machines = new Marketplace();
        narcotics = new Marketplace();
        robots = new Marketplace();

        water.Water();
        furs.Furs();
        food.Food();
        ore.Ore();
        games.Games();
        firearms.Firearms();
        medicine.Medicine();
        machines.Machines();
        narcotics.Narcotics();
        robots.Robots();
    }

    public void createMarketplace() {
        String planName = playerLocation.getPlanetName();
        water.techLevel(planName);
        furs.techLevel(planName);
        food.techLevel(planName);
        ore.techLevel(planName);
        games.techLevel(planName);
        firearms.techLevel(planName);
        medicine.techLevel(planName);
        machines.techLevel(planName);
        narcotics.techLevel(planName);
        robots.techLevel(planName);

        waterPrice = water.calculatePrice();
        fursPrice = furs.calculatePrice();
        foodPrice = food.calculatePrice();
        orePrice = ore.calculatePrice();
        gamesPrice = games.calculatePrice();
        firearmsPrice = firearms.calculatePrice();
        medicinePrice = medicine.calculatePrice();
        machinesPrice = machines.calculatePrice();
        narcoticsPrice = narcotics.calculatePrice();
        robotsPrice = robots.calculatePrice();
    }

    public void setGameDiff(Difficulty diff) { gameDiff = diff; }

    public Difficulty getGameDiff() { return gameDiff; }

    public void setUniverse(Universe universe) { this.universe = universe; }

    public void setPlayer(Player player) { this.player = player; }

    public Universe getUniverse() { return universe; }

    public Player getPlayer() { return player; }

    public ShipInventory getInventory() { return inventory; }

    public void setInventory(ShipInventory inventory) {
        this.inventory = inventory;
    }

    public Planet getPlayerLocation() { return playerLocation; }

    public void setPlayerLocation(Planet playerLocation) { this.playerLocation = playerLocation; }

    public Marketplace getFirearms() { return firearms; }

    public Marketplace getFood() { return food; }

    public Marketplace getFurs() { return furs; }

    public Marketplace getGames() { return games; }

    public Marketplace getMachines() { return machines; }

    public Marketplace getMedicine() { return medicine; }

    public Marketplace getNarcotics() { return narcotics; }

    public Marketplace getOre() { return ore; }

    public Marketplace getRobots() { return robots; }

    public Marketplace getWater() { return water; }

    public int getFoodPrice() { return foodPrice; }

    public int getFursPrice() { return fursPrice; }

    public int getWaterPrice() { return waterPrice; }

    public int getOrePrice() { return orePrice; }

    public int getGamesPrice() { return gamesPrice; }

    public int getFirearmsPrice() { return firearmsPrice; }

    public int getMedicinePrice() { return medicinePrice; }

    public int getMachinesPrice() { return machinesPrice; }

    public int getNarcoticsPrice() { return narcoticsPrice; }

    public int getRobotsPrice() { return robotsPrice; }

    public int getDistance(int x1, int x2, int y1, int y2) {
        return travel.calculateDist(x1, x2, y1, y2);
    }

    public int getFuelCost(int distance) { return travel.calculateFuel(distance); }

    public void useFuel(int fuelUse) { shipStats.useFuel(fuelUse); }

    public int getHealth() { return shipStats.getHealth(); }

    protected void setHealth(int health) {
        shipStats.setHealth(health);
    }

    public int getFuel() {return shipStats.getFuel(); }

    protected int getSpeed() {return shipStats.getSpeed();}

    protected int getLaser() {return shipStats.getLaser();}

    public boolean pirateCheck() {
        return rE.encounterPirates();
    }
    public boolean policeCheck() {
        return rE.encounterPolice();
    }

    public boolean traderCheck() {
        return rE.encounterTraders();
    }
}
