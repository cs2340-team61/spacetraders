package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PirateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pirate);

        final TravelViewModel travelViewModel = new TravelViewModel(getApplication());
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
                            travelViewModel.getLaser()));
                    conText.setText("You dealt 50 damage to the Pirate");
                }

                if (random.nextInt(3) == random.nextInt(3)) {
                    playerHealth.setText("" + (Integer.parseInt(playerHealth.getText().toString()) -
                            (travelViewModel.getLaser() * 2 / 3)));
                    travelViewModel.setHealth(Integer.parseInt(playerHealth.getText().toString()));

                }

                if (travelViewModel.getHealth() <= 0) {
                    gameOver(v);
                    finish();
                }

                if (Integer.parseInt(pirateHealth.getText().toString()) <= 0) {
                    restartMain(v);
                    finish();
                }
            }
        });

        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                if (travelViewModel.getSpeed() < random.nextInt(100)) {
                    restartMain(v);
                    finish();
                } else {
                    conText.setText("You failed to escape");
                    if (random.nextInt(3) == random.nextInt(3)) {
                        playerHealth.setText("" + (Integer.parseInt(playerHealth.getText().toString()) -
                                (travelViewModel.getLaser() * 2 / 3)));

                        if (travelViewModel.getHealth() <= 0) {
                            gameOver(v);
                            finish();
                        }
                    }
                }
            }
        });


    }

    public void restartMain(View view) {
        Intent intent = new Intent(this,GameMainActivity.class);
        startActivity(intent);
    }

    public void gameOver(View view) {
        Intent intent = new Intent(this,PirateLoseActivity.class);
        startActivity(intent);
    }
}
