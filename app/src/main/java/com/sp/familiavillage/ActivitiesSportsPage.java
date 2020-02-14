package com.sp.familiavillage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivitiesSportsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_sports_page);
        findViewById(R.id.backButton).setOnClickListener(onBack);
    }

    public View.OnClickListener onBack =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(ActivitiesSportsPage.this, ActivitiesHomePage.class);
            startActivity(intent);
        }
    };
}
