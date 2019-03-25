package edu.gatech.cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MarketSellActivity extends AppCompatActivity {
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
    private Button leave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_sell);

        marketViewModel = new MarketViewModel(getApplication());

        totalCred = findViewById(R.id.textView42);
        credLeft = findViewById(R.id.textView59);
        totalCred.setText("" + marketViewModel.getCredits());
        credLeft.setText("" + marketViewModel.getCredits());

        waterB = findViewById(R.id.textView48);
        fursB = findViewById(R.id.textView45);
        foodB = findViewById(R.id.textView57);
        oreB = findViewById(R.id.textView64);
        gamesB = findViewById(R.id.textView62);
        firearmsB = findViewById(R.id.textView65);
        medicineB = findViewById(R.id.textView43);
        machinesB = findViewById(R.id.textView36);
        narcoticsB = findViewById(R.id.textView58);
        robotsB = findViewById(R.id.textView63);

        waterP = findViewById(R.id.water_Price);
        fursP = findViewById(R.id.furs_Price);
        foodP = findViewById(R.id.food_Price);
        oreP = findViewById(R.id.ore_Price);
        gamesP = findViewById(R.id.games_Price);
        firearmsP = findViewById(R.id.firearms_Price);
        medicineP = findViewById(R.id.medicine_Price);
        machinesP = findViewById(R.id.textView54);
        narcoticsP = findViewById(R.id.narcotics_Price);
        robotsP = findViewById(R.id.robots_Price);

        waterQ = findViewById(R.id.water_Quanitity);
        fursQ = findViewById(R.id.furs_Quantity);
        foodQ = findViewById(R.id.food_Quantity);
        oreQ = findViewById(R.id.ore_Quantity);
        gamesQ = findViewById(R.id.games_Quanity9);
        firearmsQ = findViewById(R.id.games_Quanity8);
        medicineQ = findViewById(R.id.medicine_Quanity);
        machinesQ = findViewById(R.id.textView47);
        narcoticsQ = findViewById(R.id.games_Quanity7);
        robotsQ = findViewById(R.id.robots_Quanity);

        waterUp = findViewById(R.id.plus_Water);
        fursUp = findViewById(R.id.plus_Furs);
        foodUp = findViewById(R.id.plus_Food);
        oreUp = findViewById(R.id.plus_Ore);
        gamesUp = findViewById(R.id.plus_Games);
        firearmsUp = findViewById(R.id.plus_Firearms);
        medicineUp = findViewById(R.id.plus_Medicine);
        machinesUp = findViewById(R.id.plus_machines);
        narcoticsUp = findViewById(R.id.plus_Narcotics);
        robotsUp = findViewById(R.id.plus_Robots);

        waterDown = findViewById(R.id.minus_Water);
        fursDown = findViewById(R.id.minus_Furs);
        foodDown = findViewById(R.id.minus_Food);
        oreDown = findViewById(R.id.minus_Ore);
        gamesDown = findViewById(R.id.minus_Games);
        firearmsDown = findViewById(R.id.minus_Firearms);
        medicineDown = findViewById(R.id.minus_Medicine);
        machinesDown = findViewById(R.id.button9);
        narcoticsDown = findViewById(R.id.minus_Narcotics);
        robotsDown = findViewById(R.id.minus_Robots);

        purchase = findViewById(R.id.sell);
        leave = findViewById(R.id.leave);

        waterQ.setText("" + marketViewModel.getInventory().getNumWater());
        fursQ.setText("" + marketViewModel.getInventory().getNumFurs());
        foodQ.setText("" + marketViewModel.getInventory().getNumFood());
        oreQ.setText("" + marketViewModel.getInventory().getNumOre());
        gamesQ.setText("" + marketViewModel.getInventory().getNumGames());
        firearmsQ.setText("" + marketViewModel.getInventory().getNumFirearms());
        medicineQ.setText("" + marketViewModel.getInventory().getNumMedicine());
        machinesQ.setText("" + marketViewModel.getInventory().getNumMachines());
        narcoticsQ.setText("" + marketViewModel.getInventory().getNumNarcotics());
        robotsQ.setText("" + marketViewModel.getInventory().getNumRobots());

        Integer[] prices = marketViewModel.getPrices();

        for (int i = 0; i < 10; i++) {
            if (prices[i] == 0) {
                prices[i] = 2;
            }
        }
        waterP.setText("" + (prices[0] - 2));
        fursP.setText("" + (prices[1] - 2));
        foodP.setText("" + (prices[2] - 2));
        oreP.setText("" + (prices[3] - 2));
        gamesP.setText("" + (prices[4] - 2));
        firearmsP.setText("" + (prices[5] - 2));
        medicineP.setText("" + (prices[6] - 2));
        machinesP.setText("" + (prices[7] - 2));
        narcoticsP.setText("" + (prices[8] - 2));
        robotsP.setText("" + (prices[9] - 2));

        waterUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(waterB.getText().toString()) < Integer.parseInt(waterQ.getText().toString())) {
                    waterB.setText("" + (Integer.parseInt(waterB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(waterP.getText().toString())));
                }
            }
        });
        fursUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(fursB.getText().toString()) < Integer.parseInt(fursQ.getText().toString())) {
                    fursB.setText("" + (Integer.parseInt(fursB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(fursP.getText().toString())));
                }
            }
        });
        foodUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(foodB.getText().toString()) < Integer.parseInt(foodQ.getText().toString())) {
                    foodB.setText("" + (Integer.parseInt(foodB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(foodP.getText().toString())));
                }
            }
        });
        oreUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(oreB.getText().toString()) < Integer.parseInt(oreQ.getText().toString())) {
                    oreB.setText("" + (Integer.parseInt(oreB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(oreP.getText().toString())));
                }
            }
        });
        gamesUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(gamesB.getText().toString()) < Integer.parseInt(gamesQ.getText().toString())) {
                    gamesB.setText("" + (Integer.parseInt(gamesB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(gamesP.getText().toString())));
                }
            }
        });
        firearmsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(firearmsB.getText().toString()) < Integer.parseInt(firearmsQ.getText().toString())) {
                    firearmsB.setText("" + (Integer.parseInt(firearmsB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(firearmsP.getText().toString())));
                }
            }
        });
        medicineUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(medicineB.getText().toString()) < Integer.parseInt(medicineQ.getText().toString())) {
                    medicineB.setText("" + (Integer.parseInt(medicineB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(medicineP.getText().toString())));
                }
            }
        });
        machinesUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(machinesB.getText().toString()) < Integer.parseInt(machinesQ.getText().toString())) {
                    machinesB.setText("" + (Integer.parseInt(machinesB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(machinesP.getText().toString())));
                }
            }
        });
        narcoticsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(narcoticsB.getText().toString()) < Integer.parseInt(narcoticsQ.getText().toString())) {
                    narcoticsB.setText("" + (Integer.parseInt(narcoticsB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(narcoticsP.getText().toString())));
                }
            }
        });
        robotsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(robotsB.getText().toString()) < Integer.parseInt(robotsQ.getText().toString())) {
                    robotsB.setText("" + (Integer.parseInt(robotsB.getText().toString()) + 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) + Integer.parseInt(robotsP.getText().toString())));
                }
            }
        });

        waterDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(waterB.getText().toString()) > 0) {
                    waterB.setText("" + (Integer.parseInt(waterB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(waterP.getText().toString())));
                }
            }
        });
        fursDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(fursB.getText().toString()) > 0) {
                    fursB.setText("" + (Integer.parseInt(fursB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(fursP.getText().toString())));
                }
            }
        });
        foodDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(foodB.getText().toString()) > 0) {
                    foodB.setText("" + (Integer.parseInt(foodB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(foodP.getText().toString())));
                }
            }
        });
        oreDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(oreB.getText().toString()) > 0) {
                    oreB.setText("" + (Integer.parseInt(oreB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(oreP.getText().toString())));
                }
            }
        });
        gamesDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(gamesB.getText().toString()) > 0) {
                    gamesB.setText("" + (Integer.parseInt(gamesB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(gamesP.getText().toString())));
                }
            }
        });
        firearmsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(firearmsB.getText().toString()) > 0) {
                    firearmsB.setText("" + (Integer.parseInt(firearmsB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(firearmsP.getText().toString())));
                }
            }
        });
        medicineDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(medicineB.getText().toString()) > 0) {
                    medicineB.setText("" + (Integer.parseInt(medicineB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(medicineP.getText().toString())));
                }
            }
        });
        machinesDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(machinesB.getText().toString()) > 0) {
                    machinesB.setText("" + (Integer.parseInt(machinesB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(machinesP.getText().toString())));
                }
            }
        });
        narcoticsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(narcoticsB.getText().toString()) > 0) {
                    narcoticsB.setText("" + (Integer.parseInt(narcoticsB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(narcoticsP.getText().toString())));
                }
            }
        });
        robotsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(robotsB.getText().toString()) > 0) {
                    robotsB.setText("" + (Integer.parseInt(robotsB.getText().toString()) - 1));
                    credLeft.setText("" + (Integer.parseInt(credLeft.getText().toString()) - Integer.parseInt(robotsP.getText().toString())));
                }
            }
        });

        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marketViewModel.setCredits(Integer.parseInt(credLeft.getText().toString()));
                marketViewModel.removeWater(Integer.parseInt(waterB.getText().toString()));
                marketViewModel.removeFurs(Integer.parseInt(fursB.getText().toString()));
                marketViewModel.removeFood(Integer.parseInt(foodB.getText().toString()));
                marketViewModel.removeOre(Integer.parseInt(oreB.getText().toString()));
                marketViewModel.removeGames(Integer.parseInt(gamesB.getText().toString()));
                marketViewModel.removeFirearms(Integer.parseInt(firearmsB.getText().toString()));
                marketViewModel.removeMedicine(Integer.parseInt(medicineB.getText().toString()));
                marketViewModel.removeMachines(Integer.parseInt(machinesB.getText().toString()));
                marketViewModel.removeNarcotics(Integer.parseInt(narcoticsB.getText().toString()));
                marketViewModel.removeRobots(Integer.parseInt(robotsB.getText().toString()));
                marketViewModel.updateInventorySize();
                finish();
            }
        });

        leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
