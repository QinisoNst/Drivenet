package com.drivenet.rsa.wantedcode.aps.showaps.port.ec.wsu;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.R;
import com.drivenet.rsa.database.ExpandableListView.showman;
import com.drivenet.rsa.database.uni.nc.spu.spu;

import java.util.List;


public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private List<spu> mExampleList;
    private Context context;
    int name;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        TextView text_view_title, text_view_priority, text_view_description ,text_view_priority4;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            text_view_description = itemView.findViewById(R.id.text_view_description);
            text_view_priority = itemView.findViewById(R.id.text_view_priority);
            text_view_title = itemView.findViewById(R.id.text_view_title);
            text_view_priority4 = itemView.findViewById(R.id.text_view_priority4);
        }
    }

    public ExampleAdapter(Context context, List<spu> exampleList, int name) {
        mExampleList = exampleList;
        this.context = context;
        this.name = name;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item,parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        spu currentItem = mExampleList.get(position);
        holder.text_view_title.setText(currentItem.getProgrammes());
        holder.text_view_description.setText(currentItem.getUniversity());
        holder.text_view_priority.setText(String.valueOf(currentItem.getAps()));
        holder.text_view_priority4.setText(String.valueOf(name));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context, currentItem.getProgrammes(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, showman.class);
                intent.putExtra("Programmes", currentItem.getProgrammes());
                intent.putExtra("Note", currentItem.getNotes());
                intent.putExtra("Requirements",currentItem.getRequirements());
                intent.putExtra("Aps", String.valueOf(currentItem.getAps()));
                intent.putExtra("Year", String.valueOf(currentItem.getYear()));
                intent.putExtra("Careers",currentItem.getCareers());
                intent.putExtra("University",currentItem.getUniversity());
                intent.putExtra("MyAps", String.valueOf(name));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return  mExampleList.size();
    }

    public void filterList(List<spu> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}