package edu.gatech.cs2340;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import java.util.Random;

public class MarketViewModel extends AndroidViewModel {
    private Game model;

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
        Integer[] quantArr = new Integer[11];
        Random rand = new Random();
        if (tech.equals("Pre-Agriculture")) {
            quantArr[0] = ((rand.nextInt(11)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(11)) + 20) * 20 + rand.nextInt(10);
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
            quantArr[0] = ((rand.nextInt(11)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(11)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(11)) + 20) * 25 + rand.nextInt(10);
            quantArr[3] = 0;
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Medieval")) {
            quantArr[0] = ((rand.nextInt(11)) + 20) * 30 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(11)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(11)) + 20) * 5 + rand.nextInt(10);
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Renaissance")) {
            quantArr[0] = ((rand.nextInt(11)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(11)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = (rand.nextInt(11))  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(11)) + 20)  + rand.nextInt(10);
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Early Industrial")) {
            quantArr[0] = ((rand.nextInt(11)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(11)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(11)) + 10) * 3  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(11)) + 20) * 4  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(11)) + 5) * 2  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(11)) + 5)  + rand.nextInt(10);
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Industrial")) {
            quantArr[0] = ((rand.nextInt(11)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(11)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(13)) + 10)  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(11)) + 20) * 6  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(13)) + 20) * 4  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(11)) + 20) * 6  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(13)) + 20) * 5  + rand.nextInt(10);
            quantArr[9] = 0;
        }
        if (tech.equals("Post-Industrial")) {
            quantArr[0] = ((rand.nextInt(11)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(11)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(11)) + 20) * 10  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(11)) + 20) * 3  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(13)) + 20) * 8  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(11)) + 20) * 4  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(13)) + 20) * 2  + rand.nextInt(10);
            quantArr[9] = ((rand.nextInt(8)) + 20)  + rand.nextInt(10);
        }
        if (tech.equals("Hi-Tech")) {
            quantArr[0] = ((rand.nextInt(11)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(11)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(11)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(11)) + 20) * 6  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(11)) + 20) * 2  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(13)) + 20) * 4  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(11)) + 20) * 4  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(13)) + 20) * 2  + rand.nextInt(10);
            quantArr[9] = ((rand.nextInt(8)) + 20) * 3  + rand.nextInt(10);
        }

        return quantArr;
    }

    public Integer[] getPrices() {
        String tech = model.getPlayerLocation().getTechLevel();
        Integer[] priceArr = new Integer[11];
        if (tech.equals("Pre-Agriculture")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
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
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = 0;
            priceArr[4] = 0;
            priceArr[5] = 0;
            priceArr[6] = 0;
            priceArr[7] = 0;
            priceArr[8] = 0;
            priceArr[9] = 0;
        }
        if (tech.equals("Medieval")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = model.getOrePrice();
            priceArr[4] = 0;
            priceArr[5] = 0;
            priceArr[6] = 0;
            priceArr[7] = 0;
            priceArr[8] = 0;
            priceArr[9] = 0;
        }
        if (tech.equals("Renaissance")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = model.getOrePrice();
            priceArr[4] = model.getGamesPrice();
            priceArr[5] = model.getFirearmsPrice();
            priceArr[6] = 0;
            priceArr[7] = 0;
            priceArr[8] = 0;
            priceArr[9] = 0;
        }
        if (tech.equals("Early Industrial")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = model.getOrePrice();
            priceArr[4] = model.getGamesPrice();
            priceArr[5] = model.getFirearmsPrice();
            priceArr[6] = model.getMedicinePrice();
            priceArr[7] = model.getMachinesPrice();
            priceArr[8] = 0;
            priceArr[9] = 0;
        }
        if (tech.equals("Industrial")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = model.getOrePrice();
            priceArr[4] = model.getGamesPrice();
            priceArr[5] = model.getFirearmsPrice();
            priceArr[6] = model.getMedicinePrice();
            priceArr[7] = model.getMachinesPrice();
            priceArr[8] = model.getNarcoticsPrice();
            priceArr[9] = 0;
        }
        if (tech.equals("Post-Industrial")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = model.getOrePrice();
            priceArr[4] = model.getGamesPrice();
            priceArr[5] = model.getFirearmsPrice();
            priceArr[6] = model.getMedicinePrice();
            priceArr[7] = model.getMachinesPrice();
            priceArr[8] = model.getNarcoticsPrice();
            priceArr[9] = model.getRobotsPrice();
        }
        if (tech.equals("Hi-Tech")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = model.getOrePrice();
            priceArr[4] = model.getGamesPrice();
            priceArr[5] = model.getFirearmsPrice();
            priceArr[6] = model.getMedicinePrice();
            priceArr[7] = model.getMachinesPrice();
            priceArr[8] = model.getNarcoticsPrice();
            priceArr[9] = model.getRobotsPrice();
        }

        return priceArr;
    }

    public ShipInventory getInventory() { return model.getInventory(); }

    public void addWater(int add) {
        model.getInventory().addWater(add);
    }

    public void addFurs(int add) {
        model.getInventory().addFurs(add);
    }

    public void addFood(int add) {
        model.getInventory().addFood(add);
    }

    public void addOre(int add) {
        model.getInventory().addOre(add);
    }

    public void addGames(int add) {
        model.getInventory().addGames(add);
    }

    public void addFirearms(int add) {
        model.getInventory().addFirearms(add);
    }

    public void addMedicine(int add) {
        model.getInventory().addMedicine(add);
    }

    public void addMachines(int add) { model.getInventory().addMachines(add); }

    public void addNarcotics(int add) {
        model.getInventory().addNarcotics(add);
    }

    public void addRobots(int add) {
        model.getInventory().addRobots(add);
    }

    public void removeWater(int add) {
        model.getInventory().removeWater(add);
    }

    public void removeFurs(int add) {
        model.getInventory().removeFurs(add);
    }

    public void removeFood(int add) {
        model.getInventory().removeFood(add);
    }

    public void removeOre(int add) { model.getInventory().removeOre(add); }

    public void removeGames(int add) { model.getInventory().removeGames(add); }

    public void removeFirearms(int add) { model.getInventory().removeFirearms(add); }

    public void removeMedicine(int add) { model.getInventory().removeMedicine(add); }

    public void removeMachines(int add) { model.getInventory().removeMachines(add); }

    public void removeNarcotics(int add) { model.getInventory().removeNarcotics(add); }

    public void removeRobots(int add) { model.getInventory().removeRobots(add); }

    public int getMaxCargo() { return model.getInventory().getMaxCargo(); }

    public void updateInventorySize() {
        int size = model.getInventory().getNumWater() + model.getInventory().getNumFurs() + model.getInventory().getNumFood()
                + model.getInventory().getNumOre() + model.getInventory().getNumGames() + model.getInventory().getNumFirearms()
                + model.getInventory().getNumMedicine() + model.getInventory().getNumMachines() + model.getInventory().getNumNarcotics()
                + model.getInventory().getNumRobots();
        model.getInventory().setSize(size);
    }

    public int getInventorySize() {
        return model.getInventory().getSize();
    }

}
