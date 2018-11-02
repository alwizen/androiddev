package com.croxzz.alwizen.back;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class KeduaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("TESTTTTTT");

    }
}
