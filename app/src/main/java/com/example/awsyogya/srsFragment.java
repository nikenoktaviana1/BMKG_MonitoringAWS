package com.example.awsyogya;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class srsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener  {
    private View view;
    private SwipeRefreshLayout SwipeRefresh;
    private TextView azimut, alltitude,diffuse,global,nett,reflective,dni,sunshine,battery, time;


    public srsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        view=inflater.inflate(R.layout.fragment_srs, container, false);
        azimut = view.findViewById(R.id.azimut);
        alltitude = view.findViewById(R.id.alltitude);
        diffuse = view.findViewById(R.id.diffuse);
        global = view.findViewById(R.id.global);
        nett = view.findViewById(R.id.nett);
        reflective = view.findViewById(R.id.reflective);
        dni = view.findViewById(R.id.dni);
        sunshine = view.findViewById(R.id.sunshine);
        battery = view.findViewById(R.id.battery);
        time = view.findViewById(R.id.waktu_asrs);
        SwipeRefresh = view.findViewById(R.id.simpleSwipeRefreshLayout);
        SwipeRefresh.setOnRefreshListener(this);
        initData();

        return view;
    }

    private void initData(){
        azimut.setText(main.dataAsrs.getAzimuth() + " mm");
        alltitude.setText(main.dataAsrs.getAlltitude()+" mm");
        diffuse.setText(main.dataAsrs.getDiffuse_rad()+" ̊C");
        global.setText(main.dataAsrs.getGlobal_rad()+" ̊C");
        nett.setText(main.dataAsrs.getNett_rad()+" ̊C");
        reflective.setText(main.dataAsrs.getReflective_rad()+" ̊C");
        dni.setText(main.dataAsrs.getDni()+" ̊C");
        sunshine.setText(main.dataAsrs.getSunshine()+" ̊C");
        battery.setText(main.dataAsrs.getBattery()+" ̊C");
        time.setText(main.dataAsrs.getTanggal()+" ");
    }

    @Override
    public void onRefresh() {
        main.getApiAsrs(SwipeRefresh);
        initData();

    }
}
