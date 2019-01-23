package com.example.awsyogya;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


/**
 * A simple {@link Fragment} subclass.
 */
public class profil_staklim extends Fragment {
    private View view;
    private TextView sejarah;
    private TextView visimisi;
    private TextView tugas;


    public profil_staklim() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_profil_staklim, container, false);
        sejarah=view.findViewById(R.id.menu_sejarah);
        sejarah.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Sejarah", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(getActivity(),activity_sejarah.class);
                startActivity(pindah);
            }
        });
        visimisi=view.findViewById(R.id.menu_visimisi);
        visimisi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Visi dan Misi", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(getActivity(),activity_visimisi.class);
                startActivity(pindah);
            }
        });

        tugas=view.findViewById(R.id.menu_tugas);
        tugas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Tugas dan Fungsi", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(getActivity(),activity_tugas.class);
                startActivity(pindah);
            }
        });
        return view;
    }

}
