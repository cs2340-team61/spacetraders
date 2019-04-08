package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameMainActivity extends AppCompatActivity {

    private final GameViewModel gameViewModel = new GameViewModel(getApplication());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);

        TextView startMessage;
        //Button goBank;
        Button goMarket;
        Button goTravel;
        //Button viewShip;
        Button saveGame;
        Button exit;

        startMessage = findViewById(R.id.start_msg);
        //goBank = findViewById(R.id.button);
        goMarket = findViewById(R.id.button2);
        goTravel = findViewById(R.id.button4);
        //viewShip = findViewById(R.id.button5);
        saveGame = findViewById(R.id.button8);
        exit = findViewById(R.id.button3);

        String planetName = getPlanetName();
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

        saveGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean saveSuccess = gameViewModel.saveGame();
                if (saveSuccess) {
                    Toast.makeText(getApplication(), "Game saved", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplication(), "Could not save game",
                            Toast.LENGTH_LONG).show();
                }
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

    private String getPlanetName() {
        Planet planet = getPlayerLocation();
        return planet.getPlanetName();
    }
}
