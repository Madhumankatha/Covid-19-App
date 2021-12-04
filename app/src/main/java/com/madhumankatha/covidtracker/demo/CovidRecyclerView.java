package com.madhumankatha.covidtracker.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.madhumankatha.covidtracker.R;

import java.util.ArrayList;

public class CovidRecyclerView extends RecyclerView.Adapter<CovidRecyclerView.ViewHolder> {
    private ArrayList<Covid> covidList;
    private Context context;

    public CovidRecyclerView(ArrayList<Covid> covidList, Context context) {
        this.covidList = covidList;
        this.context = context;
    }

    @NonNull
    @Override
    public CovidRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_holder,viewGroup,false);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidRecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.tvCountryName.setText(covidList.get(i).getCountryName());
        viewHolder.tvCases.setText(covidList.get(i).getCases());
        viewHolder.tvRecovered.setText(covidList.get(i).getRecovered());
    }

    @Override
    public int getItemCount() {
        return covidList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvCountryName, tvCases, tvRecovered;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCountryName = itemView.findViewById(R.id.tvCountryName);
            tvCases = itemView.findViewById(R.id.tvTotalCases);
            tvRecovered = itemView.findViewById(R.id.tvTotalRecovered);
        }
    }
}
