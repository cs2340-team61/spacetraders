package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliceCaughtActivity extends AppCompatActivity {

    final MarketViewModel marketViewModel = new MarketViewModel(getApplication());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                restartMain(v);
                finish();
            }
        });
    }

    private void restartMain(View view) {
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
