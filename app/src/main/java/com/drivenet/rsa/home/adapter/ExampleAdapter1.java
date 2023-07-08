package com.drivenet.rsa.home.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.Institutions.prov.EasternCape;
import com.drivenet.rsa.Institutions.prov.FreeState;
import com.drivenet.rsa.Institutions.prov.Gauteng;
import com.drivenet.rsa.Institutions.prov.KwaZuluNatal;
import com.drivenet.rsa.Institutions.prov.Limpopo;
import com.drivenet.rsa.Institutions.prov.Mpumalanga;
import com.drivenet.rsa.Institutions.prov.NorthWest;
import com.drivenet.rsa.Institutions.prov.NorthernCape;
import com.drivenet.rsa.Institutions.prov.WesternCape;

import java.util.ArrayList;

public class ExampleAdapter1 extends RecyclerView.Adapter<ExampleAdapter1.ExampleViewHolder> {
    private ArrayList<ExampleItem1> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1;


        public ExampleViewHolder(View itemView) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.name);

        }
    }

    public ExampleAdapter1(ArrayList<ExampleItem1> exampleList) {
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_subandpro ,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem1 currentItem = mExampleList.get(position);


        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((currentItem.getText1().equals("Western Cape")))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new WesternCape()).addToBackStack(null).commit();
                }
                else if (currentItem.getText1().equals("Gauteng"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Gauteng()).addToBackStack(null).commit();

                }
                else if (currentItem.getText1().equals("KwaZulu-Natal")) {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new KwaZuluNatal()).addToBackStack(null).commit();

                }
                else if (currentItem.getText1().equals("Eastern Cape")) {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new EasternCape()).addToBackStack(null).commit();
                }
                else if (currentItem.getText1().equals("Northern Cape")) {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new NorthernCape()).addToBackStack(null).commit();
                }
                else if (currentItem.getText1().equals("Limpopo")) {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Limpopo()).addToBackStack(null).commit();

                }
                else if (currentItem.getText1().equals("North West"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new NorthWest()).addToBackStack(null).commit();

                }
                else if (currentItem.getText1().equals("Free State"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new FreeState()).addToBackStack(null).commit();

                }
                else if (currentItem.getText1().equals("Mpumalanga"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Mpumalanga()).addToBackStack(null).commit();

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<ExampleItem1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}