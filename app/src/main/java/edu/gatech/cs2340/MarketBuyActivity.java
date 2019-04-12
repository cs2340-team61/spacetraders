package edu.gatech.cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * class that shows the UI buying at the marketplace
 */
public class MarketBuyActivity extends AppCompatActivity {
    private MarketViewModel marketViewModel;
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
    private TextView cargoMax;
    private TextView cargoCurr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace);

        marketViewModel = new MarketViewModel(getApplication());

        TextView totalCred = findViewById(R.id.textView6);
        credLeft = findViewById(R.id.textView17);
        totalCred.setText("" + getCredits());
        credLeft.setText("" + getCredits());
        cargoCurr = findViewById(R.id.cargo_curr);
        cargoMax = findViewById(R.id.cargo_max);
        cargoCurr.setText("" + getInventorySize());
        cargoMax.setText("" + getMaxCargo());


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

        Button waterUp = findViewById(R.id.Plus_Water);
        Button fursUp = findViewById(R.id.Plus_Furs);
        Button foodUp = findViewById(R.id.Plus_Food);
        Button oreUp = findViewById(R.id.Plus_Ore);
        Button gamesUp = findViewById(R.id.Plus_Games);
        Button firearmsUp = findViewById(R.id.Plus_Firearms);
        Button medicineUp = findViewById(R.id.Plus_Medicine);
        Button machinesUp = findViewById(R.id.button6);
        Button narcoticsUp = findViewById(R.id.Plus_Narcotics);
        Button robotsUp = findViewById(R.id.Plus_Robots);

        Button waterDown = findViewById(R.id.Minus_Water);
        Button fursDown = findViewById(R.id.Minus_Furs);
        Button foodDown = findViewById(R.id.Minus_Food);
        Button oreDown = findViewById(R.id.Minus_Ore);
        Button gamesDown = findViewById(R.id.Minus_Games);
        Button firearmsDown = findViewById(R.id.Minus_Firearms);
        Button medicineDown = findViewById(R.id.Minus_Medicine);
        Button machinesDown = findViewById(R.id.button7);
        Button narcoticsDown = findViewById(R.id.Minus_Narcotics);
        Button robotsDown = findViewById(R.id.Minus_Robots);

        Button purchase = findViewById(R.id.Purchase);
        Button leave = findViewById(R.id.Leave);

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

        Integer[] prices = getPrices();
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
                int waterBVal = Integer.parseInt(waterB.getText().toString());
                int waterQVal = Integer.parseInt(waterQ.getText().toString());
                int waterPVal = Integer.parseInt(waterP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((waterBVal < waterQVal) && (credLeftVal > waterPVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    waterB.setText("" + (waterBVal + 1));
                    credLeft.setText("" + (credLeftVal - waterPVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        fursUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fursBVal = Integer.parseInt(fursB.getText().toString());
                int fursQVal = Integer.parseInt(fursQ.getText().toString());
                int fursPVal = Integer.parseInt(fursP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((fursBVal < fursQVal) && (credLeftVal > fursPVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    fursB.setText("" + (fursBVal + 1));
                    credLeft.setText("" + (credLeftVal - fursPVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        foodUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int foodBVal = Integer.parseInt(foodB.getText().toString());
                int foodQVal = Integer.parseInt(foodQ.getText().toString());
                int foodPVal = Integer.parseInt(foodP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((foodBVal < foodQVal) && (credLeftVal > foodPVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    foodB.setText("" + (foodBVal + 1));
                    credLeft.setText("" + (credLeftVal - foodPVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        oreUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int oreBVal = Integer.parseInt(oreB.getText().toString());
                int oreQVal = Integer.parseInt(oreQ.getText().toString());
                int orePVal = Integer.parseInt(oreP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((oreBVal < oreQVal) && (credLeftVal > orePVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    oreB.setText("" + (oreBVal + 1));
                    credLeft.setText("" + (credLeftVal - orePVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        gamesUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gamesBVal = Integer.parseInt(gamesB.getText().toString());
                int gamesQVal = Integer.parseInt(gamesQ.getText().toString());
                int gamesPVal = Integer.parseInt(gamesP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((gamesBVal < gamesQVal) && (credLeftVal > gamesPVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    gamesB.setText("" + (gamesBVal + 1));
                    credLeft.setText("" + (credLeftVal - gamesPVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        firearmsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firearmsBVal = Integer.parseInt(firearmsB.getText().toString());
                int firearmsQVal = Integer.parseInt(firearmsQ.getText().toString());
                int firearmsPVal = Integer.parseInt(firearmsP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((firearmsBVal < firearmsQVal) && (credLeftVal > firearmsPVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    firearmsB.setText("" + (firearmsBVal + 1));
                    credLeft.setText("" + (credLeftVal - firearmsPVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        medicineUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int medicineBVal = Integer.parseInt(medicineB.getText().toString());
                int medicineQVal = Integer.parseInt(medicineQ.getText().toString());
                int medicinePVal = Integer.parseInt(medicineP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((medicineBVal < medicineQVal) && (credLeftVal > medicinePVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    medicineB.setText("" + (medicineBVal + 1));
                    credLeft.setText("" + (credLeftVal - medicinePVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        machinesUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int machinesBVal = Integer.parseInt(machinesB.getText().toString());
                int machinesQVal = Integer.parseInt(machinesQ.getText().toString());
                int machinesPVal = Integer.parseInt(machinesP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((machinesBVal < machinesQVal) && (credLeftVal > machinesPVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    machinesB.setText("" + (machinesBVal + 1));
                    credLeft.setText("" + (credLeftVal - machinesPVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        narcoticsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int narcoticsBVal = Integer.parseInt(narcoticsB.getText().toString());
                int narcoticsQVal = Integer.parseInt(narcoticsQ.getText().toString());
                int narcoticsPVal = Integer.parseInt(narcoticsP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((narcoticsBVal < narcoticsQVal) && (credLeftVal > narcoticsPVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    narcoticsB.setText("" + (narcoticsBVal + 1));
                    credLeft.setText("" + (credLeftVal - narcoticsPVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });
        robotsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int robotsBVal = Integer.parseInt(robotsB.getText().toString());
                int robotsQVal = Integer.parseInt(robotsQ.getText().toString());
                int robotsPVal = Integer.parseInt(robotsP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                int cargoMaxVal = Integer.parseInt(cargoMax.getText().toString());
                if ((robotsBVal < robotsQVal) && (credLeftVal > robotsPVal)
                        && (cargoCurrVal < cargoMaxVal)) {
                    robotsB.setText("" + (robotsBVal + 1));
                    credLeft.setText("" + (credLeftVal - robotsPVal));
                    cargoCurr.setText("" + (cargoCurrVal + 1));
                }
            }
        });

        waterDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int waterBVal = Integer.parseInt(waterB.getText().toString());
                int waterPVal = Integer.parseInt(waterP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (waterBVal > 0) {
                    waterB.setText("" + (waterBVal - 1));
                    credLeft.setText("" + (credLeftVal + waterPVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        fursDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fursBVal = Integer.parseInt(fursB.getText().toString());
                int fursPVal = Integer.parseInt(fursP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (fursBVal > 0) {
                    fursB.setText("" + (fursBVal - 1));
                    credLeft.setText("" + (credLeftVal + fursPVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        foodDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int foodBVal = Integer.parseInt(foodB.getText().toString());
                int foodPVal = Integer.parseInt(foodP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (foodBVal > 0) {
                    foodB.setText("" + (foodBVal - 1));
                    credLeft.setText("" + (credLeftVal + foodPVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        oreDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int oreBVal = Integer.parseInt(oreB.getText().toString());
                int orePVal = Integer.parseInt(oreP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (oreBVal > 0) {
                    oreB.setText("" + (oreBVal - 1));
                    credLeft.setText("" + (credLeftVal + orePVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        gamesDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gamesBVal = Integer.parseInt(gamesB.getText().toString());
                int gamesPVal = Integer.parseInt(gamesP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (gamesBVal > 0) {
                    gamesB.setText("" + (gamesBVal - 1));
                    credLeft.setText("" + (credLeftVal + gamesPVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        firearmsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firearmsBVal = Integer.parseInt(firearmsB.getText().toString());
                int firearmsPVal = Integer.parseInt(firearmsP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (firearmsBVal > 0) {
                    firearmsB.setText("" + (firearmsBVal - 1));
                    credLeft.setText("" + (credLeftVal + firearmsPVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        medicineDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int medicineBVal = Integer.parseInt(medicineB.getText().toString());
                int medicinePVal = Integer.parseInt(medicineP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (medicineBVal > 0) {
                    medicineB.setText("" + (medicineBVal - 1));
                    credLeft.setText("" + (credLeftVal + medicinePVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        machinesDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int machinesBVal = Integer.parseInt(machinesB.getText().toString());
                int machinesPVal = Integer.parseInt(machinesP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (machinesBVal > 0) {
                    machinesB.setText("" + (machinesBVal - 1));
                    credLeft.setText("" + (credLeftVal + machinesPVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        narcoticsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int narcoticsBVal = Integer.parseInt(narcoticsB.getText().toString());
                int narcoticsPVal = Integer.parseInt(narcoticsP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (narcoticsBVal > 0) {
                    narcoticsB.setText("" + (narcoticsBVal - 1));
                    credLeft.setText("" + (credLeftVal + narcoticsPVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });
        robotsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int robotsBVal = Integer.parseInt(robotsB.getText().toString());
                int robotsPVal = Integer.parseInt(robotsP.getText().toString());
                int credLeftVal = Integer.parseInt(credLeft.getText().toString());
                int cargoCurrVal = Integer.parseInt(cargoCurr.getText().toString());
                if (robotsBVal > 0) {
                    robotsB.setText("" + (robotsBVal - 1));
                    credLeft.setText("" + (credLeftVal + robotsPVal));
                    cargoCurr.setText("" + (cargoCurrVal - 1));
                }
            }
        });

        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCredits(Integer.parseInt(credLeft.getText().toString()));
                addWater(Integer.parseInt(waterB.getText().toString()));
                addFurs(Integer.parseInt(fursB.getText().toString()));
                addFood(Integer.parseInt(foodB.getText().toString()));
                addOre(Integer.parseInt(oreB.getText().toString()));
                addGames(Integer.parseInt(gamesB.getText().toString()));
                addFirearms(Integer.parseInt(firearmsB.getText().toString()));
                addMedicine(Integer.parseInt(medicineB.getText().toString()));
                addMachines(Integer.parseInt(machinesB.getText().toString()));
                addNarcotics(Integer.parseInt(narcoticsB.getText().toString()));
                addRobots(Integer.parseInt(robotsB.getText().toString()));
                updateInventorySize();
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

    private void addWater(int add) {
        marketViewModel.addWater(add);
    }

    private void addFurs(int add) {
        marketViewModel.addFurs(add);
    }

    private void addFood(int add) {
        marketViewModel.addFood(add);
    }

    private void addOre(int add) {
        marketViewModel.addOre(add);
    }

    private void addGames(int add) {
        marketViewModel.addGames(add);
    }

    private void addFirearms(int add) {
        marketViewModel.addFirearms(add);
    }

    private void addMedicine(int add) {
        marketViewModel.addMedicine(add);
    }

    private void addMachines(int add) {
        marketViewModel.addMachines(add);
    }

    private void addNarcotics(int add) {
        marketViewModel.addNarcotics(add);
    }

    private void addRobots(int add) {
        marketViewModel.addRobots(add);
    }

    private void setCredits(int left) {
        marketViewModel.setCredits(left);
    }

    private void updateInventorySize() {
        marketViewModel.updateInventorySize();
    }

    private int getCredits() {
        return marketViewModel.getCredits();
    }

    private int getInventorySize() {
        return marketViewModel.getInventorySize();
    }

    private int getMaxCargo() {
        return marketViewModel.getMaxCargo();
    }

    private Integer[] getPrices() {
        return marketViewModel.getPrices();
    }

}
