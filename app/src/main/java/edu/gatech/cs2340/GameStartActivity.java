package edu.gatech.cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class GameStartActivity extends AppCompatActivity {
    private GameViewModel gameViewModel;
    private TextView startMessage;
    private Button goBank;
    private Button goMarket;
    private Button goTravel;
    private Button viewShip;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start_activity);

        startMessage = findViewById(R.id.start_msg);
        goBank = findViewById(R.id.button);
        goMarket = findViewById(R.id.button2);
        goTravel = findViewById(R.id.button4);
        viewShip = findViewById(R.id.button5);
        exit = findViewById(R.id.button3);
        gameViewModel = new GameViewModel(getApplication());

        startMessage.setText("Welcome Trader! You are currently located on the planet " + gameViewModel.getPlayerLocation().getPlanetName()
                + " and you have started with a Gnat Ship, 1000 credits.\n What to do?");
    }
}
