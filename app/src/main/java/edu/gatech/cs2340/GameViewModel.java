package edu.gatech.cs2340;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameViewModel extends AndroidViewModel {
    private Game model;

    public GameViewModel(@NonNull Application application) {
        super(application);
        model = Model.getInstance().getMyGame();
    }

    public void createGame(String playerName, int sE, int sP, int sF, int sT, Difficulty dif) {
        Universe universe = new Universe();
        Player player = new Player(playerName, sE, sP, sF, sT);
        setGameDiff(dif);
        setPlayer(player);
        setUniverse(universe);
        model.addS();
        setInventory(new ShipInventory());
        Player tempPlayer = getPlayer();
        Universe tempUniverse = getUniverse();
        Log.d("APP", tempPlayer.toString());
        Log.d("APP", tempUniverse.toString());
    }

    public boolean saveGame() {
        try {
            FileOutputStream file = getApplication().openFileOutput("game.ser", Context.MODE_PRIVATE);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);
            outputStream.writeObject(model);
            outputStream.close();
            file.close();
            return true;
        } catch (IOException e) {
            Log.e("APP", "Error saving game", e);
        }
        return false;
    }

    public boolean resumeSavedGame() {
        try {
            FileInputStream file = getApplication().openFileInput("game.ser");
            ObjectInputStream inputStream = new ObjectInputStream(file);
            Game g = (Game) inputStream.readObject();
            inputStream.close();
            file.close();
            model = g;
            Model.getInstance().setMyGame(g);
            return true;
        } catch (IOException e) {
            Log.e("APP", "Error opening game save file.", e);
        } catch (ClassNotFoundException e) {
            Toast.makeText(getApplication(), "Error while opening saved game", Toast.LENGTH_LONG);
            Log.e("APP", "ClassNotFoundException while loading saved game.", e);
        }
        return false;
    }

    private void setGameDiff(Difficulty diff) {
        model.setGameDiff(diff);
    }

    private void setPlayer(Player player) {
        model.setPlayer(player);
    }

    private void setUniverse(Universe universe) {
        model.setUniverse(universe);
    }

    private void setInventory(ShipInventory inventory) {
        model.setInventory(inventory);
    }

    private Player getPlayer() {
        return model.getPlayer();
    }

    private Universe getUniverse() {
        return model.getUniverse();
    }

    public Planet getPlayerLocation() {
        return model.getPlayerLocation();
    }


}
