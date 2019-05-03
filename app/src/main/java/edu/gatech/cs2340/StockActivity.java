package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StockActivity extends AppCompatActivity {
    private final TravelViewModel travelViewModel = new TravelViewModel(getApplication());
    final BankViewModel bankViewModel = new BankViewModel(getApplication());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);

        final TextView stock1 = findViewById(R.id.stockNum);
        final TextView stock2 = findViewById(R.id.stockNum2);
        final TextView stock3 = findViewById(R.id.stockNum3);
        final TextView stock4 = findViewById(R.id.stockNum4);
        final TextView stock5 = findViewById(R.id.stockNum5);

        TextView cred1 = findViewById(R.id.credNum);
        TextView cred2 = findViewById(R.id.credNum2);
        TextView cred3 = findViewById(R.id.credNum3);
        TextView cred4 = findViewById(R.id.credNum4);
        TextView cred5 = findViewById(R.id.credNum5);

        Button buy1 = findViewById(R.id.buy);
        Button buy2 = findViewById(R.id.buy2);
        Button buy3 = findViewById(R.id.buy3);
        Button buy4 = findViewById(R.id.buy4);
        Button buy5 = findViewById(R.id.buy5);

        Button sell1 = findViewById(R.id.sell);
        Button sell2 = findViewById(R.id.sell2);
        Button sell3 = findViewById(R.id.sell3);
        Button sell4 = findViewById(R.id.sell4);
        Button sell5 = findViewById(R.id.sell5);

        cred1.setText("" + travelViewModel.getStock1());
        cred2.setText("" + travelViewModel.getStock2());
        cred3.setText("" + travelViewModel.getStock3());
        cred4.setText("" + travelViewModel.getStock4());
        cred5.setText("" + travelViewModel.getStock5());

        stock1.setText("" + travelViewModel.getStockOwned1());
        stock2.setText("" + travelViewModel.getStockOwned2());
        stock3.setText("" + travelViewModel.getStockOwned3());
        stock4.setText("" + travelViewModel.getStockOwned4());
        stock5.setText("" + travelViewModel.getStockOwned5());

        Button leave = findViewById(R.id.leaveS);

        buy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int creds = travelViewModel.getCredits();
                if(creds >= travelViewModel.getStock1()) {
                    travelViewModel.setStockOwned1(travelViewModel.getStockOwned1() + 1);
                    bankViewModel.setCredits(creds - travelViewModel.getStock1());
                    stock1.setText("" + travelViewModel.getStockOwned1());
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }
            }
        });

        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int creds = travelViewModel.getCredits();
                if(creds >= travelViewModel.getStock2()) {
                    travelViewModel.setStockOwned2(travelViewModel.getStockOwned2() + 1);
                    bankViewModel.setCredits(creds - travelViewModel.getStock2());
                    stock2.setText("" + travelViewModel.getStockOwned2());
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }
            }
        });

        buy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int creds = travelViewModel.getCredits();
                if(creds >= travelViewModel.getStock3()) {
                    travelViewModel.setStockOwned3(travelViewModel.getStockOwned3() + 1);
                    bankViewModel.setCredits(creds - travelViewModel.getStock3());
                    stock3.setText("" + travelViewModel.getStockOwned3());
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }
            }
        });

        buy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int creds = travelViewModel.getCredits();
                if(creds >= travelViewModel.getStock4()) {
                    travelViewModel.setStockOwned4(travelViewModel.getStockOwned4() + 1);
                    bankViewModel.setCredits(creds - travelViewModel.getStock4());
                    stock4.setText("" + travelViewModel.getStockOwned4());
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }
            }
        });

        buy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int creds = travelViewModel.getCredits();
                if(creds >= travelViewModel.getStock5()) {
                    travelViewModel.setStockOwned5(travelViewModel.getStockOwned5() + 1);
                    bankViewModel.setCredits(creds - travelViewModel.getStock5());
                    stock5.setText("" + travelViewModel.getStockOwned5());
                } else {
                    (Toast.makeText(getApplication(), "not enough credits",
                            Toast.LENGTH_LONG)).show();
                }
            }
        });

        sell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stockOwned = travelViewModel.getStockOwned1();
                if(stockOwned > 0) {
                    travelViewModel.setStockOwned1(travelViewModel.getStockOwned1() - 1);
                    bankViewModel.setCredits(stockOwned + travelViewModel.getStock1());
                    stock1.setText("" + travelViewModel.getStockOwned1());
                }
            }
        });

        sell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stockOwned = travelViewModel.getStockOwned2();
                if(stockOwned > 0) {
                    travelViewModel.setStockOwned2(travelViewModel.getStockOwned2() - 1);
                    bankViewModel.setCredits(stockOwned + travelViewModel.getStock2());
                    stock2.setText("" + travelViewModel.getStockOwned2());
                }
            }
        });

        sell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stockOwned = travelViewModel.getStockOwned3();
                if(stockOwned > 0) {
                    travelViewModel.setStockOwned3(travelViewModel.getStockOwned3() - 1);
                    bankViewModel.setCredits(stockOwned + travelViewModel.getStock3());
                    stock3.setText("" + travelViewModel.getStockOwned3());
                }
            }
        });

        sell4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stockOwned = travelViewModel.getStockOwned4();
                if(stockOwned > 0) {
                    travelViewModel.setStockOwned4(travelViewModel.getStockOwned4() - 1);
                    bankViewModel.setCredits(stockOwned + travelViewModel.getStock4());
                    stock4.setText("" + travelViewModel.getStockOwned4());
                }
            }
        });

        sell5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stockOwned = travelViewModel.getStockOwned5();
                if(stockOwned > 0) {
                    travelViewModel.setStockOwned5(travelViewModel.getStockOwned5() - 1);
                    bankViewModel.setCredits(stockOwned + travelViewModel.getStock5());
                    stock5.setText("" + travelViewModel.getStockOwned5());
                }
            }
        });

        leave.setOnClickListener(new View.OnClickListener() {
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
