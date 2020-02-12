package com.sp.familiavillage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivitiesHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_home_page);
        findViewById(R.id.activitiesNatureButton).setOnClickListener(onNature);
        findViewById(R.id.activitiesSportsButton).setOnClickListener(onSports);
        findViewById(R.id.backButton).setOnClickListener(onBack);
    }
    public View.OnClickListener onNature =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(ActivitiesHomePage.this, ActivitiesNaturePage.class);
            startActivity(intent);
        }
    };

    public View.OnClickListener onSports =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(ActivitiesHomePage.this, ActivitiesSportsPage.class);
            startActivity(intent);
        }
    };

    public View.OnClickListener onBack =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(ActivitiesHomePage.this, HomePage.class);
            startActivity(intent);
        }
    };
}
