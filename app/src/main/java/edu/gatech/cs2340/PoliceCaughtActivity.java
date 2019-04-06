package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoliceCaughtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_caught);

        Button continueB;

        final MarketViewModel marketViewModel = new MarketViewModel(getApplication());
        continueB = findViewById(R.id.sadLife);

        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int credits = marketViewModel.getCredits();
                credits -= (credits / 10);
                marketViewModel.setCredits(credits);
                int numNarcs = marketViewModel.getNumNarcotics();
                marketViewModel.removeNarcotics(numNarcs);
                restartMain(v);
                finish();
            }
        });
    }

    public void restartMain(View view) {
        Intent intent = new Intent(this,GameMainActivity.class);
        startActivity(intent);
    }
}
