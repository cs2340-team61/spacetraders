package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class TraderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                restartMain(v);
                finish();
            }
        });

        rob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int credits = marketViewModel.getCredits() + 500 + random.nextInt(500);
                marketViewModel.setCredits(credits);
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
