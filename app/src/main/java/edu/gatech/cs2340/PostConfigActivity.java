package edu.gatech.cs2340;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * class that shows the UI for the players current skill points, difficulty, and
 * starting credits
 */
public class PostConfigActivity extends AppCompatActivity {
    private final GameViewModel gameViewModel = new GameViewModel(getApplication());
    private final Player player = gameViewModel.getPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.space); mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_config);

        TextView eSkill = findViewById(R.id.engineer_config);
        TextView pSkill = findViewById(R.id.pilot_config);
        TextView fSkill = findViewById(R.id.fight_config);
        TextView tSkill = findViewById(R.id.trader_config);
        TextView diffG = findViewById(R.id.gameDiff);
        TextView pName = findViewById(R.id.playerName);
        TextView shipName = findViewById(R.id.shipName);

        eSkill.setText("" + getSkillEngineer());
        pSkill.setText("" + getSkillPilot());
        fSkill.setText("" + getSkillFighter());
        tSkill.setText("" + getSkillTrader());
        Difficulty difficulty = getDifficulty();
        diffG.setText("Game Difficulty: " + getDiffString(difficulty));
        pName.setText(player.getPlayerName());
        shipName.setText(gameViewModel.getShipName());

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

    private String getDiffString(Difficulty difficulty) {
        return difficulty.getDiff();
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
