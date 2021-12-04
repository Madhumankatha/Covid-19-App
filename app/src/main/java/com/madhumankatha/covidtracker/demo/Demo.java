package com.madhumankatha.covidtracker.demo;

public class Demo {

    /*
    *
    * https://corona.lmao.ninja/v2/continents?yesterday&sort
    *
    * private RecyclerView recyclerView;
    private ArrayList<Covid> covidList;
    private CovidRecyclerView adapter;
    *
    * recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://corona.lmao.ninja/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService apiService = retrofit.create(APIService.class);

        apiService.getCovidList().enqueue(new Callback<ArrayList<Covid>>() {
            @Override
            public void onResponse(Call<ArrayList<Covid>> call, Response<ArrayList<Covid>> response) {
                if (response.isSuccessful()){
                    covidList = response.body();
                    Log.d("TAG", "onResponse: " + covidList.get(0).getCountryName());
                    Log.d("TAG", "onResponse: " + covidList.get(0).getCases());
                    Log.d("TAG", "onResponse: " + covidList.get(0).getRecovered());
                    adapter = new CovidRecyclerView(covidList, getApplicationContext());
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Covid>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "No Internet!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    *
    * */
}
