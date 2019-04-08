package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class GameConfigActivity extends AppCompatActivity {
    private GameViewModel gameViewModel;
    private EditText playerName;
    private TextView skillE;
    private TextView skillP;
    private TextView skillF;
    private TextView skillT;
    private TextView PointsR;
    private Spinner gameDiffSpin;
    private static final int skillMax = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_config);

        Button startGame;
        Button upE;
        Button upP;
        Button upF;
        Button upT;
        Button downE;
        Button downP;
        Button downF;
        Button downT;
        Button loadSavedGame;

        playerName = findViewById(R.id.player_name_input);
        skillE = findViewById(R.id.engineer_skill);
        skillP = findViewById(R.id.pilot_skill);
        skillF = findViewById(R.id.fight_skill);
        skillT = findViewById(R.id.trader_skill);
        PointsR = findViewById(R.id.remaining_points);
        gameDiffSpin = findViewById(R.id.diff_spinner);
        startGame = findViewById(R.id.start_button);
        upE = findViewById(R.id.up1_button);
        upP = findViewById(R.id.up1_button2);
        upF = findViewById(R.id.up1_button3);
        upT = findViewById(R.id.up1_button4);
        downE = findViewById(R.id.down1_button1);
        downP = findViewById(R.id.down1_button2);
        downF = findViewById(R.id.down1_button3);
        downT = findViewById(R.id.down1_button4);
        loadSavedGame = findViewById(R.id.up1_button5);

        ArrayAdapter<Difficulty> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Difficulty.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gameDiffSpin.setAdapter(adapter);

        upE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(skillE.getText().toString()) < skillMax && Integer.parseInt(PointsR.getText().toString()) > 0) {
                    skillE.setText("" + (Integer.parseInt(skillE.getText().toString()) + 1));
                    PointsR.setText("" + (Integer.parseInt(PointsR.getText().toString()) - 1));
                }
            }
        });

        upP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(skillP.getText().toString()) < skillMax && Integer.parseInt(PointsR.getText().toString()) > 0) {
                    skillP.setText("" + (Integer.parseInt(skillP.getText().toString()) + 1));
                    PointsR.setText("" + (Integer.parseInt(PointsR.getText().toString()) - 1));
                }
            }
        });

        upF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(skillF.getText().toString()) < skillMax && Integer.parseInt(PointsR.getText().toString()) > 0) {
                    skillF.setText("" + (Integer.parseInt(skillF.getText().toString()) + 1));
                    PointsR.setText("" + (Integer.parseInt(PointsR.getText().toString()) - 1));
                }
            }
        });

        upT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(skillT.getText().toString()) < skillMax && Integer.parseInt(PointsR.getText().toString()) > 0) {
                    skillT.setText("" + (Integer.parseInt(skillT.getText().toString()) + 1));
                    PointsR.setText("" + (Integer.parseInt(PointsR.getText().toString()) - 1));
                }
            }
        });

        downE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(skillE.getText().toString()) > 0 && Integer.parseInt(PointsR.getText().toString()) < skillMax) {
                    skillE.setText("" + (Integer.parseInt(skillE.getText().toString()) - 1));
                    PointsR.setText("" + (Integer.parseInt(PointsR.getText().toString()) + 1));
                }
            }
        });

        downP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(skillP.getText().toString()) > 0 && Integer.parseInt(PointsR.getText().toString()) < skillMax) {
                    skillP.setText("" + (Integer.parseInt(skillP.getText().toString()) - 1));
                    PointsR.setText("" + (Integer.parseInt(PointsR.getText().toString()) + 1));
                }
            }
        });

        downF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(skillF.getText().toString()) > 0 && Integer.parseInt(PointsR.getText().toString()) < skillMax) {
                    skillF.setText("" + (Integer.parseInt(skillF.getText().toString()) - 1));
                    PointsR.setText("" + (Integer.parseInt(PointsR.getText().toString()) + 1));
                }
            }
        });

        downT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(skillT.getText().toString()) > 0 && Integer.parseInt(PointsR.getText().toString()) < skillMax) {
                    skillT.setText("" + (Integer.parseInt(skillT.getText().toString()) - 1));
                    PointsR.setText("" + (Integer.parseInt(PointsR.getText().toString()) + 1));
                }
            }
        });

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = playerName.getText().toString();
                int sE = Integer.parseInt(skillE.getText().toString());
                int sP = Integer.parseInt(skillP.getText().toString());
                int sF = Integer.parseInt(skillF.getText().toString());
                int sT = Integer.parseInt(skillT.getText().toString());
                Difficulty dif = (Difficulty) gameDiffSpin.getSelectedItem();
                if (sT + sP + sF + sE == skillMax) {
                    gameViewModel = new GameViewModel(getApplication());
                    int[] skillArray = new int[4];
                    skillArray[0] = sE;
                    skillArray[1] = sP;
                    skillArray[2] = sF;
                    skillArray[3] = sT;
                    gameViewModel.createGame(name, skillArray, dif);
                    postConfig();

                    finish();
                } else {
                    (Toast.makeText(getApplication(), "Totals Allocation must be equal to 16!", Toast.LENGTH_LONG)).show();
                }
            }
        });

        loadSavedGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameViewModel = new GameViewModel(getApplication());
                boolean loadSuccess = gameViewModel.resumeSavedGame();
                if (loadSuccess) {
                    mainGame();
                    finish();
                } else {
                    Toast.makeText(getApplication(), "No game saved", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void postConfig() {
        Intent intent = new Intent(this, PostConfigActivity.class);
        startActivity(intent);
    }

    private void mainGame() {
        Intent intent = new Intent(this, GameMainActivity.class);
        startActivity(intent);
    }
}