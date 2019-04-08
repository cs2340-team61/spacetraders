package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button configGame;
    private Button exitGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configGame = findViewById(R.id.start_config);
        exitGame = findViewById(R.id.exit_button);
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
