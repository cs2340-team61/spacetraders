package edu.gatech.cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MarketBuyActivity extends AppCompatActivity {
    private TextView totalCred;
    private TextView credLeft;
    private TextView waterQ;
    private TextView fursQ;
    private TextView foodQ;
    private TextView oreQ;
    private TextView gamesQ;
    private TextView firearmsQ;
    private TextView medicineQ;
    private TextView machinesQ;
    private TextView narcoticsQ;
    private TextView robotsQ;
    private TextView waterP;
    private TextView fursP;
    private TextView foodP;
    private TextView oreP;
    private TextView gamesP;
    private TextView firearmsP;
    private TextView medicineP;
    private TextView machinesP;
    private TextView narcoticsP;
    private TextView robotsP;
    private TextView waterB;
    private TextView fursB;
    private TextView foodB;
    private TextView oreB;
    private TextView gamesB;
    private TextView firearmsB;
    private TextView medicineB;
    private TextView machinesB;
    private TextView narcoticsB;
    private TextView robotsB;
    private Button waterUp;
    private Button fursUp;
    private Button foodUp;
    private Button oreUp;
    private Button firearmsUp;
    private Button medicineUp;
    private Button machinesUp;
    private Button narcoticsUp;
    private Button robotsUp;
    private Button waterDown;
    private Button fursDown;;
    private Button foodDown;
    private Button oreDown;
    private Button firearmsDown;;
    private Button medicineDown;
    private Button machinesDown;
    private Button narcoticsDown;
    private Button robotsDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace);

        totalCred = findViewById(R.id.textView6);
        credLeft = findViewById(R.id.textView17);
        waterB = findViewById(R.id.textView7);
        fursB = findViewById(R.id.textView8);
        foodB = findViewById(R.id.textView9);
        oreB = findViewById(R.id.textView10);
        gamesB = findViewById(R.id.textView11);
        firearmsB = findViewById(R.id.textView12);
        medicineB = findViewById(R.id.textView13);
        machinesB = findViewById(R.id.textView21);
        narcoticsB = findViewById(R.id.textView14);
        robotsB = findViewById(R.id.textView15);
        waterP = findViewById(R.id.Water_Price);
        fursP = findViewById(R.id.Furs_Price);
        foodP = findViewById(R.id.Food_Price);
        oreP = findViewById(R.id.Ore_Price);
        gamesP = findViewById(R.id.Games_Price);
        firearmsP = findViewById(R.id.Firearms_Price);
        medicineP = findViewById(R.id.Medicine_Price);
        machinesP = findViewById(R.id.textView20);
        narcoticsP = findViewById(R.id.Narcotics_Price);
        robotsP = findViewById(R.id.Robots_Price);
    }
}
