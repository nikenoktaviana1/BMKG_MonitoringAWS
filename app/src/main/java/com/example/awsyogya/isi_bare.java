package com.example.awsyogya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_bare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_bar);
        getSupportActionBar().setTitle("Bare Soil");


        TextView barmin5cm = findViewById(R.id.bar_deptmin5);
        TextView bar0cm = findViewById(R.id.bar_dept0);
        TextView bar5cm = findViewById(R.id.bar_dept5);
        TextView bar10cm = findViewById(R.id.bar_dept10);
        TextView bar20cm = findViewById(R.id.bar_dept20);
        TextView bar50cm = findViewById(R.id.bar_dept50);
        TextView bar100cm = findViewById(R.id.bar_dept100);
        TextView barTime = findViewById(R.id.bar_waktu);

        barmin5cm.setText(main.dataBmkg.getTT_BS_M5()+" ̊C");
        bar0cm.setText(main.dataBmkg.getTT_BS_0()+" ̊C");
        bar0cm.setText(main.dataBmkg.getTT_BS_0()+" ̊C");
        bar5cm.setText(main.dataBmkg.getTT_BS_5()+" ̊C");
        bar10cm.setText(main.dataBmkg.getTT_BS_10()+" ̊C");
        bar20cm.setText(main.dataBmkg.getTT_BS_20()+" ̊C");
        bar50cm.setText(main.dataBmkg.getTT_BS_40()+" ̊C");
        bar100cm.setText(main.dataBmkg.getTT_BS_60()+" ̊C");
        barTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());

    }
}
