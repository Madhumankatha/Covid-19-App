package com.madhumankatha.covidtracker.demo;

import com.madhumankatha.covidtracker.demo.Covid;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("continents?yesterday&sort")
    Call<ArrayList<Covid>> getCovidList();
}
