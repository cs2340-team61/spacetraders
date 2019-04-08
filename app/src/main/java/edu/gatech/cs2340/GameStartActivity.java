package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameStartActivity extends AppCompatActivity {
    private GameViewModel gameViewModel;
    private TextView startMessage;
    //private Button goBank;
    private Button goMarket;
    private Button goTravel;
    //private Button viewShip;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start_activity);

        startMessage = findViewById(R.id.start_msg);
        goMarket = findViewById(R.id.button2);
        //goBank = findViewById(R.id.button);
        goTravel = findViewById(R.id.button4);
        //viewShip = findViewById(R.id.button5);
        exit = findViewById(R.id.button3);
        gameViewModel = new GameViewModel(getApplication());

        Planet planet = getPlayerLocation();
        startMessage.setText("Welcome Trader! You are currently located on the planet " + planet.getPlanetName()
                + " and you have started with a Gnat Ship, 1000 credits.\n What to do?");


        goMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marketplace();
                finish();
            }
        });

        goTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel();
                finish();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void marketplace() {
        Intent intent = new Intent(this, MarketplaceActivity.class);
        startActivity(intent);
    }

    private void travel() {
        Intent intent = new Intent(this, TravelActivity.class);
        startActivity(intent);
    }

    private Planet getPlayerLocation() {
        return gameViewModel.getPlayerLocation();
    }
}
