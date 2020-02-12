package com.sp.familiavillage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RewardsHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rewards_home_page);
        findViewById(R.id.rewardsTechnologyButton).setOnClickListener(onTechnology);
        findViewById(R.id.rewardsFoodieButton).setOnClickListener(onFoodie);
        findViewById(R.id.rewardsLifestyleButton).setOnClickListener(onLifestyle);
        findViewById(R.id.backButton).setOnClickListener(onBack);
    }

    public View.OnClickListener onTechnology =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(RewardsHomePage.this, RewardsTechnologyPage.class);
            startActivity(intent);
        }
    };

    public View.OnClickListener onLifestyle =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(RewardsHomePage.this, RewardsLifestylePage.class);
            startActivity(intent);
        }
    };

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
