package com.madhumankatha.covidtracker.demo;

import com.google.gson.annotations.SerializedName;

public class Covid {

    @SerializedName("continent")
    private String countryName;

    @SerializedName("cases")
    private String cases;

    @SerializedName("recovered")
    private String recovered;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }
}


