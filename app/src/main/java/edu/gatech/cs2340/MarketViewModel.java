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

    MarketViewModel(@NonNull Application application) {
        super(application);
        Model modelInstance = Model.getInstance();
        model = getGame(modelInstance);
    }

    void createMarket() {
        model.createMarketGoods();
        model.createMarketplace();
    }

    int getCredits() {
        return model.getCredits();
    }

    void setCredits(int cred) {
        Player player = model.getPlayer();
        setCredits(player, cred);
    }

    Integer[] quantityMarket() {
        Planet planet = model.getPlayerLocation();
        String tech = getTechLevel(planet);
        Integer[] quantArr = new Integer[bigB];
        Random rand = new Random();
        if ("Pre-Agriculture".equals(tech)) {
            quantArr[0] = (((rand.nextInt(bigB)) + addB) * addB) + rand.nextInt(10);
            quantArr[1] = (((rand.nextInt(bigB)) + addB) * addB) + rand.nextInt(10);
            quantArr[2] = 0;
            quantArr[3] = 0;
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if ("Agriculture".equals(tech)) {
            quantArr[0] = (((rand.nextInt(bigB)) + addB) * addB) + rand.nextInt(10);
            quantArr[1] = (((rand.nextInt(bigB)) + addB) * 10) + rand.nextInt(10);
            quantArr[2] = (((rand.nextInt(bigB)) + addB) * magic25) + rand.nextInt(10);
            quantArr[3] = 0;
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if ("Medieval".equals(tech)) {
            quantArr[0] = (((rand.nextInt(bigB)) + addB) * magic30) + rand.nextInt(10);
            quantArr[1] = (((rand.nextInt(bigB)) + addB) * 10) + rand.nextInt(10);
            quantArr[2] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[3] = (((rand.nextInt(bigB)) + addB) * 5) + rand.nextInt(10);
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if ("Renaissance".equals(tech)) {
            quantArr[0] = (((rand.nextInt(bigB)) + addB) * addB) + rand.nextInt(10);
            quantArr[1] = (((rand.nextInt(bigB)) + addB) * 10) + rand.nextInt(10);
            quantArr[2] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[3] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[4] = (rand.nextInt(bigB))  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(bigB)) + addB)  + rand.nextInt(10);
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if ("Early Industrial".equals(tech)) {
            quantArr[0] = (((rand.nextInt(bigB)) + addB) * addB) + rand.nextInt(10);
            quantArr[1] = (((rand.nextInt(bigB)) + addB) * 10) + rand.nextInt(10);
            quantArr[2] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[3] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[4] = (((rand.nextInt(bigB)) + 10) * 3) + rand.nextInt(10);
            quantArr[5] = (((rand.nextInt(bigB)) + addB) * 4) + rand.nextInt(10);
            quantArr[6] = (((rand.nextInt(bigB)) + 5) * 2) + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(bigB)) + 5)  + rand.nextInt(10);
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if ("Industrial".equals(tech)) {
            quantArr[0] = (((rand.nextInt(bigB)) + addB) * addB) + rand.nextInt(10);
            quantArr[1] = (((rand.nextInt(bigB)) + addB) * 10) + rand.nextInt(10);
            quantArr[2] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[3] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(biggerB)) + 10)  + rand.nextInt(10);
            quantArr[5] = (((rand.nextInt(bigB)) + addB) * 6) + rand.nextInt(10);
            quantArr[6] = (((rand.nextInt(biggerB)) + addB) * 4) + rand.nextInt(10);
            quantArr[7] = (((rand.nextInt(bigB)) + addB) * 6) + rand.nextInt(10);
            quantArr[8] = (((rand.nextInt(biggerB)) + addB) * 5) + rand.nextInt(10);
            quantArr[9] = 0;
        }
        if ("Post-Industrial".equals(tech)) {
            quantArr[0] = (((rand.nextInt(bigB)) + addB) * addB) + rand.nextInt(10);
            quantArr[1] = (((rand.nextInt(bigB)) + addB) * 10) + rand.nextInt(10);
            quantArr[2] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[3] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[4] = (((rand.nextInt(bigB)) + addB) * 10) + rand.nextInt(10);
            quantArr[5] = (((rand.nextInt(bigB)) + addB) * 3) + rand.nextInt(10);
            quantArr[6] = (((rand.nextInt(biggerB)) + addB) * 8) + rand.nextInt(10);
            quantArr[7] = (((rand.nextInt(bigB)) + addB) * 4) + rand.nextInt(10);
            quantArr[8] = (((rand.nextInt(biggerB)) + addB) * 2) + rand.nextInt(10);
            quantArr[9] = ((rand.nextInt(8)) + addB)  + rand.nextInt(10);
        }
        if ("Hi-Tech".equals(tech)) {
            quantArr[0] = (((rand.nextInt(bigB)) + addB) * addB) + rand.nextInt(10);
            quantArr[1] = (((rand.nextInt(bigB)) + addB) * 10) + rand.nextInt(10);
            quantArr[2] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[3] = (((rand.nextInt(bigB)) + addB) * otherB) + rand.nextInt(10);
            quantArr[4] = (((rand.nextInt(bigB)) + addB) * 6) + rand.nextInt(10);
            quantArr[5] = (((rand.nextInt(bigB)) + addB) * 2) + rand.nextInt(10);
            quantArr[6] = (((rand.nextInt(biggerB)) + addB) * 4) + rand.nextInt(10);
            quantArr[7] = (((rand.nextInt(bigB)) + addB) * 4) + rand.nextInt(10);
            quantArr[8] = (((rand.nextInt(biggerB)) + addB) * 2) + rand.nextInt(10);
            quantArr[9] = (((rand.nextInt(8)) + addB) * 3) + rand.nextInt(10);
        }

        return quantArr;
    }

    Integer[] getPrices() {
        Planet planet = model.getPlayerLocation();
        String tech = getTechLevel(planet);
        Integer[] priceArr = new Integer[bigB];
        if ("Pre-Agriculture".equals(tech)) {
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
        if ("Agriculture".equals(tech)) {
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
        if ("Medieval".equals(tech)) {
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
        if ("Renaissance".equals(tech)) {
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
        if ("Early Industrial".equals(tech)) {
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
        if ("Industrial".equals(tech)) {
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
        if ("Post-Industrial".equals(tech)) {
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
        if ("Hi-Tech".equals(tech)) {
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
        ShipInventory inventory = getInventory();
        addWaterHelp(inventory, add);
    }

    void addFurs(int add) {
        ShipInventory inventory = getInventory();
        addFursHelp(inventory, add);
    }

    void addFood(int add) {
        ShipInventory inventory = getInventory();
        addFoodHelp(inventory, add);
    }

    void addOre(int add) {
        ShipInventory inventory = getInventory();
        addOreHelp(inventory, add);
    }

    void addGames(int add) {
        ShipInventory inventory = getInventory();
        addGamesHelp(inventory, add);
    }

    void addFirearms(int add) {
        ShipInventory inventory = getInventory();
        addFirearmsHelp(inventory, add);
    }

    void addMedicine(int add) {
        ShipInventory inventory = getInventory();
        addMedicineHelp(inventory, add);
    }

    void addMachines(int add) {
        ShipInventory inventory = getInventory();
        addMachinesHelp(inventory, add); }

    void addNarcotics(int add) {
        ShipInventory inventory = getInventory();
        addNarcoticsHelp(inventory, add);
    }

    void addRobots(int add) {
        ShipInventory inventory = getInventory();
        addRobotsHelp(inventory, add);
    }

    void removeWater(int add) {
        ShipInventory inventory = getInventory();
        removeWaterHelp(inventory, add);
    }

    void removeFurs(int add) {
        ShipInventory inventory = getInventory();
        removeFursHelp(inventory, add);
    }

    void removeFood(int add) {
        ShipInventory inventory = getInventory();
        removeFoodHelp(inventory, add);
    }

    void removeOre(int add) {
        ShipInventory inventory = getInventory();
        removeOreHelp(inventory, add);
    }

    void removeGames(int add) {
        ShipInventory inventory = getInventory();
        removeGamesHelp(inventory, add);
    }

    void removeFirearms(int add) {
        ShipInventory inventory = getInventory();
        removeFirearmsHelp(inventory, add);
    }

    void removeMedicine(int add) {
        ShipInventory inventory = getInventory();
        removeMedicineHelp(inventory, add);
    }

    void removeMachines(int add) {
        ShipInventory inventory = getInventory();
        removeMachinesHelp(inventory, add); }

    void removeNarcotics(int add) {
        ShipInventory inventory = getInventory();
        removeNarcoticsHelp(inventory, add);
    }

    int getNumNarcotics() {
        return model.getNumNarcotics();
    }

    void removeRobots(int add) {
        ShipInventory inventory = getInventory();
        removeRobotsHelp(inventory, add);
    }

    int getMaxCargo() {
        ShipInventory inventory = model.getInventory();
        return getMaxCargoHelp(inventory);
    }

    private int getMaxCargoHelp(ShipInventory inventory) {
        return inventory.getMaxCargo();
    }

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

        setSize(inventory, size);
    }

    int getInventorySize() {
        ShipInventory inventory = getInventory();
        return getSize(inventory);
    }

    private int getSize(ShipInventory inventory) {
        return inventory.getSize();
    }

    private void setSize(ShipInventory inventory, int size) {
        inventory.setSize(size);
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

    private Game getGame(Model model) {
        return model.getMyGame();
    }

    private void setCredits(Player player, int credits) {
        player.setCredits(credits);
    }

    private String getTechLevel(Planet planet) {
        return planet.getTechLevel();
    }

    private void addWaterHelp(ShipInventory inventory, int add) {
        inventory.addWater(add);
    }

    private void addFursHelp(ShipInventory inventory, int add) {
        inventory.addFurs(add);
    }

    private void addFoodHelp(ShipInventory inventory, int add) {
        inventory.addFood(add);
    }

    private void addOreHelp(ShipInventory inventory, int add) {
        inventory.addOre(add);
    }

    private void addGamesHelp(ShipInventory inventory, int add) {
        inventory.addGames(add);
    }

    private void addFirearmsHelp(ShipInventory inventory, int add) {
        inventory.addFirearms(add);
    }

    private void addMachinesHelp(ShipInventory inventory, int add) {
        inventory.addMachines(add);
    }

    private void addMedicineHelp(ShipInventory inventory, int add) {
        inventory.addMedicine(add);
    }

    private void addNarcoticsHelp(ShipInventory inventory, int add) {
        inventory.addNarcotics(add);
    }

    private void addRobotsHelp(ShipInventory inventory, int add) {
        inventory.addRobots(add);
    }

    private void removeWaterHelp(ShipInventory inventory, int add) {
        inventory.removeWater(add);
    }

    private void removeFursHelp(ShipInventory inventory, int add) {
        inventory.removeFurs(add);
    }

    private void removeFoodHelp(ShipInventory inventory, int add) {
        inventory.removeFood(add);
    }

    private void removeOreHelp(ShipInventory inventory, int add) {
        inventory.removeOre(add);
    }

    private void removeGamesHelp(ShipInventory inventory, int add) {
        inventory.removeGames(add);
    }

    private void removeFirearmsHelp(ShipInventory inventory, int add) {
        inventory.removeFirearms(add);
    }

    private void removeMachinesHelp(ShipInventory inventory, int add) {
        inventory.removeMachines(add);
    }

    private void removeMedicineHelp(ShipInventory inventory, int add) {
        inventory.removeMedicine(add);
    }

    private void removeNarcoticsHelp(ShipInventory inventory, int add) {
        inventory.removeNarcotics(add);
    }

    private void removeRobotsHelp(ShipInventory inventory, int add) {
        inventory.removeRobots(add);
    }






}
