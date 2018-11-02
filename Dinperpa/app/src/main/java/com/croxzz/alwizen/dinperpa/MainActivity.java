package com.croxzz.alwizen.dinperpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.croxzz.alwizen.dinperpa.adapter.DataAdapter;
import com.croxzz.alwizen.dinperpa.api.JSONResponse;
import com.croxzz.alwizen.dinperpa.api.RequestInterface;
import com.croxzz.alwizen.dinperpa.model.Berita;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Berita> data;
    private DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        loadJSON();
    }

    private void loadJSON() {
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.6.21")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        RequestInterface requestInterface = retrofit.create(RequestInterface.class);
        Call<JSONResponse> call = requestInterface.getJSON();
        call.equals(new Callback<JSONResponse>() {
            @Override
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {
                JSONResponse jsonResponse = response.body();
                data = new ArrayList<>(Arrays.asList(jsonResponse.getBerita()));
                adapter = new DataAdapter(data);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }
}
