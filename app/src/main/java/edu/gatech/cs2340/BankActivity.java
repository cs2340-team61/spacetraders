package edu.gatech.cs2340;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.space); mp.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        final BankViewModel bankViewModel = new BankViewModel(getApplication());

        final TextView curr = findViewById(R.id.currentNum);
        final TextView bank = findViewById(R.id.bankNum);
        Button withdraw = findViewById(R.id.withdrawB);
        Button deposit = findViewById(R.id.depositB);
        Button exitBank = findViewById(R.id.exitBank);
        final EditText withdrawEdit = findViewById(R.id.withdraw);
        final EditText depositEdit = findViewById(R.id.deposit);

        curr.setText("" + bankViewModel.getCredits());
        bank.setText("" + bankViewModel.getBankCredits());

        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = 0;
                try {
                    num = Integer.parseInt(withdrawEdit.getText().toString());

                    int cred = bankViewModel.getBankCredits();
                    int realCred = bankViewModel.getCredits();

                    if(num <= bankViewModel.getBankCredits() && num > 0) {
                        bankViewModel.setBankCredits(cred - num);
                        bankViewModel.setCredits(realCred + num);

                        curr.setText("" + bankViewModel.getCredits());
                        bank.setText("" + bankViewModel.getBankCredits());
                    }
                } catch (Exception e) {
                    (Toast.makeText(getApplication(), "input must be an integer",
                            Toast.LENGTH_LONG)).show();
                }
            }
        });

        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = 0;
                try {
                    num = Integer.parseInt(depositEdit.getText().toString());

                    int cred = bankViewModel.getBankCredits();
                    int realCred = bankViewModel.getCredits();

                    if(num <= bankViewModel.getCredits() && num > 0) {
                        bankViewModel.setBankCredits(cred + num);
                        bankViewModel.setCredits(realCred - num);

                        curr.setText("" + bankViewModel.getCredits());
                        bank.setText("" + bankViewModel.getBankCredits());
                    }
                } catch (Exception e) {
                    (Toast.makeText(getApplication(), "input must be an integer",
                            Toast.LENGTH_LONG)).show();
                }
            }
        });

        exitBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainGame();
                finish();
            }
        });
    }

    private void mainGame() {
        Intent intent = new Intent(this, GameMainActivity.class);
        startActivity(intent);
    }
}
