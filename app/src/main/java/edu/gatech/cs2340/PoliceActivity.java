package edu.gatech.cs2340;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * class that shows the UI for randomly encountering the police
 */
public class PoliceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.space); mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);

        Button flee;
        Button stop;

        flee = findViewById(R.id.fleeButton);
        stop = findViewById(R.id.acceptFate);

        flee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                if (1 == random.nextInt(2)) {
                    restartMain();
                    finish();
                } else {
                    gotCaught();
                    finish();
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                if (1 == random.nextInt(2)) {
                    restartMain();
                    finish();
                } else {
                    gotCaught();
                    finish();
                }
            }
        });
    }

    private void restartMain() {
        Intent intent = new Intent(this,GameMainActivity.class);
        startActivity(intent);
    }

    private void gotCaught() {
        Intent intent = new Intent(this,PoliceCaughtActivity.class);
        startActivity(intent);
    }
}
