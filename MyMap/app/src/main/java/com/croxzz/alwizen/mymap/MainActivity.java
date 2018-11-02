package com.croxzz.alwizen.mymap;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_FINE_LOCATION)){
                Toast.makeText(this,"My Map membutuhkan ijin Lokasi",Toast.LENGTH_SHORT).show();
            }else {
                ActivityCompat.requestPermissions(this, new  String[]{Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION},1);
            }
        }else {
            Toast.makeText(this,"Ijin Diberikan", Toast.LENGTH_SHORT).show();
        }
    }
    public void openAutoPlace (View v){
        startActivity(new Intent(this,PlaceAutoCompleteActivity.class));
    }
    public void openDirectionMap (View v){
        startActivity(new Intent(this, DirectionActivity.class));
    }
    public void openOpang (View v){
        startActivity(new Intent(this, OpangActivity.class));
    }
}
