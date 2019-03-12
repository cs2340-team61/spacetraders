package edu.gatech.cs2340;

public class Game {
    private Difficulty gameDiff;
    private Player player;
    private Universe universe;
    SolarSystem[] sols;
    Planet[] plans = new Planet[15];
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

    public Game() {

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
}
