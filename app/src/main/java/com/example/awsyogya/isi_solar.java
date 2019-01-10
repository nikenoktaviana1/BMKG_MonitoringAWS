package com.example.awsyogya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_solar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_solar);
        getSupportActionBar().setTitle("Solar Radiation");

        TextView txSolar = findViewById(R.id.solar_radiation);
        TextView txTime = findViewById(R.id.solar_waktu);

        txSolar.setText(main.dataBmkg.getSR()+ " W/m2");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
    }
}
