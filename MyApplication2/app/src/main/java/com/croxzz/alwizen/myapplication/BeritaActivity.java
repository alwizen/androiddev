package com.croxzz.alwizen.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeritaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Akttivitas Berita");

    }
}
