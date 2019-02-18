package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class GameConfigActivity extends AppCompatActivity {
    private GameViewModel gameViewModel;
    private EditText playerName;
    private EditText skillE;
    private EditText skillP;
    private EditText skillF;
    private EditText skillT;
    private Spinner gameDiffSpin;
    private Button startGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_config);

        playerName = findViewById(R.id.player_name_input);
        skillE = findViewById(R.id.skill_Value);
        skillP = findViewById(R.id.skill_Value2);
        skillF = findViewById(R.id.skill_Value3);
        skillT = findViewById(R.id.skill_Value4);
        gameDiffSpin = findViewById(R.id.diff_spinner);
        startGame = findViewById(R.id.start_button);

        ArrayAdapter<Difficulty> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Difficulty.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        gameDiffSpin.setAdapter(adapter);

        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = playerName.getText().toString();
                int sE = Integer.parseInt(skillE.getText().toString());
                int sP = Integer.parseInt(skillP.getText().toString());
                int sF = Integer.parseInt(skillF.getText().toString());
                int sT = Integer.parseInt(skillT.getText().toString());
                Difficulty dif = (Difficulty) gameDiffSpin.getSelectedItem();
                if (sT + sP + sF + sE != 16) {
                    (Toast.makeText(getApplication(), "Totals Allocation must be equal to 16!", Toast.LENGTH_LONG)).show();
                    finish();
                } else {
                    gameViewModel = new GameViewModel(getApplication());
                    gameViewModel.createGame(name, sE, sP, sF, sT, dif);
                    postConfig(v);
                    finish();
                }
            }
        });
    }

    public void postConfig(View view) {
        Intent intent = new Intent(this, PostConfigActivity.class);
        startActivity(intent);
    }
}
