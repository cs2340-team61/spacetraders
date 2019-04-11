package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TravelActivity extends AppCompatActivity {
    private final TravelViewModel travelViewModel = new TravelViewModel(getApplication());
    private TextView currentFuel;
    private TextView ssChoice;
    private TextView pChoice;
    private static final int magic11 = 11;
    private static final int magic12 = 12;
    private static final int magic13 = 13;
    private static final int magic14 = 14;
    private static final int magic15 = 15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        TextView solarSystem1 = findViewById(R.id.solarSystem1);
        TextView solarSystem2 = findViewById(R.id.solarSystem2);
        TextView solarSystem3 = findViewById(R.id.solarSystem3);
        TextView solarSystem4 = findViewById(R.id.solarSystem4);
        TextView solarSystem5 = findViewById(R.id.solarSystem5);
        TextView planet1 = findViewById(R.id.planet1);
        TextView planet2 = findViewById(R.id.planet2);
        TextView planet3 = findViewById(R.id.planet3);
        TextView planet4 = findViewById(R.id.planet4);
        TextView planet5 = findViewById(R.id.planet5);
        TextView planet6 = findViewById(R.id.planet6);
        TextView planet7 = findViewById(R.id.planet7);
        TextView planet8 = findViewById(R.id.planet8);
        TextView planet9 = findViewById(R.id.planet9);
        TextView planet10 = findViewById(R.id.planet10);
        TextView planet11 = findViewById(R.id.planet11);
        TextView planet12 = findViewById(R.id.planet12);
        TextView planet13 = findViewById(R.id.planet13);
        TextView planet14 = findViewById(R.id.planet14);
        TextView planet15 = findViewById(R.id.planet15);
        TextView distance1 = findViewById(R.id.distanceP1);
        TextView distance2 = findViewById(R.id.distanceP2);
        TextView distance3 = findViewById(R.id.distanceP3);
        TextView distance4 = findViewById(R.id.distanceP4);
        TextView distance5 = findViewById(R.id.distanceP5);
        TextView distance6 = findViewById(R.id.distanceP6);
        TextView distance7 = findViewById(R.id.distanceP7);
        TextView distance8 = findViewById(R.id.distanceP8);
        TextView distance9 = findViewById(R.id.distanceP9);
        TextView distance10 = findViewById(R.id.distanceP10);
        TextView distance11 = findViewById(R.id.distanceP11);
        TextView distance12 = findViewById(R.id.distanceP12);
        TextView distance13 = findViewById(R.id.distanceP13);
        TextView distance14 = findViewById(R.id.distanceP14);
        TextView distance15 = findViewById(R.id.distanceP15);
        TextView fuelCost1 = findViewById(R.id.fuelCost1);
        TextView fuelCost2 = findViewById(R.id.fuelCost2);
        TextView fuelCost3 = findViewById(R.id.fuelCost3);
        TextView fuelCost4 = findViewById(R.id.fuelCost4);
        TextView fuelCost5 = findViewById(R.id.fuelCost5);
        TextView fuelCost6 = findViewById(R.id.fuelCost6);
        TextView fuelCost7 = findViewById(R.id.fuelCost7);
        TextView fuelCost8 = findViewById(R.id.fuelCost8);
        TextView fuelCost9 = findViewById(R.id.fuelCost9);
        TextView fuelCost10 = findViewById(R.id.fuelCost10);
        TextView fuelCost11 = findViewById(R.id.fuelCost11);
        TextView fuelCost12 = findViewById(R.id.fuelCost12);
        TextView fuelCost13 = findViewById(R.id.fuelCost13);
        TextView fuelCost14 = findViewById(R.id.fuelCost14);
        TextView fuelCost15 = findViewById(R.id.fuelCost15);
        // FIXED: typo: Haelth -> Health
        TextView currentHealth = findViewById(R.id.currentHealth);
        currentFuel = findViewById(R.id.currentFuel);
        ssChoice = findViewById(R.id.ssChoice);
        pChoice = findViewById(R.id.pChoice);
        Button ssUp = findViewById(R.id.ssUp);
        Button ssDown = findViewById(R.id.ssDown);
        Button pUp = findViewById(R.id.pUp);
        Button pDown = findViewById(R.id.pDown);
        Button go = findViewById(R.id.travel);
        Button cancel = findViewById(R.id.cancel);

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
                Planet update = planets[((Integer.parseInt(ssChoice.getText().toString()) * 3)
                        + Integer.parseInt(pChoice.getText().toString())) - 4];
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
                            pirateStart();
                            finish();
                        } else if (eventCheck == 2) {
                            policeStart();
                            finish();
                        } else if (eventCheck == 3) {
                            traderStart();
                            finish();
                        } else {
                            restartMain();
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
                restartMain();
                finish();
            }
        });
    }

    private void restartMain() {
        Intent intent = new Intent(this, GameMainActivity.class);
        startActivity(intent);
    }

    private void pirateStart() {
        Intent intent = new Intent(this, PirateActivity.class);
        startActivity(intent);
    }

    private void policeStart() {
        Intent intent = new Intent(this, PoliceActivity.class);
        startActivity(intent);
    }

    private void traderStart() {
        Intent intent = new Intent(this, TraderActivity.class);
        startActivity(intent);
    }

    private Planet getPlayerLocation() {
        return travelViewModel.getPlayerLocation();
    }

    private SolarSystem[] getSolarSystems() {
        Universe universe = travelViewModel.getUniverse();
        return travelViewModel.getSolarSystems(universe);
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
