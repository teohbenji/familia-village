package com.sp.familiavillage;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        findViewById(R.id.awards).setOnClickListener(onRewards);
        findViewById(R.id.QR_scanner).setOnClickListener(onQR);
    }

    public View.OnClickListener onRewards =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(HomePage.this, RewardsPage.class);
            startActivity(intent);
        }
    };

    public View.OnClickListener onQR =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(HomePage.this, QRCodePage.class);
            startActivity(intent);
        }
    };

}
