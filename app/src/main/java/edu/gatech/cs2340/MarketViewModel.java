package edu.gatech.cs2340;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import java.util.Random;

class MarketViewModel extends AndroidViewModel {
    private final Game model;
    private static final int bigB = 11;
    private static final int addB = 20;
    private static final int otherB = 15;
    private static final int biggerB = 13;
    private static final int magic25 = 25;
    private static final int magic30 = 30;

    public MarketViewModel(@NonNull Application application) {
        super(application);
        model = Model.getInstance().getMyGame();
    }

    public void createMarket() {
        model.createMarketGoods();
        model.createMarketplace();
    }

    public int getCredits() {
        return model.getPlayer().getCredits();
    }

    public void setCredits(int cred) {
        model.getPlayer().setCredits(cred);
    }

    public Integer[] quantityMarket() {
        String tech = model.getPlayerLocation().getTechLevel();
        Integer[] quantArr = new Integer[bigB];
        Random rand = new Random();
        if (tech.equals("Pre-Agriculture")) {
            quantArr[0] = ((rand.nextInt(bigB)) + addB) * addB + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(bigB)) + addB) * addB + rand.nextInt(10);
            quantArr[2] = 0;
            quantArr[3] = 0;
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Agriculture")) {
            quantArr[0] = ((rand.nextInt(bigB)) + addB) * addB + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(bigB)) + addB) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(bigB)) + addB) * magic25 + rand.nextInt(10);
            quantArr[3] = 0;
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Medieval")) {
            quantArr[0] = ((rand.nextInt(bigB)) + addB) * magic30 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(bigB)) + addB) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(bigB)) + addB) * 5 + rand.nextInt(10);
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Renaissance")) {
            quantArr[0] = ((rand.nextInt(bigB)) + addB) * addB + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(bigB)) + addB) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[4] = (rand.nextInt(bigB))  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(bigB)) + addB)  + rand.nextInt(10);
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Early Industrial")) {
            quantArr[0] = ((rand.nextInt(bigB)) + addB) * addB + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(bigB)) + addB) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(bigB)) + 10) * 3  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(bigB)) + addB) * 4  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(bigB)) + 5) * 2  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(bigB)) + 5)  + rand.nextInt(10);
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Industrial")) {
            quantArr[0] = ((rand.nextInt(bigB)) + addB) * addB + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(bigB)) + addB) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(biggerB)) + 10)  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(bigB)) + addB) * 6  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(biggerB)) + addB) * 4  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(bigB)) + addB) * 6  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(biggerB)) + addB) * 5  + rand.nextInt(10);
            quantArr[9] = 0;
        }
        if (tech.equals("Post-Industrial")) {
            quantArr[0] = ((rand.nextInt(bigB)) + addB) * addB + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(bigB)) + addB) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(bigB)) + addB) * 10  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(bigB)) + addB) * 3  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(biggerB)) + addB) * 8  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(bigB)) + addB) * 4  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(biggerB)) + addB) * 2  + rand.nextInt(10);
            quantArr[9] = ((rand.nextInt(8)) + addB)  + rand.nextInt(10);
        }
        if (tech.equals("Hi-Tech")) {
            quantArr[0] = ((rand.nextInt(bigB)) + addB) * addB + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(bigB)) + addB) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(bigB)) + addB) * otherB + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(bigB)) + addB) * 6  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(bigB)) + addB) * 2  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(biggerB)) + addB) * 4  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(bigB)) + addB) * 4  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(biggerB)) + addB) * 2  + rand.nextInt(10);
            quantArr[9] = ((rand.nextInt(8)) + addB) * 3  + rand.nextInt(10);
        }

        return quantArr;
    }

    Integer[] getPrices() {
        String tech = model.getPlayerLocation().getTechLevel();
        Integer[] priceArr = new Integer[bigB];
        if (tech.equals("Pre-Agriculture")) {
            priceArr[0] = getWaterPrice();
            priceArr[1] = getFursPrice();
            priceArr[2] = 0;
            priceArr[3] = 0;
            priceArr[4] = 0;
            priceArr[5] = 0;
            priceArr[6] = 0;
            priceArr[7] = 0;
            priceArr[8] = 0;
            priceArr[9] = 0;

        }
        if (tech.equals("Agriculture")) {
            priceArr[0] = getWaterPrice();
            priceArr[1] = getFursPrice();
            priceArr[2] = getFoodPrice();
            priceArr[3] = 0;
            priceArr[4] = 0;
            priceArr[5] = 0;
            priceArr[6] = 0;
            priceArr[7] = 0;
            priceArr[8] = 0;
            priceArr[9] = 0;
        }
        if (tech.equals("Medieval")) {
            priceArr[0] = getWaterPrice();
            priceArr[1] = getFursPrice();
            priceArr[2] = getFoodPrice();
            priceArr[3] = getOrePrice();
            priceArr[4] = 0;
            priceArr[5] = 0;
            priceArr[6] = 0;
            priceArr[7] = 0;
            priceArr[8] = 0;
            priceArr[9] = 0;
        }
        if (tech.equals("Renaissance")) {
            priceArr[0] = getWaterPrice();
            priceArr[1] = getFursPrice();
            priceArr[2] = getFoodPrice();
            priceArr[3] = getOrePrice();
            priceArr[4] = getGamesPrice();
            priceArr[5] = getFirearmsPrice();
            priceArr[6] = 0;
            priceArr[7] = 0;
            priceArr[8] = 0;
            priceArr[9] = 0;
        }
        if (tech.equals("Early Industrial")) {
            priceArr[0] = getWaterPrice();
            priceArr[1] = getFursPrice();
            priceArr[2] = getFoodPrice();
            priceArr[3] = getOrePrice();
            priceArr[4] = getGamesPrice();
            priceArr[5] = getFirearmsPrice();
            priceArr[6] = getMedicinePrice();
            priceArr[7] = getMachinesPrice();
            priceArr[8] = 0;
            priceArr[9] = 0;
        }
        if (tech.equals("Industrial")) {
            priceArr[0] = getWaterPrice();
            priceArr[1] = getFursPrice();
            priceArr[2] = getFoodPrice();
            priceArr[3] = getOrePrice();
            priceArr[4] = getGamesPrice();
            priceArr[5] = getFirearmsPrice();
            priceArr[6] = getMedicinePrice();
            priceArr[7] = getMachinesPrice();
            priceArr[8] = getNarcoticsPrice();
            priceArr[9] = 0;
        }
        if (tech.equals("Post-Industrial")) {
            priceArr[0] = getWaterPrice();
            priceArr[1] = getFursPrice();
            priceArr[2] = getFoodPrice();
            priceArr[3] = getOrePrice();
            priceArr[4] = getGamesPrice();
            priceArr[5] = getFirearmsPrice();
            priceArr[6] = getMedicinePrice();
            priceArr[7] = getMachinesPrice();
            priceArr[8] = getNarcoticsPrice();
            priceArr[9] = getRobotsPrice();
        }
        if (tech.equals("Hi-Tech")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = getFursPrice();
            priceArr[2] = getFoodPrice();
            priceArr[3] = getOrePrice();
            priceArr[4] = getGamesPrice();
            priceArr[5] = getFirearmsPrice();
            priceArr[6] = getMedicinePrice();
            priceArr[7] = getMachinesPrice();
            priceArr[8] = getNarcoticsPrice();
            priceArr[9] = getRobotsPrice();
        }

        return priceArr;
    }

    ShipInventory getInventory() { return model.getInventory(); }

    void addWater(int add) {
        model.getInventory().addWater(add);
    }

    void addFurs(int add) {
        model.getInventory().addFurs(add);
    }

    void addFood(int add) {
        model.getInventory().addFood(add);
    }

    void addOre(int add) {
        model.getInventory().addOre(add);
    }

    void addGames(int add) {
        model.getInventory().addGames(add);
    }

    void addFirearms(int add) {
        model.getInventory().addFirearms(add);
    }

    void addMedicine(int add) {
        model.getInventory().addMedicine(add);
    }

    void addMachines(int add) { model.getInventory().addMachines(add); }

    void addNarcotics(int add) {
        model.getInventory().addNarcotics(add);
    }

    void addRobots(int add) {
        model.getInventory().addRobots(add);
    }

    void removeWater(int add) {
        model.getInventory().removeWater(add);
    }

    void removeFurs(int add) {
        model.getInventory().removeFurs(add);
    }

    void removeFood(int add) {
        model.getInventory().removeFood(add);
    }

    void removeOre(int add) { model.getInventory().removeOre(add); }

    void removeGames(int add) { model.getInventory().removeGames(add); }

    void removeFirearms(int add) { model.getInventory().removeFirearms(add); }

    void removeMedicine(int add) { model.getInventory().removeMedicine(add); }

    void removeMachines(int add) { model.getInventory().removeMachines(add); }

    void removeNarcotics(int add) { model.getInventory().removeNarcotics(add); }

    int getNumNarcotics() {
        return model.getNumNarcotics();
    }

    void removeRobots(int add) { model.getInventory().removeRobots(add); }

    int getMaxCargo() { return model.getInventory().getMaxCargo(); }

    void updateInventorySize() {
        ShipInventory inventory = getInventory();
        int numWater = getWaterNum(inventory);
        int numFurs = getFursNum(inventory);
        int numFood = getFoodNum(inventory);
        int numOres = getOreNum(inventory);
        int numGames = getGamesNum(inventory);
        int numFirearms = getFirearmsNum(inventory);
        int numMedicine = getMedicineNum(inventory);
        int numMachines = getMachinesNum(inventory);
        int numNarcotics = getNarcoticsNum(inventory);
        int numRobots = getRobotsNum(inventory);
        int size = numWater + numFurs + numFood + numOres + numGames + numFirearms
                + numMedicine + numMachines + numNarcotics + numRobots;
        model.getInventory().setSize(size);
    }

    int getInventorySize() {
        return model.getInventory().getSize();
    }

    private int getFoodPrice() { return model.getFoodPrice(); }

    private int getFursPrice() { return model.getFursPrice(); }

    private int getWaterPrice() { return model.getWaterPrice(); }

    private int getOrePrice() { return model.getOrePrice(); }

    private int getGamesPrice() { return model.getGamesPrice(); }

    private int getFirearmsPrice() { return model.getFirearmsPrice(); }

    private int getMedicinePrice() { return model.getMedicinePrice(); }

    private int getMachinesPrice() { return model.getMachinesPrice(); }

    private int getNarcoticsPrice() { return model.getNarcoticsPrice(); }

    private int getRobotsPrice() { return model.getRobotsPrice(); }

    private int getWaterNum(ShipInventory inventory) {
        return inventory.getNumWater();
    }

    private int getFursNum(ShipInventory inventory) {
        return inventory.getNumFurs();
    }

    private int getFoodNum(ShipInventory inventory) {
        return inventory.getNumFood();
    }

    private int getOreNum(ShipInventory inventory) {
        return inventory.getNumOre();
    }

    private int getGamesNum(ShipInventory inventory) {
        return inventory.getNumGames();
    }

    private int getFirearmsNum(ShipInventory inventory) {
        return inventory.getNumFirearms();
    }

    private int getMedicineNum(ShipInventory inventory) {
        return inventory.getNumMedicine();
    }

    private int getMachinesNum(ShipInventory inventory) {
        return inventory.getNumMachines();
    }

    private int getNarcoticsNum(ShipInventory inventory) {
        return inventory.getNumNarcotics();
    }

    private int getRobotsNum(ShipInventory inventory) {
        return inventory.getNumRobots();
    }

}
