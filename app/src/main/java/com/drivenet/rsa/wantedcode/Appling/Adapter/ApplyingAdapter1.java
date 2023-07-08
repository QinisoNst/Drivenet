package com.drivenet.rsa.wantedcode.Appling.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;

import java.util.ArrayList;

public class ApplyingAdapter1 extends RecyclerView.Adapter<ApplyingAdapter1.ExampleViewHolder> {
    private ArrayList<ApplyingItem1> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView head1;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            head1 = itemView.findViewById(R.id.head1);

        }
    }

    public ApplyingAdapter1(ArrayList<ApplyingItem1> exampleList) {
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_search, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ApplyingItem1 currentItem = mExampleList.get(position);

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<ApplyingItem1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}