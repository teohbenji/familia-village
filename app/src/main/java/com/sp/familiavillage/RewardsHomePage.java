package com.sp.familiavillage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class RewardsHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rewards_home_page);
        findViewById(R.id.foodieRewardsButton).setOnClickListener(onFoodie);
        findViewById(R.id.backButton).setOnClickListener(onBack);
    }

    public View.OnClickListener onFoodie =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(RewardsHomePage.this, RewardsFoodiePage.class);
            startActivity(intent);
        }
    };

    public View.OnClickListener onBack =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(RewardsHomePage.this, HomePage.class);
            startActivity(intent);
        }
    };
}
