package com.mrcaracal.sms_ve_mail_gonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Mail_Bolumu extends AppCompatActivity {

    EditText edt_alici, edt_baslik, edt_mesaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail__bolumu);

        setTitle("MAİL GÖNDER");

        edt_alici = findViewById(R.id.edt_alici);
        edt_baslik = findViewById(R.id.edt_baslik);
        edt_mesaj = findViewById(R.id.edt_mesaj);

    }

    public void mail_gonder(View view) {

        String alici = edt_alici.getText().toString();
        String[] alicilar = alici.split(",");
        String baslik = edt_baslik.getText().toString();
        String mesaj = edt_mesaj.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, alicilar);
        intent.putExtra(Intent.EXTRA_SUBJECT, baslik);
        intent.putExtra(Intent.EXTRA_TEXT, mesaj);

        //intent.setType("message/rfc822");
        intent.setType("plain/text");

        startActivity(Intent.createChooser(intent,"Ne ile göndermek istersin?"));

    }
}
