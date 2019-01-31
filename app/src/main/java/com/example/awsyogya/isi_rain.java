package com.example.awsyogya;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.awsyogya.api.ApiService;
import com.example.awsyogya.model.ApiResponse;
import com.example.awsyogya.network.Network;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class isi_rain extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{
    private SwipeRefreshLayout SwipeRefresh;
    private TextView txHujan, txEvaporasi, txSurface, txTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_rain);
        getSupportActionBar().setTitle("Rain & Evaporation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        txHujan = findViewById(R.id.rain_rain);
        txEvaporasi = findViewById(R.id.rain_evaporation);
        txSurface = findViewById(R.id.rain_surface);
        txTime = findViewById(R.id.rain_waktu);
        SwipeRefresh = findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
        initData();
    }
    private void initData(){
        txEvaporasi.setText(main.dataBmkg.getWL() + " mm");
        txHujan.setText(main.dataBmkg.getRR()+" mm");
        txSurface.setText(main.dataBmkg.getTT_WL()+" ̊C");
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
