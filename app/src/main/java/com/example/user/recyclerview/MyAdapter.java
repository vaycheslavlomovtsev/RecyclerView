package com.example.user.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 16.10.17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private City[] mDataset = new City[0];

    public void setmDataset(City[] mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final City city = mDataset[position];
        holder.mTextViewName.setText(city.getName());
        holder.mTextViewPopulation.setText(String.valueOf(city.getPopulation()));

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mTextViewName;
        public final TextView mTextViewPopulation;

        public ViewHolder(View v) {
            super(v);
            mTextViewName = v.findViewById(R.id.name_textview);
            mTextViewPopulation = v.findViewById(R.id.population_textview);
        }
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }
}
