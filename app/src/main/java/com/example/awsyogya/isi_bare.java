package com.example.awsyogya;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class isi_bare extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{
    private SwipeRefreshLayout SwipeRefresh;
    private TextView barmin5cm, bar0cm, bar5cm, bar10cm, bar20cm, bar50cm, bar100cm, barTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_bar);
        getSupportActionBar().setTitle("Bare Soil");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        barmin5cm = findViewById(R.id.bar_deptmin5);
        bar0cm = findViewById(R.id.bar_dept0);
        bar5cm = findViewById(R.id.bar_dept5);
        bar10cm = findViewById(R.id.bar_dept10);
        bar20cm = findViewById(R.id.bar_dept20);
        bar50cm = findViewById(R.id.bar_dept50);
        bar100cm = findViewById(R.id.bar_dept100);
        barTime = findViewById(R.id.bar_waktu);
        SwipeRefresh = findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
        initData();
    }
        private void initData (){
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

