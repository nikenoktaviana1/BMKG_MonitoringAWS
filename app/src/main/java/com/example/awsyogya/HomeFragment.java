package com.example.awsyogya;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.content.Intent;

import com.example.awsyogya.api.ApiService;
import com.example.awsyogya.model.ApiResponse;
import com.example.awsyogya.network.Network;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener  {
    private SwipeRefreshLayout SwipeRefresh;
    private TextView txdirec, txTime, direc;
    private View view;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);


        // hello.setOnClickListener(new View.OnClickListener() {
        //   @Override
        // public void onClick(View view) {
        //   Toast.makeText(getContext(),"Cl icked",Toast.LENGTH_SHORT).show();
        // }
        //});
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txTime = view.findViewById(R.id.home_waktu);
        txdirec = view.findViewById(R.id.windDirec);
        direc = view.findViewById(R.id.Direction);
        SwipeRefresh = view.findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
        initData();
    }
    private void initData(){
        ApiService api = Network.getRetrofit().create(ApiService.class);
        api.getData().enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                double derajat = Double.parseDouble(main.dataBmkg.getWD().toString());
                txdirec.setText(main.dataBmkg.getWD()+" ̊ ");
                if(derajat==0){
                    direc.setText("North");
                }
                else if (derajat>0 && derajat<45){
                    direc.setText("North Northeast");
                }
                else if (derajat == 45){
                    direc.setText("Northeast");
                }
                else if (derajat>45 && derajat<90){
                    direc.setText("East Northeast");
                }
                else if (derajat==90){
                    direc.setText("East");
                }
                else if (derajat>90 && derajat<135){
                    direc.setText("East Southeast ");
                }
                else if (derajat == 135){
                    direc.setText("Southeast ");
                }
                else if (derajat>135 && derajat<180){
                    direc.setText("South");
                }
                else if (derajat == 180){
                    direc.setText("South Southwest");
                }
                else if (derajat>180 && derajat <225){
                    direc.setText("Southwest");
                }
                else if (derajat==225){
                    direc.setText("Southwest ");
                }
                else if (derajat>225 && derajat <270){
                    direc.setText("West Southwest ");
                }
                else if (derajat == 270){
                    direc.setText("West ");
                }
                else if (derajat>270 && derajat<315){
                    direc.setText("West Nortwest");
                }
                else if (derajat == 315){
                    direc.setText("Nortwest");
                }
                else if (derajat>315 && derajat<=359){
                    direc.setText("Nort Nortwest");
                }

                txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {


            }
        });
    }

    @Override
    public void onRefresh() {
        main.getApi(SwipeRefresh);
        initData();
    }

    }
