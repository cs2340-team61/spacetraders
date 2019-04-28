package edu.gatech.cs2340;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/**
 * The applications start and end activities
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.space); mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button configGame = findViewById(R.id.start_config);
        Button exitGame = findViewById(R.id.exit_button);
        configGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameConfig();
            }
        });
        exitGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void gameConfig() {
        Intent intent = new Intent(this, GameConfigActivity.class);
        startActivity(intent);
    }
}
