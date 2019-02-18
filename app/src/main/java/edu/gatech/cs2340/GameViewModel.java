package edu.gatech.cs2340;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.util.Log;

public class GameViewModel extends AndroidViewModel {
    public GameViewModel(@NonNull Application application) {
        super(application);
    }

    public void createGame(String playerName, int sE, int sP, int sF, int sT, Difficulty dif) {
        Player player = new Player(playerName, sE, sP, sF, sT);
        Game game = new Game(dif, player);
        Log.d("APP", game.getPlayer().toString());
    }
}
