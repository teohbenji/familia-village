package com.sp.familiavillage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class QRCodePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qr_scanner);
        findViewById(R.id.backButton).setOnClickListener(onBack);
    }

    public View.OnClickListener onBack =  new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(QRCodePage.this, HomePage.class);    //returns to home page
            startActivity(intent);
        }
    };
}
