package com.madhumankatha.covidtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

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