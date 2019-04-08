package edu.gatech.cs2340;

import java.io.Serializable;

public class Game implements Serializable {
    private Difficulty gameDiff;
    private Player player;
    private Universe universe;
    private static  final int totalPlanets = 15;
    private final Planet[] plans = new Planet[totalPlanets];
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
    private final Travel travel;
    private final ShipStats shipStats;
    private final RandomEvent rE;

    public Game() {
        travel = new Travel();
        shipStats = new ShipStats();
        rE = new RandomEvent();
    }

    public void addS() {
        for (int i = 0; i < 5; i++) {
            universe.addSolarSystem();
        }

        SolarSystem[] sols = universe.getSolarSystems();
        int incrementer = 0;
        for (int j = 0; j < 5; j++) {
            Planet[] planets = sols[j].getPlanets();
            for (int i = 0; i < 3; i++) {
                plans[incrementer] = planets[i];
                incrementer++;
            }
        }

        playerLocation = plans[0];
    }

    public void createMarketGoods() {
        water = createWater();
        furs = createFurs();
        food = createFood();
        ore = createOre();
        games = createGames();
        firearms = createFirearms();
        medicine = createMedicine();
        machines = createMachines();
        narcotics = createNarcotics();
        robots = createRobots();
    }

    public void createMarketplace() {
        setTechLevel(water);
        setTechLevel(furs);
        setTechLevel(food);
        setTechLevel(ore);
        setTechLevel(games);
        setTechLevel(firearms);
        setTechLevel(medicine);
        setTechLevel(machines);
        setTechLevel(narcotics);
        setTechLevel(robots);


        waterPrice = calculatePrice(water);
        fursPrice = calculatePrice(furs);
        foodPrice = calculatePrice(food);
        orePrice = calculatePrice(ore);
        gamesPrice = calculatePrice(games);
        firearmsPrice = calculatePrice(firearms);
        medicinePrice = calculatePrice(medicine);
        machinesPrice = calculatePrice(machines);
        narcoticsPrice = calculatePrice(narcotics);
        robotsPrice = calculatePrice(robots);
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

    private Marketplace createWater() {
        Marketplace waterObject = new Marketplace();
        waterObject.Water();
        return waterObject;
    }

    private Marketplace createFurs() {
        Marketplace fursObject = new Marketplace();
        fursObject.Furs();
        return fursObject;
    }

    private Marketplace createFood() {
        Marketplace foodObject = new Marketplace();
        foodObject.Food();
        return foodObject;
    }

    private Marketplace createOre() {
        Marketplace oreObject = new Marketplace();
        oreObject.Ore();
        return oreObject;
    }

    private Marketplace createGames() {
        Marketplace gamesObject = new Marketplace();
        gamesObject.Games();
        return gamesObject;
    }

    private Marketplace createFirearms() {
        Marketplace firearmsObject = new Marketplace();
        firearmsObject.Firearms();
        return firearmsObject;
    }

    private Marketplace createMedicine() {
        Marketplace medicineObject = new Marketplace();
        medicineObject.Medicine();
        return medicineObject;
    }

    private Marketplace createMachines() {
        Marketplace machinesObject = new Marketplace();
        machinesObject.Machines();
        return machinesObject;
    }

    private Marketplace createNarcotics() {
        Marketplace narcoticsObject = new Marketplace();
        narcoticsObject.Narcotics();
        return narcoticsObject;
    }

    private Marketplace createRobots() {
        Marketplace robotsObject = new Marketplace();
        robotsObject.Robots();
        return robotsObject;
    }

    private int calculatePrice(Marketplace marketplace) {
        return marketplace.calculatePrice();
    }

    private void setTechLevel(Marketplace marketplace) {
        marketplace.techLevel(playerLocation.getTechLevel());
    }


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

    void setHealth(int health) {
        shipStats.setHealth(health);
    }

    public int getFuel() {return shipStats.getFuel(); }

    int getSpeed() {return shipStats.getSpeed();}

    int getLaser() {return shipStats.getLaser();}

    public boolean pirateCheck() {
        return rE.encounterPirates();
    }
    public boolean policeCheck() {
        return rE.encounterPolice();
    }

    public boolean traderCheck() {
        return rE.encounterTraders();
    }

    int getNumNarcotics() {
        return inventory.getNumNarcotics();
    }

    public int getCredits() {
        return player.getCredits();
    }
}
