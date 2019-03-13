package edu.gatech.cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MarketBuyActivity extends AppCompatActivity {
    private MarketViewModel marketViewModel;
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
    private Button gamesUp;
    private Button firearmsUp;
    private Button medicineUp;
    private Button machinesUp;
    private Button narcoticsUp;
    private Button robotsUp;
    private Button waterDown;
    private Button fursDown;;
    private Button foodDown;
    private Button oreDown;
    private Button gamesDown;
    private Button firearmsDown;;
    private Button medicineDown;
    private Button machinesDown;
    private Button narcoticsDown;
    private Button robotsDown;
    private Button purchase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace);

        marketViewModel = new MarketViewModel(getApplication());

        totalCred = findViewById(R.id.textView6);
        credLeft = findViewById(R.id.textView17);
        totalCred.setText("" + marketViewModel.getCredits());
        credLeft.setText("" + marketViewModel.getCredits());

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

        waterQ = findViewById(R.id.Water_Quanitity);
        fursQ = findViewById(R.id.Furs_Quantity);
        foodQ = findViewById(R.id.Food_Quantity);
        oreQ = findViewById(R.id.Ore_Quantity);
        gamesQ = findViewById(R.id.Games_Quanity);
        firearmsQ = findViewById(R.id.games_Quanity);
        medicineQ = findViewById(R.id.games_Quanity2);
        machinesQ = findViewById(R.id.textView19);
        narcoticsQ = findViewById(R.id.games_Quanity3);
        robotsQ = findViewById(R.id.games_Quanity4);

        waterUp = findViewById(R.id.Plus_Water);
        fursUp = findViewById(R.id.Plus_Furs);
        foodUp = findViewById(R.id.Plus_Food);
        oreUp = findViewById(R.id.Plus_Ore);
        gamesUp = findViewById(R.id.Plus_Games);
        firearmsUp = findViewById(R.id.Plus_Firearms);
        medicineUp = findViewById(R.id.Plus_Medicine);
        machinesUp = findViewById(R.id.button6);
        narcoticsUp = findViewById(R.id.Plus_Narcotics);
        robotsUp = findViewById(R.id.Plus_Robots);

        waterDown = findViewById(R.id.Minus_Water);
        fursDown = findViewById(R.id.Minus_Furs);
        foodDown = findViewById(R.id.Minus_Food);
        oreDown = findViewById(R.id.Minus_Ore);
        gamesDown = findViewById(R.id.Minus_Games);
        firearmsDown = findViewById(R.id.Minus_Firearms);
        medicineDown = findViewById(R.id.Minus_Medicine);
        machinesDown = findViewById(R.id.button7);
        narcoticsDown = findViewById(R.id.Minus_Narcotics);
        robotsDown = findViewById(R.id.Minus_Robots);

        purchase = findViewById(R.id.Purchase);

        Integer[] quants = marketViewModel.quantityMarket();
        waterQ.setText("" + quants[0]);
        fursQ.setText("" + quants[1]);
        foodQ.setText("" + quants[2]);
        oreQ.setText("" + quants[3]);
        gamesQ.setText("" + quants[4]);
        firearmsQ.setText("" + quants[5]);
        medicineQ.setText("" + quants[6]);
        machinesQ.setText("" + quants[7]);
        narcoticsQ.setText("" + quants[8]);
        robotsQ.setText("" + quants[9]);

        Integer[] prices = marketViewModel.getPrices();
        waterP.setText("" + prices[0]);
        fursP.setText("" + prices[1]);
        foodP.setText("" + prices[2]);
        oreP.setText("" + prices[3]);
        gamesP.setText("" + prices[4]);
        firearmsP.setText("" + prices[5]);
        medicineP.setText("" + prices[6]);
        machinesP.setText("" + prices[7]);
        narcoticsP.setText("" + prices[8]);
        robotsP.setText("" + prices[9]);

        waterUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(waterB.getText().toString()) < Integer.parseInt(waterQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(waterP.getText().toString())) {
                    waterB.setText("" + (Integer.parseInt(waterB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(waterP.getText().toString())));
                }
            }
        });
        fursUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(fursB.getText().toString()) < Integer.parseInt(fursQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(fursP.getText().toString())) {
                    fursB.setText("" + (Integer.parseInt(fursB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(fursP.getText().toString())));
                }
            }
        });
        foodUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(foodB.getText().toString()) < Integer.parseInt(foodQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(foodP.getText().toString())) {
                    foodB.setText("" + (Integer.parseInt(foodB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(foodP.getText().toString())));
                }
            }
        });
        oreUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(oreB.getText().toString()) < Integer.parseInt(oreQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(oreP.getText().toString())) {
                    oreB.setText("" + (Integer.parseInt(oreB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(oreP.getText().toString())));
                }
            }
        });
        gamesUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(gamesB.getText().toString()) < Integer.parseInt(gamesQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(gamesP.getText().toString())) {
                    gamesB.setText("" + (Integer.parseInt(gamesB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(gamesP.getText().toString())));
                }
            }
        });
        firearmsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(firearmsB.getText().toString()) < Integer.parseInt(firearmsQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(firearmsP.getText().toString())) {
                    firearmsB.setText("" + (Integer.parseInt(firearmsB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(firearmsP.getText().toString())));
                }
            }
        });
        medicineUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(medicineB.getText().toString()) < Integer.parseInt(medicineQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(medicineP.getText().toString())) {
                    medicineB.setText("" + (Integer.parseInt(medicineB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(medicineP.getText().toString())));
                }
            }
        });
        machinesUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(machinesB.getText().toString()) < Integer.parseInt(machinesQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(machinesP.getText().toString())) {
                    machinesB.setText("" + (Integer.parseInt(machinesB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(machinesP.getText().toString())));
                }
            }
        });
        narcoticsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(narcoticsB.getText().toString()) < Integer.parseInt(narcoticsQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(narcoticsP.getText().toString())) {
                    narcoticsB.setText("" + (Integer.parseInt(narcoticsB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(narcoticsP.getText().toString())));
                }
            }
        });
        robotsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(robotsB.getText().toString()) < Integer.parseInt(robotsQ.getText().toString())
                        && Integer.parseInt(credLeft.getText().toString()) > Integer.parseInt(robotsP.getText().toString())) {
                    robotsB.setText("" + (Integer.parseInt(robotsB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(robotsP.getText().toString())));
                }
            }
        });

        waterDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(waterB.getText().toString()) > 0) {
                    waterB.setText("" + (Integer.parseInt(waterB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(waterP.getText().toString())));
                }
            }
        });
        fursDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(fursB.getText().toString()) > 0) {
                    fursB.setText("" + (Integer.parseInt(fursB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(fursP.getText().toString())));
                }
            }
        });
        foodDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(foodB.getText().toString()) > 0) {
                    foodB.setText("" + (Integer.parseInt(foodB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(foodP.getText().toString())));
                }
            }
        });
        oreDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(oreB.getText().toString()) > 0) {
                    oreB.setText("" + (Integer.parseInt(oreB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(oreP.getText().toString())));
                }
            }
        });
        gamesDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(gamesB.getText().toString()) > 0) {
                    gamesB.setText("" + (Integer.parseInt(gamesB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(gamesP.getText().toString())));
                }
            }
        });
        firearmsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(firearmsB.getText().toString()) > 0) {
                    firearmsB.setText("" + (Integer.parseInt(firearmsB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(firearmsP.getText().toString())));
                }
            }
        });
        medicineDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(medicineB.getText().toString()) > 0) {
                    medicineB.setText("" + (Integer.parseInt(medicineB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(medicineP.getText().toString())));
                }
            }
        });
        machinesDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(machinesB.getText().toString()) > 0) {
                    machinesB.setText("" + (Integer.parseInt(machinesB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(machinesP.getText().toString())));
                }
            }
        });
        narcoticsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(narcoticsB.getText().toString()) > 0) {
                    narcoticsB.setText("" + (Integer.parseInt(narcoticsB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(narcoticsP.getText().toString())));
                }
            }
        });
        robotsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(robotsB.getText().toString()) > 0) {
                    robotsB.setText("" + (Integer.parseInt(robotsB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(robotsP.getText().toString())));
                }
            }
        });

        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marketViewModel.setCredits(Integer.parseInt(credLeft.getText().toString()));
                finish();
            }
        });
    }
}
