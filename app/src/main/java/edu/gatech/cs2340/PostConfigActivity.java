package edu.gatech.cs2340;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PostConfigActivity extends AppCompatActivity {
    private Button exitGame;
    private Button continueB;
    private TextView eSkill;
    private TextView pSkill;
    private TextView fSkill;
    private TextView tSkill;
    private TextView diffG;
    private TextView pName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_config);

        eSkill = findViewById(R.id.engineer_config);
        pSkill = findViewById(R.id.pilot_config);
        fSkill = findViewById(R.id.fight_config);
        tSkill = findViewById(R.id.trader_config);
        diffG = findViewById(R.id.gameDiff);
        pName = findViewById(R.id.playerName);

        eSkill.setText(getIntent().getStringExtra("EngineerSkill"));
        pSkill.setText(getIntent().getStringExtra("PilotSkill"));
        fSkill.setText(getIntent().getStringExtra("FighterSkill"));
        tSkill.setText(getIntent().getStringExtra("TraderSkill"));
        diffG.setText("Game Difficulty: " + getIntent().getStringExtra("Difficulty"));
        pName.setText(getIntent().getStringExtra("name"));

        continueB = findViewById(R.id.button_cont);
        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameStart(v);
                finish();
            }
        });

        exitGame = findViewById(R.id.exit_button);
        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void gameStart(View view) {
        Intent intent = new Intent(this, GameStartActivity.class);
        startActivity(intent);
    }

}
