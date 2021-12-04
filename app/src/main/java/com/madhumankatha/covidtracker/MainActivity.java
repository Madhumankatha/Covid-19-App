package com.madhumankatha.covidtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.madhumankatha.covidtracker.demo.APIService;
import com.madhumankatha.covidtracker.demo.Covid;
import com.madhumankatha.covidtracker.demo.CovidRecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tvCountryName, tvCases, tvRecovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCountryName = findViewById(R.id.tvCountryName);
        tvCases = findViewById(R.id.tvTotalCases);
        tvRecovered = findViewById(R.id.tvTotalRecovered);

        tvCountryName.setText("Asia");
        tvCases.setText("12773");
        tvRecovered.setText("165739");

    }
}