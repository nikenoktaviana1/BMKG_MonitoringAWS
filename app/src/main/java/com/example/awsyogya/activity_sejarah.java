package com.example.awsyogya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activity_sejarah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);
        getSupportActionBar().setTitle("Sejarah");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
