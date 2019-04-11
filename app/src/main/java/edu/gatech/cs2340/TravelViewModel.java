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
}
