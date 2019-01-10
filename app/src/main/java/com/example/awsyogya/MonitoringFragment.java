package com.example.awsyogya;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class MonitoringFragment extends Fragment {
    private View view;
    private TextView hello;
    private LinearLayout menu_rain;
    private LinearLayout menu_wind;
    private LinearLayout menu_air;
    private LinearLayout menu_turf;
    private LinearLayout menu_solar;
    private LinearLayout menu_bare;
    public MonitoringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_monitoring, container, false);
       menu_rain= (LinearLayout)view.findViewById(R.id.menu_rain);
       menu_rain.setOnClickListener(new View.OnClickListener(){

            @Override
          public void onClick(View view) {
               Toast.makeText(getActivity(),"Rain", Toast.LENGTH_SHORT).show();

               Intent pindah = new Intent(getActivity(),isi_rain.class);
              startActivity(pindah);
            }
        });
        menu_wind= (LinearLayout)view.findViewById(R.id.menu_wind);
        menu_wind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Wind", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(getActivity(),isi_wind.class);
                startActivity(pindah);
            }
        });
        menu_air= (LinearLayout)view.findViewById(R.id.menu_air);
        menu_air.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Air", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(getActivity(),isi_air.class);
                startActivity(pindah);
            }
        });
        menu_turf= (LinearLayout)view.findViewById(R.id.menu_turf);
        menu_turf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Turf Soil", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(getActivity(),isi_turf.class);
                startActivity(pindah);
            }
        });
        menu_solar= (LinearLayout)view.findViewById(R.id.menu_solar);
        menu_solar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Solar Radioation", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(getActivity(),isi_solar.class);
                startActivity(pindah);
            }
        });
        menu_bare= (LinearLayout)view.findViewById(R.id.menu_bare);
        menu_bare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Bare Soil", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(getActivity(),isi_bare.class);
                startActivity(pindah);
            }
        });

        // hello.setOnClickListener(new View.OnClickListener() {
        //   @Override
        // public void onClick(View view) {
        //   Toast.makeText(getContext(),"Cl icked",Toast.LENGTH_SHORT).show();
        // }
        //});
        return view;
    }

}
