package com.drivenet.rsa.profile.application.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.Institutions.uniSA.wc.uct;
import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;

import java.util.ArrayList;

public class ApplicationAdapter extends RecyclerView.Adapter<ApplicationAdapter.ExampleViewHolder> {
    private ArrayList<ApplicationItem> mExampleList;

    private Context context;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        private TextView head1,head;



        public ExampleViewHolder(View itemView) {
            super(itemView);
            head1 = itemView.findViewById(R.id.head1);
            head = itemView.findViewById(R.id.head);

        }
    }

    public ApplicationAdapter(ArrayList<ApplicationItem> exampleList , Context context) {
        mExampleList = exampleList;
        this.context =context;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_date1 , parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ApplicationItem currentItem = mExampleList.get(position);

        holder.head1.setText(currentItem.getmText1());
        holder.head.setText(currentItem.getmText2());
        holder.head1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show(currentItem);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }



    private void show(ApplicationItem currentItem){

        if((currentItem.getmText1().equals("University of Cape Town")))
        {
            MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new uct()).addToBackStack(null).commit();
        }
    }

    public void filterList(ArrayList<ApplicationItem> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}