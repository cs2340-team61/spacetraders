package edu.gatech.cs2340;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

/**
 * class that shows the UI for randomly encountering a trader
 */
public class TraderActivity extends AppCompatActivity {
    private static final int magic500 = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.space); mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trader);

        final MarketViewModel marketViewModel = new MarketViewModel(getApplication());
        Button ignore;
        Button rob;

        ignore = findViewById(R.id.ignoreButton);
        rob = findViewById(R.id.robButton);

        ignore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartMain();
                finish();
            }
        });

        rob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int credits = marketViewModel.getCredits() + magic500 + random.nextInt(magic500);
                marketViewModel.setCredits(credits);
                restartMain();
                finish();
            }
        });
    }

    private void restartMain() {
        Intent intent = new Intent(this,GameMainActivity.class);
        startActivity(intent);
    }
}
