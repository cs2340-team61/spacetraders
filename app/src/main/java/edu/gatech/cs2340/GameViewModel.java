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

class GameViewModel extends AndroidViewModel {
    private Game model;

    public GameViewModel(@NonNull Application application) {
        super(application);
        Model modelInstance = Model.getInstance();
        model = modelInstance.getMyGame();
    }

    public void createGame(String playerName, int[] skillArray, Difficulty dif) {
        Universe universe = new Universe();
        Player player = new Player(playerName, skillArray[0], skillArray[1],
                skillArray[2], skillArray[3]);
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
            FileOutputStream file = getApplication().openFileOutput("game.ser",
                    Context.MODE_PRIVATE);
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
            Model modelInstance = Model.getInstance();
            modelInstance.setMyGame(g);
            return true;
        } catch (IOException e) {
            Log.e("APP", "Error opening game save file.", e);
        } catch (ClassNotFoundException e) {
            Toast.makeText(getApplication(), "Error while opening saved game",
                    Toast.LENGTH_LONG).show();
            Log.e("APP", "ClassNotFoundException while loading saved game.", e);
        }
        return false;
    }

    private void setGameDiff(Difficulty diff) {
        model.setGameDiff(diff);
    }

    public Difficulty getDifficulty() {return model.getGameDiff();}

    private void setPlayer(Player player) {
        model.setPlayer(player);
    }

    private void setUniverse(Universe universe) {
        model.setUniverse(universe);
    }

    private void setInventory(ShipInventory inventory) {
        model.setInventory(inventory);
    }

    public Player getPlayer() {
        return model.getPlayer();
    }

    private Universe getUniverse() {
        return model.getUniverse();
    }

    public Planet getPlayerLocation() {
        return model.getPlayerLocation();
    }


}
