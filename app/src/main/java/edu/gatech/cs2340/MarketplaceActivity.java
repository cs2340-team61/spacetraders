package edu.gatech.cs2340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MarketplaceActivity extends AppCompatActivity {
    private MarketViewModel marketViewModel;
    private Button leaveMarket;
    private Button buyItems;
    private Button sellItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_select);

        leaveMarket = findViewById(R.id.Leave);
        buyItems = findViewById(R.id.buy_Market);
        sellItems = findViewById(R.id.Sell_Market);
        marketViewModel = new MarketViewModel(getApplication());
        marketViewModel.createMarket();

        buyItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marketplaceBuy(v);
            }
        });

        sellItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marketplaceSell(v);
            }
        });
    }

    public void marketplaceBuy(View view) {
        Intent intent = new Intent(this, MarketBuyActivity.class);
        startActivity(intent);
    }

    public void marketplaceSell(View view) {
        Intent intent = new Intent(this, MarketSellActivity.class);
        startActivity(intent);
    }

    public void leaveMarket(View view) {
        Intent intent = new Intent(this,GameMainActivity.class);
        startActivity(intent);
    }


}
