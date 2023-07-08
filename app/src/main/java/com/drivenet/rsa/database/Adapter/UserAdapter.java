package com.drivenet.rsa.database.Adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.drivenet.rsa.R;
import com.drivenet.rsa.database.ExpandableListView.showman;
import com.drivenet.rsa.database.uni.g.uwj.uwj;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    Context context;
    List<uwj> list;

    int name;

    public UserAdapter(Context context , int name , List<uwj> list , DeleteItemClicklistner deleteItemClicklistner) {
        this.context = context;
        this.list = list;
        this.name = name;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.text_view_title.setText(list.get(position).getProgrammes());
        holder.text_view_description.setText(list.get(position).getUniversity());
        holder.text_view_priority.setText(String.valueOf(list.get(position).getAps()));
        holder.text_view_priority4.setText(String.valueOf(name));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context, list.getProfile(position).getProgrammes(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, showman.class);
                intent.putExtra("Programmes", list.get(position).getProgrammes());
                intent.putExtra("Note", list.get(position).getNotes());
                intent.putExtra("Requirements",list.get(position).getRequirements());
                intent.putExtra("Aps", String.valueOf(list.get(position).getAps()));
                intent.putExtra("Year", String.valueOf(list.get(position).getYear()));
                intent.putExtra("Careers",list.get(position).getCareers());
                intent.putExtra("University",list.get(position).getUniversity());
                intent.putExtra("MyAps", String.valueOf(name));
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView text_view_title, text_view_priority, text_view_description ,text_view_priority4;

        Button update, delete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text_view_description = itemView.findViewById(R.id.text_view_description);
            text_view_priority = itemView.findViewById(R.id.text_view_priority);
            text_view_title = itemView.findViewById(R.id.text_view_title);
            text_view_priority4 = itemView.findViewById(R.id.text_view_priority4);
        }
    }

    public interface DeleteItemClicklistner {
        void onItemDelete(int position, int id);
    }
}