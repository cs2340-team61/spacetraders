package edu.gatech.cs2340;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * class that shows the UI for getting caught by the police
 */
public class PoliceCaughtActivity extends AppCompatActivity {

    private final MarketViewModel marketViewModel = new MarketViewModel(getApplication());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.space); mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_caught);

        Button continueB;
        continueB = findViewById(R.id.sadLife);

        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int credits = getCredits();
                credits -= (credits / 10);
                setCredits(credits);
                int numNarcs = marketViewModel.getNumNarcotics();
                removeNarcotics(numNarcs);
                restartMain();
                finish();
            }
        });
    }

    private void restartMain() {
        Intent intent = new Intent(this,GameMainActivity.class);
        startActivity(intent);
    }

    private int getCredits() {
        return marketViewModel.getCredits();
    }

    private void setCredits(int credits) {
        marketViewModel.setCredits(credits);
    }

    private void removeNarcotics(int narcotics) {
        marketViewModel.removeNarcotics(narcotics);
    }
}
