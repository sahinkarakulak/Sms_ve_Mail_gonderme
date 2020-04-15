package com.mrcaracal.sms_ve_mail_gonderme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Sms_Bolumu extends AppCompatActivity {

    EditText edt_numara, edt_mesaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms__bolumu);

        setTitle("SMS GÖNDER");

        edt_numara = findViewById(R.id.edt_numara);
        edt_mesaj = findViewById(R.id.edt_mesaj);

    }

    public void sms_gonder(View view) {

        String vNumara = edt_numara.getText().toString();
        String vMesaj = edt_mesaj.getText().toString();

        Log.i("TAGX", "sms_gonder: "+vNumara);
        Log.i("TAGX", "sms_gonder: "+vMesaj);

        Uri uri = Uri.parse("smsto:"+vNumara);
        Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
        intent.putExtra("sms_body",vMesaj);
        startActivity(intent);

    }
}
