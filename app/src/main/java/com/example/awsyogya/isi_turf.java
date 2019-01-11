package com.example.awsyogya;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_turf extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{
    private SwipeRefreshLayout SwipeRefresh;
    private TextView turfmin5cm, turf0cm,turf5cm,turf10cm, turf20cm,turf50cm, turf100cm ,txTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_turf);
        getSupportActionBar().setTitle("Turf Soil");

        turfmin5cm = findViewById(R.id.turf_deptmin5);
        turf0cm = findViewById(R.id.turf_dept0);
        turf5cm = findViewById(R.id.turf_dept5);
        turf10cm = findViewById(R.id.turf_dept10);
        turf20cm = findViewById(R.id.turf_dept20);
        turf50cm = findViewById(R.id.turf_dept50);
        turf100cm = findViewById(R.id.turf_dept100);
        txTime = findViewById(R.id.turf_waktu);
        SwipeRefresh = findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
    }
     private void initData(){

        turfmin5cm.setText(main.dataBmkg.getTT_TS_M5()+" ̊C");
        turf0cm.setText(main.dataBmkg.getTT_TS_0()+" ̊C");
        turf5cm.setText(main.dataBmkg.getTT_TS_5()+" ̊C");
        turf10cm.setText(main.dataBmkg.getTT_TS_10()+" ̊C");
        turf20cm.setText(main.dataBmkg.getTT_TS_20()+" ̊C");
        turf50cm.setText(main.dataBmkg.getTT_TS_40()+" ̊C");
        turf100cm.setText(main.dataBmkg.getTT_TS_60()+" ̊C");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
    }
    public void onRefresh() {
        main.getApi(SwipeRefresh);
        initData();
    }
}
