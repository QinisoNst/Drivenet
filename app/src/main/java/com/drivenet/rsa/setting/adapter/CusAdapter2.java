package com.drivenet.rsa.setting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.drivenet.rsa.R;

import java.util.ArrayList;

public class CusAdapter2 extends RecyclerView.Adapter<CusAdapter2.MyViewHolder> {
    ArrayList personNames;
    ArrayList personemail;
    ArrayList personphone;

    ArrayList personImages;
    Context context;
    public CusAdapter2(Context context, ArrayList personNames, ArrayList personImages,ArrayList personemail,ArrayList personphone) {
        this.context = context;
        this.personNames = personNames;
        this.personImages = personImages;
        this.personemail = personemail;
        this.personphone = personphone;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(personNames.get(position).toString());
        holder.email.setText(personemail.get(position).toString());
        holder.phone.setText(personphone.get(position).toString());
        holder.image.setImageResource(Integer.parseInt(personImages.get(position).toString()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    @Override
    public int getItemCount() {
        return personNames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,email,phone;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            email = (TextView) itemView.findViewById(R.id.email);
            phone = (TextView) itemView.findViewById(R.id.phone);

            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
