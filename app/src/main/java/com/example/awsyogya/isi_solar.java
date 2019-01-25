package com.example.awsyogya;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_solar extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{
    private SwipeRefreshLayout SwipeRefresh;
    private TextView txSolar, txTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_solar);
        getSupportActionBar().setTitle("Solar Radiation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txSolar = findViewById(R.id.solar_radiation);
        txTime = findViewById(R.id.solar_waktu);
        SwipeRefresh = findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
        initData();
    }
    private void initData(){
        txSolar.setText(main.dataBmkg.getSR()+ " W/m2");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
    }
    public void onRefresh() {
        main.getApi(SwipeRefresh);
        initData();
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
