package com.example.awsyogya;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_wind extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener {
    private SwipeRefreshLayout SwipeRefresh;
    private TextView txSpeed, txDirection, txTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_wind);
        getSupportActionBar().setTitle("Wind");

        txSpeed = findViewById(R.id.wind_speed);
        txDirection = findViewById(R.id.wind_direction);
        txTime = findViewById(R.id.wind_waktu);
        SwipeRefresh = findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
       initData();
    }
    private void initData(){
        txSpeed.setText(main.dataBmkg.getWS()+" knot");
        txDirection.setText(main.dataBmkg.getWD()+" ̊");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
    }
    @Override
    public void onRefresh() {
        main.getApi(SwipeRefresh);
        initData();
    }

}
