package com.example.awsyogya;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
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
public class HomeFragment extends Fragment {
    private View view;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        TextView txTime = view.findViewById(R.id.home_waktu);
        txTime.setText(main.dataBmkg.getTanggal()+" "+main.dataBmkg.getJam());


        // hello.setOnClickListener(new View.OnClickListener() {
        //   @Override
        // public void onClick(View view) {
        //   Toast.makeText(getContext(),"Cl icked",Toast.LENGTH_SHORT).show();
        // }
        //});
        return view;
    }

}
