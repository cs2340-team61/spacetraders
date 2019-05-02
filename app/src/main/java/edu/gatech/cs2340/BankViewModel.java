package edu.gatech.cs2340;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class BankViewModel extends AndroidViewModel {
    private Game model;

    BankViewModel(@NonNull Application application) {
        super(application);
        Model modelInstance = Model.getInstance();
        model = getGame(modelInstance);
    }

    private Game getGame(Model model) {
        return model.getMyGame();
    }

    void deposit(int amount) {
        Player player = model.getPlayer();
        player.setCredits(player.getCredits() - amount);
        model.deposit(amount);
    }

    void withdraw(int amount) {
        Player player = model.getPlayer();
        player.setCredits(player.getCredits() + amount);
        model.withdraw(amount);
    }

    int getCredits() {
        return model.getCredits();
    }

    int getBankCredits() {
        return model.getBankCredits();
    }

    void setCredits(int amount) { model.getPlayer().setCredits(amount);}

    void setBankCredits(int amount) {model.setBankCredits(amount);}


}
