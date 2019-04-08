package edu.gatech.cs2340;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PostConfigActivity extends AppCompatActivity {
    private final GameViewModel gameViewModel = new GameViewModel(getApplication());
    private final Player player = gameViewModel.getPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_config);

        TextView eSkill = findViewById(R.id.engineer_config);
        TextView pSkill = findViewById(R.id.pilot_config);
        TextView fSkill = findViewById(R.id.fight_config);
        TextView tSkill = findViewById(R.id.trader_config);
        TextView diffG = findViewById(R.id.gameDiff);
        TextView pName = findViewById(R.id.playerName);

        eSkill.setText("" + getSkillEngineer());
        pSkill.setText("" + getSkillPilot());
        fSkill.setText("" + getSkillFighter());
        tSkill.setText("" + getSkillTrader());
        Difficulty difficulty = getDifficulty();
        diffG.setText("Game Difficulty: " + difficulty.getDiff());
        pName.setText(player.getPlayerName());

        Button continueB = findViewById(R.id.button_cont);
        continueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameStart();
                finish();
            }
        });

        Button exitGame = findViewById(R.id.exit_button);
        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void gameStart() {
        Intent intent = new Intent(this, GameStartActivity.class);
        startActivity(intent);
    }

    private Difficulty getDifficulty() {
        return gameViewModel.getDifficulty();
    }

    private int getSkillEngineer() {
        return player.getSkillEngineer();
    }

    private int getSkillPilot() {
        return player.getSkillPilot();
    }

    private int getSkillFighter() {
        return player.getSkillFighter();
    }

    private int getSkillTrader() {
        return player.getSkillTrader();
    }

}
