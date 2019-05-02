package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ShipStatsActivity extends AppCompatActivity {
    private final TravelViewModel travelViewModel = new TravelViewModel(getApplication());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_stats);

        final TextView health = findViewById(R.id.healthNum);
        final TextView laser = findViewById(R.id.laserNum);
        final TextView speed = findViewById(R.id.speedNum);
        final TextView fuel = findViewById(R.id.fuelNum);
        TextView refuelC = findViewById(R.id.refuelC);
        Button refuel = findViewById(R.id.refuel);
        Button upgradeLaser = findViewById(R.id.upgradeL);
        Button upgradeSpeed = findViewById(R.id.upgradeS);
        Button fixShip = findViewById(R.id.upgradeH);
        Button exit = findViewById(R.id.exit);

        health.setText("" + travelViewModel.getHealth());
        laser.setText("" + travelViewModel.getLaser());
        speed.setText("" + travelViewModel.getSpeed());
        fuel.setText("" + travelViewModel.getFuel());
        refuelC.setText("" + (travelViewModel.getFuel() * 2));

        refuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(travelViewModel.getCredits() >= (travelViewModel.getFuel() * 2)) {
                    travelViewModel.refuelShip();
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }

                fuel.setText("" + travelViewModel.getFuel());
            }
        });

        upgradeLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(travelViewModel.getCredits() >= 100) {
                    travelViewModel.upgradeLaser();
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }

                laser.setText("" + travelViewModel.getLaser());
            }
        });

        upgradeSpeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(travelViewModel.getCredits() >= 100) {
                    travelViewModel.upgradeSpeed();
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }

                speed.setText("" + travelViewModel.getSpeed());
            }
        });

        fixShip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (travelViewModel.getCredits() >= 100) {
                    travelViewModel.fixShip();
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }

                health.setText("" + travelViewModel.getHealth());
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainGame();
                finish();
            }
        });
    }

    private void mainGame() {
        Intent intent = new Intent(this, GameMainActivity.class);
        startActivity(intent);
    }
}
