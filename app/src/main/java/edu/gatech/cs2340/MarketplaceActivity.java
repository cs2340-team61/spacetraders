package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MarketplaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_select);

        Button leaveMarket = findViewById(R.id.Leave);
        Button buyItems = findViewById(R.id.buy_Market);
        Button sellItems = findViewById(R.id.Sell_Market);
        Button inven = findViewById(R.id.button8);
        MarketViewModel marketViewModel = new MarketViewModel(getApplication());
        marketViewModel.createMarket();

        buyItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marketplaceBuy();
            }
        });

        sellItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marketplaceSell();
            }
        });

        leaveMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leaveMarket();
                finish();
            }
        });

        inven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewInven();
            }
        });
    }

    private void marketplaceBuy() {
        Intent intent = new Intent(this, MarketBuyActivity.class);
        startActivity(intent);
    }

    private void marketplaceSell() {
        Intent intent = new Intent(this, MarketSellActivity.class);
        startActivity(intent);
    }

    private void leaveMarket() {
        Intent intent = new Intent(this,GameMainActivity.class);
        startActivity(intent);
    }

    private void viewInven() {
        Intent intent = new Intent(this, ShipInventoryActivity.class);
        startActivity(intent);
    }


}
