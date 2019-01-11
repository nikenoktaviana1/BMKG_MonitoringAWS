package com.example.awsyogya;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_air extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{
    private SwipeRefreshLayout SwipeRefresh;
    private TextView txTemperature, txRH, txPressure, txTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_air);
        getSupportActionBar().setTitle("Air");

        txTemperature = findViewById(R.id.air_temperature);
        txRH = findViewById(R.id.air_rh);
        txPressure = findViewById(R.id.air_pressure);
        txTime = findViewById(R.id.air_waktu);
        SwipeRefresh = findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
        initData();
        }

        private void initData (){
            txTemperature.setText(main.dataBmkg.getTT_AIR()+" ̊C");
            txRH.setText(main.dataBmkg.getRH()+" %");
            txPressure.setText(main.dataBmkg.getPP_AIR()+ " hPa");
            txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());

        }


        public void onRefresh() {
            main.getApi(SwipeRefresh);
            initData();


    }
}
