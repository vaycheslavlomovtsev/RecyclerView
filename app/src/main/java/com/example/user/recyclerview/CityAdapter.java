package com.example.user.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by user on 16.10.17.
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {
    private City[] Dataset = new City[0];

    public void setDataset(City[] Dataset) {
        this.Dataset = Dataset;
        this.notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final City city = Dataset[position];
        holder.TextViewName.setText(city.getName());
        holder.TextViewPopulation.setText(String.valueOf(city.getPopulation()));
        holder.TextViewName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"В городе " + city.getName() + " проживает " +
                        city.getPopulation() + " человек.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return Dataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView TextViewName;
        public final TextView TextViewPopulation;

        public ViewHolder(View v) {
            super(v);
            TextViewName = v.findViewById(R.id.name_textview);
            TextViewPopulation = v.findViewById(R.id.population_textview);
        }
    }


    @Override
    public CityAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }
}
