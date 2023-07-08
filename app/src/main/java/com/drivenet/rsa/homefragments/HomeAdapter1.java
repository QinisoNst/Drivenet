package com.drivenet.rsa.homefragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.drivenet.rsa.wantedcode.Appling.ApplyingS;
import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.wantedcode.careers.Career1;
import com.drivenet.rsa.wantedcode.download.download;
import com.drivenet.rsa.wantedcode.dates.Dates;
import com.drivenet.rsa.wantedcode.aps.showaps.ShowAps;
import com.drivenet.rsa.Institutions.universitiesD;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;

public class HomeAdapter1 extends RecyclerView.Adapter<HomeAdapter1.ExampleViewHolder> {
    private ArrayList<HomeItem1> mExampleList;
    private Context context;
    private FirebaseAnalytics mFirebaseAnalytics;
    private static final String TAG = "Aps1";
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView head1;
        public TextView sub1;


        public ImageView imageView;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            head1 = itemView.findViewById(R.id.head1);
            sub1 = itemView.findViewById(R.id.sub1);


            imageView = itemView.findViewById(R.id.image);
        }
    }

    public HomeAdapter1(ArrayList<HomeItem1> exampleList , Context context) {
        mExampleList = exampleList;
        this.context = context;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lo_home ,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }


    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        HomeItem1 currentItem = mExampleList.get(position);


        holder.head1.setText(currentItem.getmText1());
        holder.sub1.setText(currentItem.getmText2());


        holder.imageView.setImageResource(currentItem.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
             //   Toast.makeText( context, currentItem.getmText1().toString(), Toast.LENGTH_LONG).show();
                if(currentItem.getmText1().toString().equals("APS"))
                {
                    Login(v,currentItem.getmText1());
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ShowAps()).addToBackStack(null).commit();
                }
                else if(currentItem.getmText1().toString().equals("Institutions"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new universitiesD()).addToBackStack(null).commit();
                }
                else if(currentItem.getmText1().toString().equals("Career"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Career1()).addToBackStack(null).commit();
                }
                else if(currentItem.getmText1().toString().equals("Dates"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Dates()).addToBackStack(null).commit();
                }
                else if(currentItem.getmText1().toString().equals("Downloads"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new download()).addToBackStack(null).commit();
                }
                else if(currentItem.getmText1().toString().equals("Application"))
                {
                    Login(v,"Application");
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new ApplyingS()).addToBackStack(null).commit();
                }
            }
        });
    }

    public void Login(View v , String research)
    {
        Bundle params =  new Bundle();
        params.putInt("ButtionID",v.getId());
        String btnName = "";
        if (research.equals("Application")) {

            btnName = "btn_application";
        }
        Log.d(TAG,"Button clicked"+btnName+params);
        home(btnName,params);
    }
    public void home(String btnName , Bundle params)
    {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);

        mFirebaseAnalytics.logEvent(btnName ,params);
    }
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }

    public void filterList(ArrayList<HomeItem1> filteredList) {
        mExampleList = filteredList;
        notifyDataSetChanged();
    }
}