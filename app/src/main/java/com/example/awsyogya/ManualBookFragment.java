package com.example.awsyogya;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ManualBookFragment extends Fragment {
    private View view;
    private Button play;
    private VideoView video;


    public ManualBookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_manual_book, container, false);
        video = view.findViewById(R.id.videoView);

        play = view.findViewById(R.id.button);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaController media = new MediaController(getContext());
                Uri lokasivideo = Uri.parse("android.resource://" + getContext().getPackageName()+"/"+R.raw.video);
                video.setVideoURI(lokasivideo);
                video.setMediaController(media);
                media.setAnchorView(video);
                video.start();
                video.requestFocus();
            }
        });

        return view;
    }




}
