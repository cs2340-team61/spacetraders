package edu.gatech.cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShipInventoryActivity extends AppCompatActivity {
    private MarketViewModel marketViewModel;
    private TextView water;
    private TextView furs;
    private TextView food;
    private TextView ore;
    private TextView games;
    private TextView firearms;
    private TextView medicine;
    private TextView machines;
    private TextView narcotics;
    private TextView robots;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_inventory);
        marketViewModel = new MarketViewModel(getApplication());

        water = findViewById(R.id.water_Quanitity2);
        furs = findViewById(R.id.furs_Quantity2);
        food = findViewById(R.id.food_Quantity2);
        ore = findViewById(R.id.ore_Quantity2);
        games = findViewById(R.id.games_Quanity6);
        firearms = findViewById(R.id.games_Quanity10);
        medicine = findViewById(R.id.medicine_Quanity2);
        machines = findViewById(R.id.textView75);
        narcotics = findViewById(R.id.games_Quanity5);
        robots = findViewById(R.id.robots_Quanity2);
        cancel = findViewById(R.id.cancel);

        water.setText("" + marketViewModel.getInventory().getNumWater());
        furs.setText("" + marketViewModel.getInventory().getNumFurs());
        food.setText("" + marketViewModel.getInventory().getNumFood());
        ore.setText("" + marketViewModel.getInventory().getNumOre());
        games.setText("" + marketViewModel.getInventory().getNumGames());
        firearms.setText("" + marketViewModel.getInventory().getNumFirearms());
        medicine.setText("" + marketViewModel.getInventory().getNumMedicine());
        machines.setText("" + marketViewModel.getInventory().getNumMachines());
        narcotics.setText("" + marketViewModel.getInventory().getNumNarcotics());
        robots.setText("" + marketViewModel.getInventory().getNumRobots());

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
