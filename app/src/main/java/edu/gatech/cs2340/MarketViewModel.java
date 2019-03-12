package edu.gatech.cs2340;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

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
}
