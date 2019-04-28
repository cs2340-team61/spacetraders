package edu.gatech.cs2340;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        final BankViewModel bankViewModel = new BankViewModel(getApplication());

        TextView curr = findViewById(R.id.currentNum);
        TextView bank = findViewById(R.id.bankNum);
        Button withdraw = findViewById(R.id.withdrawB);
        Button deposit = findViewById(R.id.depositB);
        final EditText withdrawEdit = findViewById(R.id.withdraw);
        EditText depositEdit = findViewById(R.id.deposit);

        curr.setText("" + bankViewModel.getCredits());
        bank.setText("" + bankViewModel.getBankCredits());

        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = 0;
                try {
                    num = Integer.parseInt(withdrawEdit.getText().toString());
                } catch (Exception e) {
                    throw new IndexOutOfBoundsException();
                }
                if(num <= bankViewModel.getBankCredits()) {

                }
            }
        });
    }
}
