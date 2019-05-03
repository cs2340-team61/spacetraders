package edu.gatech.cs2340;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * class that shows the UI for the start screen
 */
public class GameStartActivity extends AppCompatActivity {
    private GameViewModel gameViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.space); mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start_activity);

        TextView startMessage = findViewById(R.id.start_msg);
        Button goBank;
        Button goMarket = findViewById(R.id.button2);
        goBank = findViewById(R.id.button);
        Button goTravel = findViewById(R.id.button4);
        final Button stock = findViewById(R.id.stockB);
        Button viewShip;
        viewShip = findViewById(R.id.button5);
        Button exit = findViewById(R.id.button3);
        gameViewModel = new GameViewModel(getApplication());

        String planetName = getPlanetName(getPlayerLocation());
        startMessage.setText("Welcome Trader! You are currently located on the planet " + planetName
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

        stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stock();
                finish();
            }
        });

        goBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bank();
                finish();
            }
        });

        viewShip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ship();
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

    private void bank() {
        Intent intent = new Intent(this, BankActivity.class);
        startActivity(intent);
    }

    private void ship() {
        Intent intent = new Intent(this, ShipStatsActivity.class);
        startActivity(intent);
    }

    private void stock() {
        Intent intent = new Intent(this, StockActivity.class);
        startActivity(intent);
    }

    private Planet getPlayerLocation() {
        return gameViewModel.getPlayerLocation();
    }

    private String getPlanetName(Planet planet) {
        return planet.getPlanetName();
    }
}
