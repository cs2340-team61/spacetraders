package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);

        final GameViewModel gameViewModel;
        TextView startMessage;
        Button goBank;
        Button goMarket;
        Button goTravel;
        Button viewShip;
        Button saveGame;
        Button exit;

        startMessage = findViewById(R.id.start_msg);
        goBank = findViewById(R.id.button);
        goMarket = findViewById(R.id.button2);
        goTravel = findViewById(R.id.button4);
        viewShip = findViewById(R.id.button5);
        saveGame = findViewById(R.id.button8);
        exit = findViewById(R.id.button3);
        gameViewModel = new GameViewModel(getApplication());

        startMessage.setText("Welcome Trader! You are currently located on the planet " + gameViewModel.getPlayerLocation().getPlanetName()
                + " and you have started with a Gnat Ship, 1000 credits.\n What to do?");

        goMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marketplace(v);
            }
        });

        goTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                travel(v);
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
                    Toast.makeText(getApplication(), "Could not save game", Toast.LENGTH_LONG).show();
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

    public void marketplace(View view) {
        Intent intent = new Intent(this, MarketplaceActivity.class);
        startActivity(intent);
    }

    public void travel(View view) {
        Intent intent = new Intent(this, TravelActivity.class);
        startActivity(intent);
    }
}
