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
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final City city = mDataset[position];
        holder.mTextView.setText(city.getName());
        holder.mTextViewPopulation.setText(String.valueOf(city.getPopulation()));

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public final TextView mTextView;
        public final TextView mTextViewPopulation;
        public ViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.text_view);
            mTextViewPopulation = v.findViewById(R.id.text_population);
        }
    }
    // Provide a suitable constructor (depends on the kind of dataset)


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }
}
