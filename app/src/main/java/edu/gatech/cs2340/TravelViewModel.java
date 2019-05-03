package edu.gatech.cs2340;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

class TravelViewModel extends AndroidViewModel {
    private final Game model;
    private static final int totalPlanetNum = 15;

    public TravelViewModel(@NonNull Application application) {
        super(application);
        Model modelInstance = Model.getInstance();
        model = getGame(modelInstance);
    }

    public Planet[] getPlanets() {
        Universe tempUniverse = model.getUniverse();
        SolarSystem[] solarSystems = getSolarSystems(tempUniverse);
        Planet[] planets = new Planet[totalPlanetNum];
        int iterator = 0;
        for (int i = 0; i < 5; i++) {
            Planet[] tempPlanets = solarSystems[i].getPlanets();
            for (int j = 0; j < 3; j++) {
                planets[iterator] = tempPlanets[j];
                iterator++;
            }
        }
        return planets;
    }

    int getDistance(int x1, int x2, int y1, int y2) {
        return model.getDistance(x1, x2, y1, y2);
    }

    Planet getPlayerLocation() {
        return model.getPlayerLocation();
    }

    void updatePlayerLocation(Planet planet) {
        model.setPlayerLocation(planet);
    }

    int getFuelCost(int distance) {
        return model.getFuelCost(distance);
    }

    void updateFuel(int fuelUse) {
        model.useFuel(fuelUse);
    }

    int getHealth() {
        return model.getHealth();
    }

    void setHealth(int health) {
        model.setHealth(health);
    }

    int getFuel() {
        return model.getFuel();
    }

    int getSpeed() {return model.getSpeed();}

    int getLaser() {return model.getLaser();}

    int checkForEvent() {
        int event = 0;
        if (pirateCheck()) {
            event = 1;
        } else if (policeCheck()) {
            event = 2;
        } else if (traderCheck()) {
            event = 3;
        }

        return event;
    }

    private boolean pirateCheck() {
        return model.pirateCheck();
    }

    private boolean policeCheck() {
        return model.policeCheck();
    }

    private boolean traderCheck() {
        return model.traderCheck();
    }

    private Game getGame(Model model) {
        return model.getMyGame();
    }

    Universe getUniverse() {
        return model.getUniverse();
    }

    SolarSystem[] getSolarSystems(Universe universe) {
        return universe.getSolarSystems();
    }

    void addInterest() {model.updateInterest();}

    int getCredits() {return model.getPlayer().getCredits();}

    void refuelShip() {
        model.refuelShip();
    }

    void upgradeSpeed() {model.upgradeSpeed();}

    void upgradeLaser() {model.upgradeLaser();}

    void fixShip() {
        model.fixShip();
    }

    void updateStock() {model.updateStock();}

    int getStock1() {return model.getStock1();}

    int getStock2() {return model.getStock2();}

    int getStock3() {return model.getStock3();}

    int getStock4() {return model.getStock4();}

    int getStock5() {return model.getStock5();}

    int getStockOwned1() {return model.getStockOwned1();}

    int getStockOwned2() {return model.getStockOwned2();}

    int getStockOwned3() {return model.getStockOwned3();}

    int getStockOwned4() {return model.getStockOwned4();}

    int getStockOwned5() {return model.getStockOwned5();}

    void setStockOwned1(int amount) {model.setStockOwned1(amount);}

    void setStockOwned2(int amount) {model.setStockOwned2(amount);}

    void setStockOwned3(int amount) {model.setStockOwned3(amount);}

    void setStockOwned4(int amount) {model.setStockOwned4(amount);}

    void setStockOwned5(int amount) {model.setStockOwned5(amount);}
}
