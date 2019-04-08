package edu.gatech.cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShipInventoryActivity extends AppCompatActivity {
    private final MarketViewModel marketViewModel = new MarketViewModel(getApplication());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_inventory);

        TextView water = findViewById(R.id.water_Quanitity2);
        TextView furs = findViewById(R.id.furs_Quantity2);
        TextView food = findViewById(R.id.food_Quantity2);
        TextView ore = findViewById(R.id.ore_Quantity2);
        TextView games = findViewById(R.id.games_Quanity6);
        TextView firearms = findViewById(R.id.games_Quanity10);
        TextView medicine = findViewById(R.id.medicine_Quanity2);
        TextView machines = findViewById(R.id.textView75);
        TextView narcotics = findViewById(R.id.games_Quanity5);
        TextView robots = findViewById(R.id.robots_Quanity2);
        Button cancel = findViewById(R.id.cancel);

        ShipInventory inventory = getInventory();
        water.setText("" + getWaterNum(inventory));
        furs.setText("" + getFursNum(inventory));
        food.setText("" + getFoodNum(inventory));
        ore.setText("" + getOreNum(inventory));
        games.setText("" + getGamesNum(inventory));
        firearms.setText("" + getFirearmsNum(inventory));
        medicine.setText("" + getMedicineNum(inventory));
        machines.setText("" + getMachinesNum(inventory));
        narcotics.setText("" + getNarcoticsNum(inventory));
        robots.setText("" + getRobotsNum(inventory));

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private ShipInventory getInventory() {
        return marketViewModel.getInventory();
    }

    private int getWaterNum(ShipInventory inventory) {
        return inventory.getNumWater();
    }

    private int getFursNum(ShipInventory inventory) {
        return inventory.getNumFurs();
    }

    private int getFoodNum(ShipInventory inventory) {
        return inventory.getNumFood();
    }

    private int getOreNum(ShipInventory inventory) {
        return inventory.getNumOre();
    }

    private int getGamesNum(ShipInventory inventory) {
        return inventory.getNumGames();
    }

    private int getFirearmsNum(ShipInventory inventory) {
        return inventory.getNumFirearms();
    }

    private int getMedicineNum(ShipInventory inventory) {
        return inventory.getNumMedicine();
    }

    private int getMachinesNum(ShipInventory inventory) {
        return inventory.getNumMachines();
    }

    private int getNarcoticsNum(ShipInventory inventory) {
        return inventory.getNumNarcotics();
    }

    private int getRobotsNum(ShipInventory inventory) {
        return inventory.getNumRobots();
    }
}
