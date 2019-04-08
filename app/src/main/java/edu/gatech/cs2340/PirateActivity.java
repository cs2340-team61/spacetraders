package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PirateActivity extends AppCompatActivity {

    private final TravelViewModel travelViewModel = new TravelViewModel(getApplication());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pirate);

        final TextView pirateHealth;
        final TextView playerHealth;
        final TextView conText;
        Button attack;
        Button run;

        pirateHealth = findViewById(R.id.pHealth);
        playerHealth = findViewById(R.id.numHealth);
        conText = findViewById(R.id.startText);
        attack = findViewById(R.id.attackButton);
        run = findViewById(R.id.runButton);

        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                if (1 == random.nextInt(2)) {
                    pirateHealth.setText("" + (Integer.parseInt(pirateHealth.getText().toString()) -
                            getLaser()));
                    conText.setText("You dealt 50 damage to the Pirate");
                } else {
                    conText.setText("Your attack missed, :(");
                }

                if (random.nextInt(3) == random.nextInt(3)) {
                    playerHealth.setText("" + (Integer.parseInt(playerHealth.getText().toString()) -
                            (getLaser() * 2 / 3)));
                    travelViewModel.setHealth(Integer.parseInt(playerHealth.getText().toString()));

                }

                if (getHealth() <= 0) {
                    gameOver();
                    finish();
                }

                if (Integer.parseInt(pirateHealth.getText().toString()) <= 0) {
                    restartMain();
                    finish();
                }
            }
        });

        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                if (getSpeed() < random.nextInt(100)) {
                    restartMain();
                    finish();
                } else {
                    conText.setText("You failed to escape");
                    if (random.nextInt(3) == random.nextInt(3)) {
                        playerHealth.setText("" + (Integer.parseInt(playerHealth.getText().toString()) -
                                (getLaser() * 2 / 3)));

                        if (getHealth() <= 0) {
                            gameOver();
                            finish();
                        }
                    }
                }
            }
        });


    }

    private void restartMain() {
        Intent intent = new Intent(this,GameMainActivity.class);
        startActivity(intent);
    }

    private void gameOver() {
        Intent intent = new Intent(this,PirateLoseActivity.class);
        startActivity(intent);
    }

    private int getHealth() {
        return travelViewModel.getHealth();
    }

    private int getLaser() {
        return travelViewModel.getLaser();
    }

    private int getSpeed() {
        return travelViewModel.getSpeed();
    }
}
