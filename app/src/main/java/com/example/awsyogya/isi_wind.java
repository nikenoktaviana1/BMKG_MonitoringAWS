package com.example.awsyogya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_wind extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_wind);
        getSupportActionBar().setTitle("Wind");

        TextView txSpeed = findViewById(R.id.wind_speed);
        TextView txDirection = findViewById(R.id.wind_direction);
        TextView txTime = findViewById(R.id.wind_waktu);

        txSpeed.setText(main.dataBmkg.getWS()+" knot");
        txDirection.setText(main.dataBmkg.getWD()+" ̊");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
    }
}
