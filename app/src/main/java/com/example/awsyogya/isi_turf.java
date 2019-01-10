package com.example.awsyogya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_turf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_turf);
        getSupportActionBar().setTitle("Turf Soil");

        TextView turfmin5cm = findViewById(R.id.turf_deptmin5);
        TextView turf0cm = findViewById(R.id.turf_dept0);
        TextView turf5cm = findViewById(R.id.turf_dept5);
        TextView turf10cm = findViewById(R.id.turf_dept10);
        TextView turf20cm = findViewById(R.id.turf_dept20);
        TextView turf50cm = findViewById(R.id.turf_dept50);
        TextView turf100cm = findViewById(R.id.turf_dept100);
        TextView txTime = findViewById(R.id.turf_waktu);

        turfmin5cm.setText(main.dataBmkg.getTT_TS_M5()+" ̊C");
        turf0cm.setText(main.dataBmkg.getTT_TS_0()+" ̊C");
        turf5cm.setText(main.dataBmkg.getTT_TS_5()+" ̊C");
        turf10cm.setText(main.dataBmkg.getTT_TS_10()+" ̊C");
        turf20cm.setText(main.dataBmkg.getTT_TS_20()+" ̊C");
        turf50cm.setText(main.dataBmkg.getTT_TS_40()+" ̊C");
        turf100cm.setText(main.dataBmkg.getTT_TS_60()+" ̊C");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
    }
}
