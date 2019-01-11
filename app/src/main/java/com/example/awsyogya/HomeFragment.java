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


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener  {
    private SwipeRefreshLayout SwipeRefresh;
    private TextView txdirec, txTime;
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
        SwipeRefresh = view.findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
        initData();
    }
    private void initData(){
        txdirec.setText(main.dataBmkg.getWD()+" ̊");
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());
    }
    @Override
    public void onRefresh() {
        main.getApi(SwipeRefresh);
        initData();
    }

    }
