package com.drivenet.rsa.setting.adapter;


import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.drivenet.rsa.MainActivity;
import com.drivenet.rsa.R;
import com.drivenet.rsa.setting.Username;
import com.drivenet.rsa.wantedcode.download.apply.Application;
import com.drivenet.rsa.wantedcode.download.career.prospectus;
import com.drivenet.rsa.wantedcode.aps.Aps;
import com.drivenet.rsa.ui.login.welcomelogin;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class CusAdapter1 extends RecyclerView.Adapter<CusAdapter1.MyViewHolder>
{
    private ArrayList personNames;
    private ArrayList personImages;
    private Context context;
    private RewardedAd mRewardedAd;
    private Activity activity;
    private static final String TAG = "SettingFragment";
    public CusAdapter1(Context context, ArrayList personNames, ArrayList personImages, Activity activity) {
        this.context = context;
        this.personNames = personNames;
        this.personImages = personImages;
        this.activity = activity;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout1, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(personNames.get(position).toString());
        holder.image.setImageResource(Integer.parseInt(personImages.get(position).toString()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText( context, personNames.getProfile(position).toString(), Toast.LENGTH_LONG).show();

                if(personNames.get(position).toString().equals("Username"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Username()).addToBackStack(null).commit();
                }
                else if(personNames.get(position).toString().equals("Subjects & Marks"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Aps()).addToBackStack(null).commit();
                }
                else if(personNames.get(position).toString().equals("Logout"))
                {
                    FirebaseAuth.getInstance().signOut();
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new welcomelogin()).addToBackStack(null).commit();
                }
                else if(personNames.get(position).toString().equals("Application Forms"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new Application()).addToBackStack(null).commit();
                }
                else if(personNames.get(position).toString().equals("Prospectus"))
                {
                    MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new prospectus()).addToBackStack(null).commit();
                }
                else if(personNames.get(position).toString().equals("Reward Points"))
                {
                    if (mRewardedAd != null) {
                        Activity activityContext = activity;
                        mRewardedAd.show(activityContext , new OnUserEarnedRewardListener() {
                            @Override
                            public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                                // Handle the reward.
                                Log.d(TAG , "The user earned the reward.");
                                int rewardAmount = rewardItem.getAmount();
                                String rewardType = rewardItem.getType();
                            }
                        });
                    } else {
                        Log.d(TAG , "The rewarded ad wasn't ready yet.");
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return personNames.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}

