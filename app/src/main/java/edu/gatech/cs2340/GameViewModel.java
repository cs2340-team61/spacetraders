package edu.gatech.cs2340;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.util.Log;

public class GameViewModel extends AndroidViewModel {
    private Game model;

    public GameViewModel(@NonNull Application application) {
        super(application);
        model = Model.getInstance().getMyGame();
    }

    public void createGame(String playerName, int sE, int sP, int sF, int sT, Difficulty dif) {
        Universe universe = new Universe();
        Player player = new Player(playerName, sE, sP, sF, sT);
        model.setGameDiff(dif);
        model.setPlayer(player);
        model.setUniverse(universe);
        model.addS();
        model.setInventory(new ShipInventory());
        Log.d("APP", model.getPlayer().toString());
        Log.d("APP", model.getUniverse().toString());
    }

    public Planet getPlayerLocation() {
        return model.getPlayerLocation();
    }


}
