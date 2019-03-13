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
            quantArr[0] = ((rand.nextInt(31)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(31)) + 20) * 20 + rand.nextInt(10);
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
            quantArr[0] = ((rand.nextInt(31)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(31)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(31)) + 20) * 25 + rand.nextInt(10);
            quantArr[3] = 0;
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Medieval")) {
            quantArr[0] = ((rand.nextInt(31)) + 20) * 30 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(31)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(31)) + 20) * 5 + rand.nextInt(10);
            quantArr[4] = 0;
            quantArr[5] = 0;
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Renaissance")) {
            quantArr[0] = ((rand.nextInt(31)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(31)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = (rand.nextInt(31))  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(31)) + 20)  + rand.nextInt(10);
            quantArr[6] = 0;
            quantArr[7] = 0;
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Early Industrial")) {
            quantArr[0] = ((rand.nextInt(31)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(31)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(31)) + 10) * 3  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(31)) + 20) * 4  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(31)) + 5) * 2  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(31)) + 5)  + rand.nextInt(10);
            quantArr[8] = 0;
            quantArr[9] = 0;
        }
        if (tech.equals("Industrial")) {
            quantArr[0] = ((rand.nextInt(31)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(31)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(21)) + 10)  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(31)) + 20) * 6  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(21)) + 20) * 4  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(31)) + 20) * 6  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(21)) + 20) * 5  + rand.nextInt(10);
            quantArr[9] = 0;
        }
        if (tech.equals("Post-Industrial")) {
            quantArr[0] = ((rand.nextInt(31)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(31)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(31)) + 20) * 10  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(31)) + 20) * 3  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(21)) + 20) * 8  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(31)) + 20) * 4  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(21)) + 20) * 2  + rand.nextInt(10);
            quantArr[9] = ((rand.nextInt(16)) + 20)  + rand.nextInt(10);
        }
        if (tech.equals("Hi-Tech")) {
            quantArr[0] = ((rand.nextInt(31)) + 20) * 20 + rand.nextInt(10);
            quantArr[1] = ((rand.nextInt(31)) + 20) * 10 + rand.nextInt(10);
            quantArr[2] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[3] = ((rand.nextInt(31)) + 20) * 15 + rand.nextInt(10);
            quantArr[4] = ((rand.nextInt(31)) + 20) * 6  + rand.nextInt(10);
            quantArr[5] = ((rand.nextInt(31)) + 20) * 2  + rand.nextInt(10);
            quantArr[6] = ((rand.nextInt(21)) + 20) * 4  + rand.nextInt(10);
            quantArr[7] = ((rand.nextInt(31)) + 20) * 4  + rand.nextInt(10);
            quantArr[8] = ((rand.nextInt(21)) + 20) * 2  + rand.nextInt(10);
            quantArr[9] = ((rand.nextInt(16)) + 20) * 3  + rand.nextInt(10);
        }

        return quantArr;
    }

    public Integer[] getPrices() {
        String tech = model.getPlayerLocation().getTechLevel();
        Integer[] priceArr = new Integer[11];
        Random rand = new Random();
        if (tech.equals("Pre-Agriculture")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();

        }
        if (tech.equals("Agriculture")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
        }
        if (tech.equals("Medieval")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = model.getOrePrice();
        }
        if (tech.equals("Renaissance")) {
            priceArr[0] = model.getWaterPrice();
            priceArr[1] = model.getFursPrice();
            priceArr[2] = model.getFoodPrice();
            priceArr[3] = model.getOrePrice();
            priceArr[4] = model.getGamesPrice();
            priceArr[5] = model.getFirearmsPrice();
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
}
