package com.mrcaracal.sms_ve_mail_gonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("SMS ve MAİL");

    }

    public void sms_gonderme_bolumu(View view) {
        Intent intent = new Intent(getApplicationContext(), Sms_Bolumu.class);
        startActivity(intent);
    }

    public void mail_gonderme_bolumu(View view) {
        Intent intent = new Intent(getApplicationContext(), Mail_Bolumu.class);
        startActivity(intent);
    }
}
