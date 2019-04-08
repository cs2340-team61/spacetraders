package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TravelActivity extends AppCompatActivity {
    private TravelViewModel travelViewModel = new TravelViewModel(getApplication());
    private TextView solarSystem1;
    private TextView solarSystem2;
    private TextView solarSystem3;
    private TextView solarSystem4;
    private TextView solarSystem5;
    private TextView planet1;
    private TextView planet2;
    private TextView planet3;
    private TextView planet4;
    private TextView planet5;
    private TextView planet6;
    private TextView planet7;
    private TextView planet8;
    private TextView planet9;
    private TextView planet10;
    private TextView planet11;
    private TextView planet12;
    private TextView planet13;
    private TextView planet14;
    private TextView planet15;
    private TextView distance1;
    private TextView distance2;
    private TextView distance3;
    private TextView distance4;
    private TextView distance5;
    private TextView distance6;
    private TextView distance7;
    private TextView distance8;
    private TextView distance9;
    private TextView distance10;
    private TextView distance11;
    private TextView distance12;
    private TextView distance13;
    private TextView distance14;
    private TextView distance15;
    private TextView fuelCost1;
    private TextView fuelCost2;
    private TextView fuelCost3;
    private TextView fuelCost4;
    private TextView fuelCost5;
    private TextView fuelCost6;
    private TextView fuelCost7;
    private TextView fuelCost8;
    private TextView fuelCost9;
    private TextView fuelCost10;
    private TextView fuelCost11;
    private TextView fuelCost12;
    private TextView fuelCost13;
    private TextView fuelCost14;
    private TextView fuelCost15;
    // FIXED: typo: Haelth -> Health
    private TextView currentHealth;
    private TextView currentFuel;
    private TextView ssChoice;
    private TextView pChoice;
    private Button ssUp;
    private Button ssDown;
    private Button pUp;
    private Button pDown;
    private Button go;
    private Button cancel;
    private static final int magic11 = 11;
    private static final int magic12 = 12;
    private static final int magic13 = 13;
    private static final int magic14 = 14;
    private static final int magic15 = 15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        solarSystem1 = findViewById(R.id.solarSystem1);
        solarSystem2 = findViewById(R.id.solarSystem2);
        solarSystem3 = findViewById(R.id.solarSystem3);
        solarSystem4 = findViewById(R.id.solarSystem4);
        solarSystem5 = findViewById(R.id.solarSystem5);
        planet1 = findViewById(R.id.planet1);
        planet2 = findViewById(R.id.planet2);
        planet3 = findViewById(R.id.planet3);
        planet4 = findViewById(R.id.planet4);
        planet5 = findViewById(R.id.planet5);
        planet6 = findViewById(R.id.planet6);
        planet7 = findViewById(R.id.planet7);
        planet8 = findViewById(R.id.planet8);
        planet9 = findViewById(R.id.planet9);
        planet10 = findViewById(R.id.planet10);
        planet11 = findViewById(R.id.planet11);
        planet12 = findViewById(R.id.planet12);
        planet13 = findViewById(R.id.planet13);
        planet14 = findViewById(R.id.planet14);
        planet15 = findViewById(R.id.planet15);
        distance1 = findViewById(R.id.distanceP1);
        distance2 = findViewById(R.id.distanceP2);
        distance3 = findViewById(R.id.distanceP3);
        distance4 = findViewById(R.id.distanceP4);
        distance5 = findViewById(R.id.distanceP5);
        distance6 = findViewById(R.id.distanceP6);
        distance7 = findViewById(R.id.distanceP7);
        distance8 = findViewById(R.id.distanceP8);
        distance9 = findViewById(R.id.distanceP9);
        distance10 = findViewById(R.id.distanceP10);
        distance11 = findViewById(R.id.distanceP11);
        distance12 = findViewById(R.id.distanceP12);
        distance13 = findViewById(R.id.distanceP13);
        distance14 = findViewById(R.id.distanceP14);
        distance15 = findViewById(R.id.distanceP15);
        fuelCost1 = findViewById(R.id.fuelCost1);
        fuelCost2 = findViewById(R.id.fuelCost2);
        fuelCost3 = findViewById(R.id.fuelCost3);
        fuelCost4 = findViewById(R.id.fuelCost4);
        fuelCost5 = findViewById(R.id.fuelCost5);
        fuelCost6 = findViewById(R.id.fuelCost6);
        fuelCost7 = findViewById(R.id.fuelCost7);
        fuelCost8 = findViewById(R.id.fuelCost8);
        fuelCost9 = findViewById(R.id.fuelCost9);
        fuelCost10 = findViewById(R.id.fuelCost10);
        fuelCost11 = findViewById(R.id.fuelCost11);
        fuelCost12 = findViewById(R.id.fuelCost12);
        fuelCost13 = findViewById(R.id.fuelCost13);
        fuelCost14 = findViewById(R.id.fuelCost14);
        fuelCost15 = findViewById(R.id.fuelCost15);
        currentHealth = findViewById(R.id.currentHealth);
        currentFuel = findViewById(R.id.currentFuel);
        ssChoice = findViewById(R.id.ssChoice);
        pChoice = findViewById(R.id.pChoice);
        ssUp = findViewById(R.id.ssUp);
        ssDown = findViewById(R.id.ssDown);
        pUp = findViewById(R.id.pUp);
        pDown = findViewById(R.id.pDown);
        go = findViewById(R.id.travel);
        cancel = findViewById(R.id.cancel);

        Planet playerLocation = getPlayerLocation();
        SolarSystem[] solarSystems = getSolarSystems();
        final Planet[] planets = getPlanets();

        solarSystem1.setText(getSSname(solarSystems[0]));
        solarSystem2.setText(getSSname(solarSystems[1]));
        solarSystem3.setText(getSSname(solarSystems[2]));
        solarSystem4.setText(getSSname(solarSystems[3]));
        solarSystem5.setText(getSSname(solarSystems[4]));
        planet1.setText(getPlanetName(planets[0]));
        planet2.setText(getPlanetName(planets[1]));
        planet3.setText(getPlanetName(planets[2]));
        planet4.setText(getPlanetName(planets[3]));
        planet5.setText(getPlanetName(planets[4]));
        planet6.setText(getPlanetName(planets[5]));
        planet7.setText(getPlanetName(planets[6]));
        planet8.setText(getPlanetName(planets[7]));
        planet9.setText(getPlanetName(planets[8]));
        planet10.setText(getPlanetName(planets[9]));
        planet11.setText(getPlanetName(planets[10]));
        planet12.setText(getPlanetName(planets[magic11]));
        planet13.setText(getPlanetName(planets[magic12]));
        planet14.setText(getPlanetName(planets[magic13]));
        planet15.setText(getPlanetName(planets[magic14]));

        int distances[] = new int[magic15];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = getDistance(getX(planets[i]), getX(playerLocation), getY(planets[i]),
                    getY(playerLocation));
        }

        distance1.setText(distances[0] + " Units");
        distance2.setText(distances[1] + " Units");
        distance3.setText(distances[2] + " Units");
        distance4.setText(distances[3] + " Units");
        distance5.setText(distances[4] + " Units");
        distance6.setText(distances[5] + " Units");
        distance7.setText(distances[6] + " Units");
        distance8.setText(distances[7] + " Units");
        distance9.setText(distances[8] + " Units");
        distance10.setText(distances[9] + " Units");
        distance11.setText(distances[10] + " Units");
        distance12.setText(distances[magic11] + " Units");
        distance13.setText(distances[magic12] + " Units");
        distance14.setText(distances[magic13] + " Units");
        distance15.setText(distances[magic14] + " Units");

        fuelCost1.setText(getFuelCost(distances[0]) + " fuel");
        fuelCost2.setText(getFuelCost(distances[1]) + " fuel");
        fuelCost3.setText(getFuelCost(distances[2]) + " fuel");
        fuelCost4.setText(getFuelCost(distances[3]) + " fuel");
        fuelCost5.setText(getFuelCost(distances[4]) + " fuel");
        fuelCost6.setText(getFuelCost(distances[5]) + " fuel");
        fuelCost7.setText(getFuelCost(distances[6]) + " fuel");
        fuelCost8.setText(getFuelCost(distances[7]) + " fuel");
        fuelCost9.setText(getFuelCost(distances[8]) + " fuel");
        fuelCost10.setText(getFuelCost(distances[9]) + " fuel");
        fuelCost11.setText(getFuelCost(distances[10]) + " fuel");
        fuelCost12.setText(getFuelCost(distances[magic11]) + " fuel");
        fuelCost13.setText(getFuelCost(distances[magic12]) + " fuel");
        fuelCost14.setText(getFuelCost(distances[magic13]) + " fuel");
        fuelCost15.setText(getFuelCost(distances[magic14]) + " fuel");

        currentHealth.setText("" + getHealth());
        currentFuel.setText("" + getFuel());

        ssUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(ssChoice.getText().toString()) < 5) {
                    ssChoice.setText("" + (Integer.parseInt(ssChoice.getText().toString()) + 1));
                }
            }
        });

        ssDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(ssChoice.getText().toString()) > 1) {
                    ssChoice.setText("" + (Integer.parseInt(ssChoice.getText().toString()) - 1));
                }
            }
        });

        pUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(pChoice.getText().toString()) < 3) {
                    pChoice.setText("" + (Integer.parseInt(pChoice.getText().toString()) + 1));
                }
            }
        });

        pDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(pChoice.getText().toString()) > 1) {
                    pChoice.setText("" + (Integer.parseInt(pChoice.getText().toString()) - 1));
                }
            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Planet update = planets[Integer.parseInt(ssChoice.getText().toString()) * 3
                        + Integer.parseInt(pChoice.getText().toString()) - 4];
                Planet playerLocation = getPlayerLocation();
                if (update.equals(playerLocation)) {
                    (Toast.makeText(getApplication(), "You are already on this planet!",
                            Toast.LENGTH_LONG)).show();
                } else {
                    if (Integer.parseInt(currentFuel.getText().toString()) >
                            getFuelCost(getDistance(getX(update), getX(playerLocation),
                            getY(update), getY(playerLocation)))) {
                        updatePlayerLocation(update);
                        updateFuel(getFuelCost(getDistance(getX(update),
                                getX(playerLocation), getY(update), getY(playerLocation))));
                        int eventCheck = travelViewModel.checkForEvent();
                        if (eventCheck == 1) {
                            pirateStart(v);
                            finish();
                        } else if (eventCheck == 2) {
                            policeStart(v);
                            finish();
                        } else if (eventCheck == 3) {
                            traderStart(v);
                            finish();
                        } else {
                            restartMain(v);
                            finish();
                        }
                    } else {
                        (Toast.makeText(getApplication(), "You do not have enough fuel!",
                                Toast.LENGTH_LONG)).show();
                    }
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartMain(v);
                finish();
            }
        });
    }

    public void restartMain(View view) {
        Intent intent = new Intent(this, GameMainActivity.class);
        startActivity(intent);
    }

    public void pirateStart(View view) {
        Intent intent = new Intent(this, PirateActivity.class);
        startActivity(intent);
    }

    public void policeStart(View view) {
        Intent intent = new Intent(this, PoliceActivity.class);
        startActivity(intent);
    }

    public void traderStart(View view) {
        Intent intent = new Intent(this, TraderActivity.class);
        startActivity(intent);
    }

    private Planet getPlayerLocation() {
        return travelViewModel.getPlayerLocation();
    }

    private SolarSystem[] getSolarSystems() {
        return travelViewModel.getSolarSystems();
    }

    private Planet[] getPlanets() {
        return travelViewModel.getPlanets();
    }

    private int getDistance(int x1, int x2, int y1, int y2) {
        return travelViewModel.getDistance(x1, x2, y1, y2);
    }

    private int getX(Planet planet) {
        return planet.getxPlanet();
    }

    private int getY(Planet planet) {
        return planet.getyPlanet();
    }

    private String getSSname(SolarSystem solarSystem) {
        return solarSystem.getSsName();
    }

    private String getPlanetName(Planet planet) {
        return planet.getPlanetName();
    }

    private int getFuelCost(int distance) {
        return travelViewModel.getFuelCost(distance);
    }

    private int getHealth() {
        return travelViewModel.getHealth();
    }

    private int getFuel() {
        return travelViewModel.getFuel();
    }

    private void updatePlayerLocation(Planet planet) {
        travelViewModel.updatePlayerLocation(planet);
    }

    private void updateFuel(int fuel) {
        travelViewModel.updateFuel(fuel);
    }
}
