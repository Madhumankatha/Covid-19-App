package com.madhumankatha.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Covid> covidList;
    private CovidRecyclerView adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind ui using findViewById
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://corona.lmao.ninja/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        apiService.getCovidList().enqueue(new Callback<ArrayList<com.madhumankatha.covidtracker.Covid>>() {
            @Override
            public void onResponse(Call<ArrayList<com.madhumankatha.covidtracker.Covid>> call, Response<ArrayList<com.madhumankatha.covidtracker.Covid>> response) {
                if (response.isSuccessful()){
                    adapter = new CovidRecyclerView(response.body());
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<com.madhumankatha.covidtracker.Covid>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "No Internet!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}