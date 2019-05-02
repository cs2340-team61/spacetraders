package edu.gatech.cs2340;

import java.io.Serializable;
/**
 * Class to create the game
 */
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
    private final Bank bank;
    /**
     * Method which initializes travel, ship stats,
     * and Random Events which might occur.
     */
    public Game() {
        travel = new Travel();
        shipStats = new ShipStats();
        rE = new RandomEvent();
        bank = new Bank();
    }
    /**
     * Method which adds a Solar System to
     * the Universe.
     */
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
    /**
     * Method which initializes market goods
     */
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
    /**
     * Creates Market place, and calculates prices of goods
     */
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
    /**
     * Setter for game difficulty
     * @param diff game difficulty
     */
    public void setGameDiff(Difficulty diff) { gameDiff = diff; }
    /**
     * Getter for game difficulty
     * @return universe returns the game difficulty
     */
    public Difficulty getGameDiff() { return gameDiff; }
    /**
     * Setter for Universe
     * @param universe universe variable
     */
    public void setUniverse(Universe universe) { this.universe = universe; }
    /**
     * Setter for player
     * @param player player variable
     */
    public void setPlayer(Player player) { this.player = player; }
    /**
     * Getter for Universe
     * @return universe
     */
    public Universe getUniverse() { return universe; }
    /**
     * Getter for Player
     * @return player
     */
    public Player getPlayer() { return player; }
    /**
     * Getter for Ship's inventory
     * @return inventory
     */
    public ShipInventory getInventory() { return inventory; }
    /**
     * Setter for Ship's Inventory
     * @param inventory the ships inventory
     */
    public void setInventory(ShipInventory inventory) {
        this.inventory = inventory;
    }
    /**
     * Getter for Player's Location
     * @return player's location
     */
    public Planet getPlayerLocation() { return playerLocation; }
    /**
     * Setter for Player's Location
     * @param playerLocation Player's Location
     */
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

    /**
     * Getter for Food Price
     * @return foodPrice
     */
    public int getFoodPrice() { return foodPrice; }
    /**
     * Getter for Fur Price
     * @return fursPrice
     */
    public int getFursPrice() { return fursPrice; }
    /**
     * Getter for Water Price
     * @return waterPrice
     */
    public int getWaterPrice() { return waterPrice; }
    /**
     * Getter for Ore Price
     * @return orePrice
     */
    public int getOrePrice() { return orePrice; }
    /**
     * Getter for Game Price
     * @return gamesPrice
     */
    public int getGamesPrice() { return gamesPrice; }
    /**
     * Getter for Firearms Price
     * @return firearmsPrice
     */
    public int getFirearmsPrice() { return firearmsPrice; }
    /**
     * Getter for Medicine Price
     * @return medicinePrice
     */
    public int getMedicinePrice() { return medicinePrice; }
    /**
     * Getter for Machines Price
     * @return machinesPrice
     */
    public int getMachinesPrice() { return machinesPrice; }
    /**
     * Getter for Narcotics Price
     * @return narcoticsPrice
     */
    public int getNarcoticsPrice() { return narcoticsPrice; }
    /**
     * Getter for Robots Price
     * @return robotsPrice
     */
    public int getRobotsPrice() { return robotsPrice; }
    /**
     * Getter for the distance between two points
     * @param x1 first x location
     * @param x2 second x location
     * @param y1 first y location
     * @param y2 second y location
     * @return the distance
     */
    public int getDistance(int x1, int x2, int y1, int y2) {
        return travel.calculateDist(x1, x2, y1, y2);
    }
    /**
     * Getter for Fuel Cost over a distance
     * @param distance distance
     * @return cost of fuel
     */
    public int getFuelCost(int distance) { return travel.calculateFuel(distance); }
    /**
     * Method to update fuel used in ship stats
     * @param fuelUse fuel used
     */
    public void useFuel(int fuelUse) { shipStats.useFuel(fuelUse); }
    /**
     * Getter for ships Health
     * @return how much Health is left
     */
    public int getHealth() { return shipStats.getHealth(); }

    void setHealth(int health) {
        shipStats.setHealth(health);
    }
    /**
     * Getter for Fuel
     * @return amount of fuel left
     */
    public int getFuel() {return shipStats.getFuel(); }

    int getSpeed() {return shipStats.getSpeed();}

    int getLaser() {return shipStats.getLaser();}
    /**
     * Boolean Method to check if there are Pirates
     * @return true if pirates are present
     */
    public boolean pirateCheck() {
        return rE.encounterPirates();
    }
    /**
     * Boolean Method to check if there are Police
     * @return true if police are present
     */
    public boolean policeCheck() {
        return rE.encounterPolice();
    }
    /**
     * Boolean Method to check if there are Traders
     * @return true if traders are present
     */
    public boolean traderCheck() {
        return rE.encounterTraders();
    }

    int getNumNarcotics() {
        return inventory.getNumNarcotics();
    }
    /**
     * getter method for Credits
     * @return the amount of credits tbe player has
     */
    public int getCredits() {
        return player.getCredits();
    }

    String getShipName() {
        return player.getShipString();
    }

    void deposit(int amount) {
        bank.deposit(amount);
    }

    void withdraw(int amount) {
        bank.withdraw(amount);
    }

    int getBankCredits() {
        return bank.getBankCredits();
    }

    void setBankCredits(int amount) {bank.setBankCredits(amount);}

    void updateInterest() {bank.addInterest();}

    void refuelShip() {shipStats.refillFuel();}

    void upgradeSpeed() {shipStats.upgradeSpeed();}

    void upgradeLaser() {shipStats.upgradeLaser();}

    void fixShip() {shipStats.fixShip();}

}
