package com.example.awsyogya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_air extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_air);
        getSupportActionBar().setTitle("Air");

        TextView txTemperature = findViewById(R.id.air_temperature);
        TextView txRH = findViewById(R.id.air_rh);
        TextView txPressure = findViewById(R.id.air_pressure);
        TextView txTime = findViewById(R.id.air_waktu);

        txTemperature.setText(main.dataBmkg.getTT_AIR()+" ̊C");
        txRH.setText(main.dataBmkg.getRH()+" %");
        txPressure.setText(main.dataBmkg.getPP_AIR()+ " hPa");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());

    }
}
