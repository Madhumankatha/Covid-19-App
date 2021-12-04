package com.madhumankatha.covidtracker;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("continents?yesterday&sort")
    Call<ArrayList<Covid>> getCovidList();

}
