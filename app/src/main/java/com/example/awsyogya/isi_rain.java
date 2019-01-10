package com.example.awsyogya;

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

public class isi_rain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_rain);
        getSupportActionBar().setTitle("Rain");

        TextView txHujan = findViewById(R.id.rain_rain);
        TextView txEvaporasi = findViewById(R.id.rain_evaporation);
        TextView txSurface = findViewById(R.id.rain_surface);
        TextView txTime = findViewById(R.id.rain_waktu);

        txEvaporasi.setText(main.dataBmkg.getWL() + " mm");
        txHujan.setText(main.dataBmkg.getRR()+" mm");
        txSurface.setText(main.dataBmkg.getTT_WL()+" ̊C");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
    }
}
