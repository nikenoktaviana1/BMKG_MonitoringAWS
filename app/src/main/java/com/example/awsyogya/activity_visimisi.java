package com.example.awsyogya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_visimisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visimisi);
        getSupportActionBar().setTitle("Visi dan Misi");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
